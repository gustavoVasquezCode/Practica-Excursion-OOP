public class Recorrido extends Turismo{

private int asientoInicial;
private int cantidadAsientos;
private float precioBoleto;
private float totalRecorrido;
private String nombreRecorrido;

@Override
public void asignar(int asientoInicial){
if(asientoInicial >= 0){
precioBoleto = precioBoleto * asientoInicial;
}
else
precioBoleto = 0;
}

@Override
public void cobro(int cantidadAsientos){
totalRecorrido = precioBoleto * cantidadAsientos;
}

@Override
public void impresion( ){
System.out.println("\n****************** <Recibo Recorrido> ******************");
System.out.println("Nombre del recorrido: " + nombreRecorrido);
System.out.println("Precio total recorrido: " + totalRecorrido);
}

public void setAsientoInicial(int asientoInicial){
this.asientoInicial = asientoInicial;
}

public void setCantidadAsientos(int cantidadAsientos){
this.cantidadAsientos = cantidadAsientos;
}

public void setPrecioBoleto(float precioBoleto){
this.precioBoleto = precioBoleto;
}

public void setTotalRecorrido(float totalRecorrido){
this.totalRecorrido = totalRecorrido;
}

public void setNombreRecorrido(String nombreRecorrido){
this.nombreRecorrido = nombreRecorrido;
}

public int getAsientoInicial( ){
return asientoInicial;
}

public int getCantidadAsientos( ){
return cantidadAsientos;
}

public float getPrecioBoleto( ){
return precioBoleto;
}

public float getTotalRecorrido( ){
return totalRecorrido;
}

public String getNombreRecorrido( ){
return nombreRecorrido;
}

}