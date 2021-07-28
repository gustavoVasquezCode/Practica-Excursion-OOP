public abstract class Turismo{

private float total;

//métodos abstractos (no se implementan)
public abstract void cobro(int dato1);
protected abstract void impresion( );
protected abstract void asignar(int dato2);

public void setTotal(float total){
this.total = total;
}

public float getTotal( ){
return total;
}

}