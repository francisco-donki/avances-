package musica;

// Clase para representar un nodo en una lista
class NodoLista {

   // miembros de acceso de paquete;
   // Lista puede accesar a este directamente
   Object dato;    
   NodoLista nodoProximo;
   NodoLista nodoAnterior;

   // Constructor para crear a NodoLista
   // que se refiere al objeto 
   NodoLista( Object objeto ) 
   { 
      this( objeto, null, null ); 
   }

   // Constructor para crear a NodoLista
   // que se refiere al objeto
   // y al proximo NodoLista en Lista
   NodoLista( Object objeto, NodoLista prox, NodoLista ant)
   {
      dato = objeto;    
      nodoProximo = prox;
      nodoAnterior = ant;
      
   }

   // devuelve el Objeto en este nodo
   Object obtenerObjeto() 
   { 
      return dato; 
   }

   // devuelve  el proximo nodo
   NodoLista obtenerProximo() 
   { 
      return nodoProximo; 
   }
   
   NodoLista obtenerAnterior()
   {
   	  return nodoAnterior; 
   }

}  // fin de clase NodoLista
