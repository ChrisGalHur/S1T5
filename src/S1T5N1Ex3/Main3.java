package S1T5N1Ex3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		/*- Exercici 3
		Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un fitxer TXT.*/
		
		Scanner scan = new Scanner(System.in);
		String extensiones[] = {".txt",".rar",".odp",".xls",};
		
		String directorioUser;
		
		System.out.println("Dime el directorio");
		directorioUser = scan.nextLine();
		System.out.println("");
		
		File dir = new File(directorioUser);
		File[] ficheros = dir.listFiles();
			
		if (ficheros == null) {
			  System.out.println("No hay ficheros en el directorio especificado");
		}else { 
			printa(dir,0);	
		}
		
	}
	
	private static void printa(File direct, Integer iLevel) {
		SimpleDateFormat fecha = new SimpleDateFormat();
		String ruta;
		
		for(int i = 0; i < iLevel; i++) {
			guardar("-");
		}
		if(direct.isDirectory()) {
			ruta = direct.getName() + "(D) " + fecha.format(direct.lastModified());
			guardar(ruta);
		}else if(direct.isFile()) {
			ruta = direct.getName() + "(F) " + fecha.format(direct.lastModified());
			guardar(ruta);
		}

		if(direct.isDirectory()){
			File[] arrFiles = direct.listFiles();//Subdirectorio
			for(File fileItem : arrFiles){
				printa(fileItem, iLevel++);
			}
		}
		
	}
	
	private static void guardar(String dato) {
		String resposta = "";
		Boolean fet = false;
		try{
            FileWriter fichero = new FileWriter("Directorio.txt", true);
            PrintWriter pw = new PrintWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fichero);
            
           	pw.println(dato);
           	fichero.close();
        }catch(Exception e) {
        	resposta = "No se ha podido guardar el registro.";
        	fet = true;
        }
		System.out.println(resposta);
	}	
	
}
