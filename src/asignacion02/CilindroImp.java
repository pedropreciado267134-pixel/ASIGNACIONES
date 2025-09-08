package asignacion02 ;

public class CilindroImp extends Cilindro {

    public CilindroImp ( double radio , double altura ) {
        if ( radio < 0 || altura < 0 ) {
            throw new IllegalArgumentException ( "radio o altura negativos" ) ;
        }
        this.radio = radio ;
        this.altura = altura ;
    }

    public double area ( ) {
        return 2 * Math.PI * radio * ( radio + altura ) ;
    }

    public double volumen ( ) {
        return Math.PI * radio * radio * altura ;
    }

    public String toString ( ) {
        return "Cilindro(" + radio + ", " + altura + ")" ;
    }

}
