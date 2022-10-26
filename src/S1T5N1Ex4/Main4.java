package S1T5N1Ex4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {

	private static int count = 0;
	
	public static void main(String[] args) {
		/*- Exercici 4
		Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.*/

		File dirMain;
		String m = args[0];
		String arbreMain = "";
		
		dirMain = llegirFitxer(m);
		if(dirMain.getName().contains(".txt")) {
			llegirTxt(dirMain);
		}else {
			arbreMain += ferArbreArchius(dirMain, arbreMain, 0);
		}
		
	}

	public static File llegirFitxer(String a) {
		File dir = new File(a);
		File[] ficheros = dir.listFiles();
			
		if (ficheros == null && dir.getName().contains(".txt") == false) {
			  System.out.println("No hay ficheros en el directorio especificado");
		}
	return dir;
	}
	
	public static String ferArbreArchius(File fileATreballar, String arbre, Integer iLevel) {
		SimpleDateFormat fecha = new SimpleDateFormat();
		
		for(int i = 0; i < iLevel; i++) {
			if(arbre.equalsIgnoreCase("")) {
				count++;
				for(int a = 0; a < count; a++) {
					arbre += "-";
				}
			}
		}
		if(fileATreballar.isDirectory()) {
			guardarRegistre(arbre + fileATreballar + "(D) " + fecha.format(fileATreballar.lastModified()) + "\n");
		}else if(fileATreballar.isFile()) {
			guardarRegistre(arbre + fileATreballar + "(F) " + fecha.format(fileATreballar.lastModified()) + "\n");
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
	
	public static void guardarRegistre(String guardar) {
		
		try{
            FileWriter fichero = new FileWriter("Directorio.txt", true);
            PrintWriter pw = new PrintWriter(fichero);
            
           	pw.println(guardar);
           	fichero.close();
        }catch(Exception e) {
        	System.out.println("No se ha podido guardar el registro.");
       
        }
	}
	
	public static void llegirTxt(File llegir) {
		FileReader fr = null;
		BufferedReader br = null;
	      
		try {
			fr = new FileReader (llegir);
			br = new BufferedReader(fr);
			
			String linea;
			while((linea = br.readLine()) != null)
	            System.out.println(linea);
			
		fr.close();
		}catch(IOException e){
			System.out.println("No puedo leer el archivo");
		}	
		
	}
	
}