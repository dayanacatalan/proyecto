
package agendakt;
import java.util.Scanner;

public class Agendakt {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("De cuantos contactos desea su Agenda?: ");
int tam = s.nextInt();
String nombres[] = new String[tam];
int telefonos[] = new int[tam]; 
int opcion = 0;
do{
System.out.println("Menú");
System.out.println("1: Agregue un Contacto a su Agenda");
System.out.println("2: Busque por su código");
System.out.println("3: Mostrar todos los contactos");
System.out.println("4: Mostrar solo el Primero");
System.out.println("5: Salir");
opcion=s.nextInt();
switch (opcion){
    
case 1:
int pos;
String nombre;
int numero;
System.out.println("Ingrese el Código: ");
pos=s.nextInt();
System.out.println("Ingrese el Nombre: ");
nombre=s.next();
System.out.println("Ingrese el Número: ");
numero=s.nextInt();
nombres[pos]=nombre;
telefonos[pos]=numero;
break;

case 2:
int pos2;
System.out.println("Ingrese el código para su búsquedad:");
pos2 = s.nextInt();
System.out.println(nombres[pos2]+" - "+telefonos[pos2]);
break;

case 3:
for(int i=0; i<nombres.length; i++){
System.out.println(nombres[i]+" - "+telefonos[i]);}
break;
				
case 4:
System.out.println("");
break;
default:
System.out.println("Opcion invalida");
break;}

case 5:
int pos2;
System.out.println("Desea mostrar el primero:");
pos2 = s.nextInt();
System.out.println(nombres[pos2]+" - "+telefonos[pos2]);
break;
}while(opcion != 5);
}

}
    
    
    
    

