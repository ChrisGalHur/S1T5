package S1T5N1Ex3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Ma3 {

	public static void main(String[] args) {
		/*- Exercici 3
		Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un fitxer TXT.*/
		
		//Le he dado la vuelta a todo para que quede más limpio
		
		File dirMain;
		ArrayList<String> arrayGuardar = new ArrayList<String>();
		
		dirMain = llegirFitxer(args);
		arrayGuardar = ferArbreArchius(dirMain, 0);
		guardarRegistre(dirMain);
	}

	public static File llegirFitxer(String[] a) {
		File dir = new File(a);
		File[] ficheros = dir.listFiles();
			
		if (ficheros == null) {
			  System.out.println("No hay ficheros en el directorio especificado");
		}
		return dir;
	}
	
	public static ArrayList ferArbreArchius(File fileATreballar, Integer iLevel) {
		SimpleDateFormat fecha = new SimpleDateFormat();
		ArrayList<String> loca = new ArrayList<>();

		for(int i = 0; i < iLevel; i++) {
			loca.add("-");
		}
		if(fileATreballar.isDirectory()) {
			loca.add(fileATreballar.getName() + "(D) " + fecha.format(fileATreballar.lastModified()));
		}else if(fileATreballar.isFile()) {
			loca.add(fileATreballar.getName() + "(F) " + fecha.format(fileATreballar.lastModified()));
		}

		if(fileATreballar.isDirectory()){
			File[] arrFiles = fileATreballar.listFiles();//Subdirectorio
			for(File fileItem : arrFiles){
				ferArbreArchius(fileItem, iLevel++);
			}
		}
		
		return loca;
	}
	
	public static void guardarRegistre(File datosGuardar) {
		String resposta = "";
		Boolean fet = false;
		
		try{
            FileWriter fichero = new FileWriter("Directorio\\Registro.txt", true);
            PrintWriter pw = new PrintWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fichero);
            
           	pw.println(datosGuardar);
           	fichero.close();
        }catch(Exception e) {
        	resposta = "No se ha podido guardar el registro.";
        	fet = true;
        }
		System.out.println(resposta);
	}
	
}
