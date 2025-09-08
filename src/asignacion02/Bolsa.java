package asignacion02 ;

public abstract class Bolsa {

    protected int tamBolsa ;
    protected int numObjetos ;

    public abstract int obtenNumObjetos ( ) ;

    public abstract boolean vacia ( ) ;

    public abstract void agrega ( Integer objeto ) ;

    public abstract Integer remueve ( ) ;

    public abstract Integer remueve ( Integer objeto ) ;

    public abstract void limpia ( ) ;

    public abstract int cuenta ( Integer objeto ) ;

    public abstract boolean contiene ( Integer objeto ) ;

    public abstract Integer [ ] obtenObjetos ( ) ;

    public abstract String toString ( ) ;

}
