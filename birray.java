class Bidiarray
{
		
		public static void INTRODUCIR( int[][] array, int fila, int columna, int valor ) 
		{
			array[fila][columna] = valor;
		}

		public static void MOSTRAR( int[][] array ) // REQUIERE UN ARRAY COMPLETAMENTE LLENO. MUESTRA TODOS LOS VALORES.
		{
			int filas = array.length, columnas;
			for ( int i = 0; i < filas; i++ )
			{	
				columnas = array[i].length;
				for ( int j = 0; j < columnas; j++ )
				{
					System.out.println( "\t("+i+","+j+") ->" + array[i][j] );
				}
			}
		}

		public static void MOSTRAR( int[][] array, int fila, int columna ) // SOBRECARGADO. MUESTRA EL VALOR ALMACENADO EN UNA POSICION.
		{
			int dato = array[fila][columna];
			System.out.println( "El valor es: " + dato );
		}

		public static void STRINGIFY( int[][] array ) // INTRODUCE TODOS LOS VALORES EN UNA CADENA Y LA MUESTRA
		{
			int filas = array.length, columnas;
			String cadena = "{";
			for ( int i = 0; i < filas; i++ ) 
			{
				columnas = array[i].length;

				cadena = cadena + "{";

				for ( int j = 0; j < columnas; j++ )
				{
					cadena = cadena + array[i][j];
				}
				cadena = cadena + "}";
			}
			cadena = cadena + "}";
		}
}
