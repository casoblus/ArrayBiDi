import java.util.Scanner;

public class BiArrayObject
{	
	static int 	filas = 3, 
				columnas = 3, 
				opt;

	static int 	ultima_fila = 0,
				ultima_columna = 0;

	private static void INC_COLUMNA() 
	{
		if ( ultima_columna < columnas - 1 )
			ultima_columna++;
		else
		{
			INC_FILA();
			ultima_columna = 0;
		}
	}
	
	
	private static void INC_FILA() 
	{
		if ( ultima_fila < filas - 1 )
		{
			ultima_fila++;
		}
	}
	
	
	public static void main( String[] args )
	{	
		Scanner teclado =  new Scanner( System.in );
			
		Empr[][] empregado = new Empr[ filas ][ columnas ];

		do {

			System.out.println( "SELECCIONA OPCION: 1-Alta, 2-Ver emp, 3-Ver todos, 4-Buscar, 0-Salir." );
			
			opt = teclado.nextInt();

			switch ( opt )
			{
				
				case 1:
						// DAR DE ALTA
						if ( ultima_fila <= filas - 1 )
						{
							if ( ultima_columna <= columnas - 1 )
							{
								System.out.println( "ALTA NUEVA." );
								String dni = teclado.nextLine(); // Limpia el buffer
								empregado[ ultima_fila ][ ultima_columna ] = new Empr();
								System.out.println( "DNI?" );
								dni = teclado.nextLine();
								System.out.println( "Nombre?" );
								String nombre = teclado.nextLine();
								System.out.println( "Idade?" );
								int idade = teclado.nextInt();
								empregado[ ultima_fila ][ ultima_columna ].ALTA( dni, nombre, idade );
								INC_COLUMNA();
							}
							else
							{
								System.out.println( "Array lleno." );
							}
						}
						break;
				
				case 2:
						// VER UNO 
						
						System.out.println( "FILA?" );
						int f = teclado.nextInt();
						
						System.out.println( "COLUMNA?" );
						int c = teclado.nextInt();
						
						Empr.VISUALIZAR( empregado[ f ][ c ] );
						break;
				
				case 3:
						// VER TODOS
						Empr.VER_TODOS( empregado );
						break;
				
				case 4:
						// BUSCAR
						String nombre = teclado.nextLine(); // limpia el buffer
						System.out.println( "Nome a buscar" );	
						String nome = teclado.nextLine();
						Empr.BUSCAR( empregado, nome );
						break;
				
				case 0:
						break;
				
				default:
						System.out.println( "OPCION NO VÁLIDA:" );
						break;
			}
		} while ( opt != 0 );
	}
}
