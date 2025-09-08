package asignacion02 ;

import java.util.Random ;

public class BolsaImp extends Bolsa {

    private Integer [ ] objetos ;

    public BolsaImp ( int tamBolsa ) {
        if ( tamBolsa < 0 ) {
            throw new BolsaException ( "tamaño negativo" ) ;
        }
        this.tamBolsa = tamBolsa ;
        this.numObjetos = 0 ;
        this.objetos = new Integer [ tamBolsa ] ;
    }

    public int obtenNumObjetos ( ) {
        return numObjetos ;
    }

    public boolean vacia ( ) {
        return numObjetos == 0 ;
    }

    public void agrega ( Integer objeto ) {
        if ( numObjetos >= tamBolsa ) {
            throw new BolsaException ( "bolsa llena" ) ;
        }
        objetos [ numObjetos ] = objeto ;
        numObjetos ++ ;
    }

    public Integer remueve ( ) {
        if ( vacia ( ) ) {
            throw new BolsaException ( "bolsa vacía" ) ;
        }
        java.util.Random r = new Random ( ) ;
        int pos = r.nextInt ( numObjetos ) ;
        Integer eliminado = objetos [ pos ] ;
        for ( int i = pos ; i < numObjetos - 1 ; i ++ ) {
            objetos [ i ] = objetos [ i + 1 ] ;
        }
        numObjetos -- ;
        objetos [ numObjetos ] = null ;
        return eliminado ;
    }

    public Integer remueve ( Integer objeto ) {
        if ( vacia ( ) ) {
            throw new BolsaException ( "bolsa vacía" ) ;
        }
        for ( int i = 0 ; i < numObjetos ; i ++ ) {
            if ( objetos [ i ].equals ( objeto ) ) {
                Integer eliminado = objetos [ i ] ;
                for ( int j = i ; j < numObjetos - 1 ; j ++ ) {
                    objetos [ j ] = objetos [ j + 1 ] ;
                }
                numObjetos -- ;
                objetos [ numObjetos ] = null ;
                return eliminado ;
            }
        }
        return null ;
    }

    public void limpia ( ) {
        for ( int i = 0 ; i < numObjetos ; i ++ ) {
            objetos [ i ] = null ;
        }
        numObjetos = 0 ;
    }

    public int cuenta ( Integer objeto ) {
        int c = 0 ;
        for ( int i = 0 ; i < numObjetos ; i ++ ) {
            if ( objetos [ i ].equals ( objeto ) ) {
                c ++ ;
            }
        }
        return c ;
    }

    public boolean contiene ( Integer objeto ) {
        for ( int i = 0 ; i < numObjetos ; i ++ ) {
            if ( objetos [ i ].equals ( objeto ) ) {
                return true ;
            }
        }
        return false ;
    }

    public Integer [ ] obtenObjetos ( ) {
        Integer [ ] copia = new Integer [ numObjetos ] ;
        for ( int i = 0 ; i < numObjetos ; i ++ ) {
            copia [ i ] = objetos [ i ] ;
        }
        return copia ;
    }

    public String toString ( ) {
        StringBuilder sb = new StringBuilder ( "[" ) ;
        for ( int i = 0 ; i < numObjetos ; i ++ ) {
            sb.append ( objetos [ i ] ) ;
            if ( i < numObjetos - 1 ) sb.append ( ", " ) ;
        }
        sb.append ( "]" ) ;
        return sb.toString ( ) ;
    }

}
