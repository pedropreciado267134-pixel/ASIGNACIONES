package asignacion02 ;

public class Main {

    public static void main ( String [ ] args ) {

        
        Cilindro c = new CilindroImp ( 5 , 10 ) ;
        System.out.println ( c.toString ( ) ) ;
        System.out.println ( "Area: " + c.area ( ) ) ;
        System.out.println ( "Volumen: " + c.volumen ( ) ) ;

        
        Bolsa b = new BolsaImp ( 5 ) ;
        b.agrega ( 10 ) ;
        b.agrega ( 20 ) ;
        b.agrega ( 30 ) ;
        System.out.println ( "Bolsa: " + b.toString ( ) ) ;

        b.remueve ( 20 ) ;
        System.out.println ( "Despues de remover 20: " + b.toString ( ) ) ;

        System.out.println ( "Contiene 10? " + b.contiene ( 10 ) ) ;
        System.out.println ( "Numero de objetos: " + b.obtenNumObjetos ( ) ) ;

        b.limpia ( ) ;
        System.out.println ( "Bolsa despues de limpiar: " + b.toString ( ) ) ;
    }
}
