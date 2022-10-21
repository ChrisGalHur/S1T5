package S1T5N1Ex2;

import java.io.File;
import java.util.Scanner;

public class Pr {

	public static void main(String[] args) {
		//Uso esta clase para hacer pruebas
		
		Scanner scan = new Scanner(System.in);
		String directorioUser;
		System.out.println("Dime el directorio");
		directorioUser = scan.nextLine();
		System.out.println("");
		File dir = new File(directorioUser);
		System.out.println(dir.getParentFile());
		printa(dir, 0);
		

	}
	
	private static void printa(File dir, Integer iLevel) {
		for(int i=0;i<iLevel;i++) {
			System.out.print("-");
		}
		System.out.println(dir.getName());

		if(dir.isDirectory()){
			File[] arrFiles = dir.listFiles();        //Subdirectorio
			for(File fileItem : arrFiles){
				printa(fileItem, iLevel++);
			}
		}
		
	}

}
