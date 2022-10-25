package S1T5N1Ex5;

import java.io.*;

import javax.swing.DefaultBoundedRangeModel;

public class Main5 {

	public static void main(String[] args) {
	
		/*- Exercici 5
		Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.*/
		
		SenorDeLosAnillos lacomunidaddelanillo = new SenorDeLosAnillos(167, 
				"Un anillo para encontrarlos, un Anillo para atraerlos a todos y atarlos en las tinieblas ...");
		lacomunidaddelanillo.getRepartiment().add("Orlando Bloom");
		lacomunidaddelanillo.getRepartiment().add("Viggo Mortensen");
		lacomunidaddelanillo.getRepartiment().add("Ian McKellen");
		
		serialitzarObjecte(lacomunidaddelanillo);
		desserialitzarObjecte();
	}
	
	public static void serialitzarObjecte(Object obj) {
		try{   
            //Creem un file y li diem que el pot sobreescriure
            FileOutputStream file = new FileOutputStream("Serializats.ser", true);
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            //Métode per serialitzar l'Objecte
            out.writeObject(obj);
            
            //Tanquem el fitxer
            out.close();
            file.close();
            
            System.out.println("He serialitzat l'objecte.");
        }catch(IOException ex){
            System.out.println("No existeix el fitxer.");
        }
	}
	
	public static void desserialitzarObjecte() {
		SenorDeLosAnillos desserialitzant = null;
		try{   
            //Llegim l'arxiu
            FileInputStream file = new FileInputStream("Serializats.ser");
            ObjectInputStream in = new ObjectInputStream(file);
              
            //Desserialitzem l'objecte
            desserialitzant = (SenorDeLosAnillos)in.readObject();
            
            //Tanquem el fitxer
            in.close();
            file.close();
              
            System.out.println("He desserialitzat l'objecte\n"
            		+ "");
            System.out.println("Milions de presupost = " + desserialitzant.getPresupuesto());
            System.out.println("Guió = " + desserialitzant.getGuio());
            System.out.println("Legolas = " + desserialitzant.getRepartiment().get(0));
            System.out.println("Aragorn = " + desserialitzant.getRepartiment().get(1));
            System.out.println("Gandalf = " + desserialitzant.getRepartiment().get(2));
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
  
	}
	
}
