package musica;

// Definicion de la clase Lista 
public class ListaDoblementeEnlazada {
   private NodoLista primerNodo;
   private NodoLista ultimoNodo;
   private String nombre;  
   // nombre es una cadena tal como "lista" usada en impresion

   // construye una  Lista vac�a con un nombre
   public ListaDoblementeEnlazada( String cadena )
   {
      nombre = cadena;
      primerNodo = ultimoNodo = null;
   }

   // construye una Lista vac�a con el nombre "lista"
   public ListaDoblementeEnlazada() 
   { 
      this( "lista" ); 
   }  

   // Inserta un Object delante de la Lista. Si la Lista esta vac�a, 
   // primerNodo y ultimoNodo se refieren al mismo objeto.
   // De otra manera, primerNodo se refiere al nuevo nodo.
   public synchronized void insertarDelante( Object elementoAInsertar )
   {
      if ( estaVacio() )
         primerNodo = ultimoNodo = new NodoLista( elementoAInsertar );

      else {
         NodoLista desplazado = primerNodo;	
         primerNodo = new NodoLista( elementoAInsertar,desplazado,null );
         desplazado.nodoAnterior=primerNodo;
      }
   }

   // Inserta un Object al final de una Lista. Sila Lista esta vac�a,
   // primerNodo and ultimoNodo se refieren al mismo Objecto.
   // De otra manera, proximoNodo del ultimoNodo se refers al nuevo nodo.
   public synchronized void insertarDetras( Object elementoAInsertar )
   {
      if ( estaVacio() )
         primerNodo = ultimoNodo = new NodoLista( elementoAInsertar );

      else {
         NodoLista desplazado = ultimoNodo;
         ultimoNodo = new NodoLista( elementoAInsertar,null,desplazado ); 
         desplazado.nodoProximo = ultimoNodo;
      }
   }

   // remueve el primer nodo de la Lista
   public synchronized Object removerDeDelante()
      throws ExcepcionListaVacia
   {
      Object elementoARemover = null;

      // lanza una excepci�n si la Lista esta vac�a
      if ( estaVacio() )
         throw new ExcepcionListaVacia( nombre );

      // recupera el dato a ser removido
      elementoARemover = primerNodo.dato;  

      // reinicializa las referencias al primerNodo and ultimoNodo
      if ( primerNodo == ultimoNodo )
         primerNodo = ultimoNodo = null;

      else
      {
         primerNodo = primerNodo.nodoProximo;
         primerNodo.nodoAnterior = null;
      }

      // devuelve el dato del nodo removido
      return elementoARemover;  
   }

   // Remueve el �ltimo nodo de la Lista
   public synchronized Object removerDeDetras()
      throws ExcepcionListaVacia
   {
      Object elementoARemover = null;

      // lanza una excepci�n si la Lista esta vac�a
      if ( estaVacio() )
         throw new ExcepcionListaVacia( nombre );

      // recupera el dato del que esta siendo removido
      elementoARemover = ultimoNodo.dato;  

      // reinicializa las referencias del primerNodo and ultimoNodo
      if ( primerNodo == ultimoNodo )
         primerNodo = ultimoNodo = null;

      else {
         ultimoNodo = ultimoNodo.nodoAnterior;
         ultimoNodo.nodoProximo = null;
      }

      // devuelve el dato del nodo removido
      return elementoARemover;
   }

   // retorna true si la Lista esta vac�a
   public synchronized boolean estaVacio()
   { 
      return primerNodo == null; 
   }

   // salida de los contenidos de Lista del primero al �ltimo
   
   public StringBuilder imprimir(){
	   StringBuilder cadena=new StringBuilder();
	  
	   NodoLista temp=primerNodo;
	cadena.append("NULL ---->");
	   while(temp!=null){
		   
		   cadena.append(temp.dato.toString());
		   cadena.append("<----->");
		   temp=temp.nodoProximo;  
	   }
	   
	   cadena.append("NULL");
	   return cadena;
	   
   }
   
   public StringBuilder imprimirDesdeUltimo(){
	   StringBuilder cadena=new StringBuilder();
	   
	   if ( estaVacio() ) {
	    	  cadena.append("lista vacia");
	      }
	  
	   NodoLista temp=primerNodo;
	cadena.append("NULL <---->");
	   while(temp!=null){
		   
		   cadena.append(temp.dato.toString());
		   cadena.append("<----->");
		   temp=temp.nodoAnterior;  
	   }
	   
	   cadena.append("null");
	   return cadena;
	   
   }
   
   
   
}  // fin de la clase Lista

