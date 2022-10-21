package S1T5N1Ex1;

import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main1 {

	public static void main(String[] args) {
		/*- Exercici 1
		Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.*/
		
		File dir = new File(args[0]);
		String[] ficheros = dir.list();
			
		if (ficheros == null) {
			  System.out.println("No hay ficheros en el directorio especificado");
		}else { 
			for(String fileItem : ficheros) {
				System.out.println(fileItem);
			}
		}
		
	}

}
