public class Visita extends Turismo{

private int cantidadPases;
private float precioPase;
private float totalVisita;
private String nombreMuseo;

@Override
public void asignar(int dato1){
if(dato1 == 1) precioPase = 60;
else if(dato1 == 2) precioPase = 50;
}

@Override
public void cobro(int cantidadPases){
totalVisita = precioPase * cantidadPases;
}

//idea: en lugar de usar metodos set, invocar unicamente los metodos abstractos
@Override
public void impresion( ){
System.out.println("\n****************** <Recibo Museo> ******************");
System.out.println("Nombre museo: " + nombreMuseo);
System.out.println("Precio pase: " + precioPase);
System.out.println("Total visita: " + totalVisita);
}

public void setCantidadPases(int cantidadPases){
this.cantidadPases = cantidadPases;
}

public void setPrecioPase(float precioPase){
this.precioPase = precioPase;
}

public void setTotalVisita(float totalVisita){
this.totalVisita = totalVisita;
}

public void setNombreMuseo(String nombreMuseo){
this.nombreMuseo = nombreMuseo;
}

public int getCantidadPases( ){
return cantidadPases;
}

public float getPrecioPase( ){
return precioPase;
}

public float getTotalVisita( ){
return totalVisita;
}

public String getNombreMuseo( ){
return nombreMuseo;
}

}