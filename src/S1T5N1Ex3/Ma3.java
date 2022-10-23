package S1T5N1Ex3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
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
		String m = args[0];
		
		dirMain = llegirFitxer(m);
		ArrayList arRbre = new ArrayList<>();
		arRbre = ferArbreArchius(dirMain, arRbre, 0);
	}

	public static File llegirFitxer(String a) {
		File dir = new File(a);
		File[] ficheros = dir.listFiles();
			
		if (ficheros == null) {
			  System.out.println("No hay ficheros en el directorio especificado");
		}
		return dir;
	}
	
	public static ArrayList ferArbreArchius(File fileATreballar, ArrayList arbre, Integer iLevel) {
		SimpleDateFormat fecha = new SimpleDateFormat();

		for(int i = 0; i < iLevel; i++) {
			guardarRegistre("-");
		}
		if(fileATreballar.isDirectory()) {
			guardarRegistre(fileATreballar.getName() + "(D) " + fecha.format(fileATreballar.lastModified()));
		}else if(fileATreballar.isFile()) {
			guardarRegistre(fileATreballar.getName() + "(F) " + fecha.format(fileATreballar.lastModified()));
		}
		if(fileATreballar.isDirectory()){
			File[] arrFiles = fileATreballar.listFiles();//Subdirectorio
			for(File fileItem : arrFiles){
				iLevel++;
				ferArbreArchius(fileItem, arbre, iLevel);
			}
		}
		return arbre;
	}
	
	public static void guardarRegistre(String datoGuardar) {
		String resposta = "";
		
		try{
            FileWriter fichero = new FileWriter("Directorio.txt", true);
            PrintWriter pw = new PrintWriter(fichero);
            
           	pw.println(datoGuardar);
           	fichero.close();
        }catch(Exception e) {
        	resposta = "No se ha podido guardar el registro.";
        }
		System.out.println(resposta);
	}
	
}
