public class Empr
{
	// Atributos
	// ----------------------------
	String 	dni,
	 		nome;

	int		idade;

	// Metodos

	// Alta
	public void ALTA( String _dni, String _nome, int _idade )
	{
		dni = _dni;
		nome = _nome;
		idade = _idade;
	}

	// Buscar
	public static Posicion BUSCAR ( Empr[][] array_de_empregados, String _nome )
	{
		int total_rows = array_de_empregados.length;
		int total_cols = array_de_empregados[0].length;
	
		for ( int row = 0; row < total_rows; row++ )
		{
			for ( int col = 0; col < total_cols; col++ )
			{
				if ( array_de_empregados[ row ][ col ] != null )
				{
					if ( array_de_empregados[ row ][ col ].nome.equalsIgnoreCase( _nome ) )
					{
						Posicion pos = new Posicion( row, col );
						return pos;
					}
				}
			}
		}
		return null;
	}
	/*
	 * METODO ANTIGUO
	 * public static Empr BUSCAR ( Empr[][] array_de_empregados, String _nome )

	{
		int total_rows = array_de_empregados.length;
		int total_cols = array_de_empregados[0].length;
		for ( int row = 0; row < total_rows; row++ )
		{
			for ( int col = 0; col < total_cols; col++ )
			{
				if ( array_de_empregados[ row ][ col ].nome.equalsIgnoreCase( _nome ) )
					return array_de_empregados[ row ][ col ];
			}
		}
		return null;
	}//*/
	// VER TODOS
	public static void VER_TODOS ( Empr[][] array_de_empregados )
	{
		int total_rows = array_de_empregados.length;
		int total_cols = array_de_empregados[0].length;

		for ( int row = 0; row < total_rows; row++ )
		{
			for ( int col = 0; col < total_cols; col++ )
			{
				if ( array_de_empregados[ row ][ col ] != null )
					VISUALIZAR ( array_de_empregados[ row ][ col ]);
			}
		}
	}
	
	// VISUALIZAR 
	public static void VISUALIZAR( Empr empregado )
	{
			System.out.println( "" );
			System.out.println( "DNI: " + empregado.dni );
			System.out.println( "Nome: " + empregado.nome );
			System.out.println( "Idade: " + empregado.idade );
			System.out.println( "" );
	}
}
