package S1T5N1Ex2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {
		/*- Exercici 2
		Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris
		amb el contingut de tots els seus nivells (recursivament)
		de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant a més
		si és un directori (D) o un fitxer (F), i la seva última data de modificació.*/	
		
		File dir = new File(args[0]);
		File[] ficheros = dir.listFiles();
			
		if (ficheros == null) {
			  System.out.println("No hay ficheros en el directorio especificado");
		}else { 
			print(dir,0);	
		}
		
	}
	
	private static void print(File direct, Integer iLevel) {
		SimpleDateFormat fecha = new SimpleDateFormat();
		
		for(int i = 0; i < iLevel; i++) {
			System.out.print("-");
		}
		if(direct.isDirectory()) {
			System.out.println(direct.getName() + "(D) " + fecha.format(direct.lastModified()));
		}else if(direct.isFile()) {
			System.out.println(direct.getName() + "(F) " + fecha.format(direct.lastModified()));
		}

		if(direct.isDirectory()){
			File[] arrFiles = direct.listFiles();//Subdirectorio
			for(File fileItem : arrFiles){
				print(fileItem, iLevel++);
			}
		}
		
	}

}
