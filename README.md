<h1 align="center"> LLEGIR FITXERS Y ESCRIURE'LS </h1>

Per obrir tots el excercicis ho farem desde la consola de comandes (Presionarem la tecla Windows, escriurem "cmd" y presionarem INTRO) una vegada oberta la consola de comandes anirem fins on es troba l'excercici java que volem obrir escribint "cd (ubicació de l'exercici java)".
Una vegada arribem a la ubicació de l'exercici que volem obrir escriurem:
<h4>java &nbsp; Main1.java &nbsp C:\Java = (tipus de arxiu que volem obrir) &nbsp; (nom de l'exercici a obrir) &nbsp (paràmetre a utilizar)</h4>
<br/>
<h2>S1T5N1Ex1 - Llistar alfabèticament</h2> 
Obrim Main1 y li donarem per paràmetre la carpeta a obrir. El programa ens retornará els arxius que hi hagi en aquesta carpeta ordenats alfabeticament.
Exemple: java Main1.java C:\Program Files
  
<h2>S1T5N1Ex2 - Arbre d'ubicacions</h2>
Obrim Main2 y li donarem per paràmetre la carpeta a obrir. El programa ens retornará un arbre indicant què hi ha dins de cada carpeta y ens ajudarà a diferenciar els fitxers (F) dels directoris (D).
Exemple:  java Main2.java C:\Program Files\Java

<h2>S1T5N1Ex3 - Arbre en un arxiu .txt</h2>
Obrim Main3 y li donarem per paràmetre la carpeta a obrir. El programa ens guardarà un arxiu .txt amb l'arbre que ens retornaba a l'excercici anterior.
  
  
<h2>S1T5N1Ex4 - Afegit mostrar .txt</h2>
Obrim Main4 y li donarem per paràmetre la carpeta a obrir:<br/> 
- Si li donem per paràmetre un directori ens guardarà un arxiu .txt amb l'arbre del exercicis anteriors.<br/>
 &nbsp; Exemple: java Main2.java C:\Program &nbsp; Files\Java<br/>
- Si li donem per paràmetre un arxiu .txt el llegirà i ens el mostrarà per pantalla. <br/>
 &nbsp; Exemple: java Main4.java C:\Java\eclipse-workspace\S1T5\Directori.txt

<h2>S1T5N1Ex5 - Serialitzar un fitxer .txt</h2>
Obrim Main5 sense donar-li cap paràmetre. El programa guardará la serialització d'un objecte i inmediatament el desserielitzarà mostrant per pantalla totes les seves variables. Exemple: java Main4.java
