package musica;

import java.util.Scanner;
import musica.ListaDoblementeEnlazada;
import musica.ExcepcionListaVacia;

class PruebaListaDoblementeEnlazada {
	
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		
		int op;
		String dig;
		ListaDoblementeEnlazada miLista=new ListaDoblementeEnlazada();
		
		System.out.print("ingrese un digito");
		dig=leer.next();
		
		System.out.println("seleccione en donde ingresar el digito ");
		System.out.println("1:principio ");
		System.out.println("2: fin ");
		System.out.println("3: borrar principio");
		System.out.println("4: borrrar final");
		System.out.println("5: salir ");
		op=leer.nextInt();
		
		
		while(op==5) {
			
			
			switch(op)
			{
			
			case 1: miLista.insertarDelante(dig);
					miLista.imprimir();
					break;
			
			case 2: miLista.insertarDetras(dig);
					miLista.imprimir();
					break;
			
			case 3:	Object elementoRemovido=miLista.removerDeDelante();
					System.out.println("Removido: "+elementoRemovido);
					miLista.imprimir(); 		
				
				
			case 4: elementoRemovido=miLista.removerDeDetras();
					System.out.println("Removido: "+elementoRemovido);
					miLista.imprimir();	
					
				
			}
			
			
		} 
	
		
	
		
		
		
		
		
		
					
	}
}
