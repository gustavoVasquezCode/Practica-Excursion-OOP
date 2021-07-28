import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MainExcursion{
public static void main(String[ ] args) throws IOException{

boolean valorLogico = true;
int opc;

Recorrido obj1 = new Recorrido( );
Visita obj2 = new Visita( );

InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader reader = new BufferedReader(ent);

while(valorLogico){
System.out.println("\n\n*************** <EXCURSIONES> ***************");
System.out.println("Seleccione una opcion del menu: " +
		"\n1. Recorrido en ferrocarril." +
		"\n2. Visitar museo." +
		"\n3. Salir.");
System.out.print("\nOpcion: ");
opc = Integer.valueOf(reader.readLine( )).intValue( );

if(opc == 1){
System.out.println("\n*************** <Recorrido Ferrocarril> ***************");
System.out.print("Ingrese el nombre del recorrido: ");
obj1.setNombreRecorrido(reader.readLine( ));
System.out.print("Asigna el precio del boleto: ");
obj1.setPrecioBoleto(Float.valueOf(reader.readLine( )).floatValue( ));
System.out.print("Establece la estacion inicial: ");
obj1.asignar(Integer.valueOf(reader.readLine( )).intValue( ));
System.out.print("Asignar el numero de asientos: ");
obj1.cobro(Integer.valueOf(reader.readLine( )).intValue( ));
obj1.impresion( );
}
else if(opc == 2){
System.out.println("\n*************** <Visita museo> ***************");
System.out.print("Ingrese el nombre del museo: ");
obj2.setNombreMuseo(reader.readLine( ));
System.out.print("Seleccione el tipo de pase [1:Premium, 2:Basico]: ");
obj2.asignar(Integer.valueOf(reader.readLine( )).intValue( ));
System.out.print("Ingrese el numero de pases: ");
obj2.cobro(Integer.valueOf(reader.readLine( )).intValue( ));
obj2.impresion( );
}
else if(opc == 3)
valorLogico = false;
else
System.out.println("Error. La opcion no existe.");
}

}
}