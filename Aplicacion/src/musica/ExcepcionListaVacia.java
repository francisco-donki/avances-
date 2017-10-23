// Definición de la clase ExcepcionListaVacia
package musica;

public class ExcepcionListaVacia extends RuntimeException {

   // inicializa an ExcepcionListaVacia
   public ExcepcionListaVacia( String nombre )
   {
      super( "La lista " + nombre + " esta vacía" );
   }

}  // fin de la clase ExcepcionListaVacia

