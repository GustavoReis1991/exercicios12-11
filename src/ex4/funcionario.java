package ex4;

public class funcionario {
	String nome;
	int idade;
	String cargo;
	void presen�a(int i)
	{
		if (i==1)
		{
			System.out.println("Funcion�rio presente");
		}
		if (i==0)
		{
			System.out.println("Funcion�rio faltou");
		}
	}
	void almo�o(int i)
	{
		if (i==1)
		{
			System.out.println("Funcion�rio est� em hora de almo�o");
		}
		if (i==0)
		{
			System.out.println("Funcion�rio n�o est� almo�ando");
		}
	}
void meta (int i)
{
	if (i==1)
	{
		System.out.println("Funcion�rio bateu a meta");
	}
	if (i==0)
	{
		System.out.println("Funcion�rio n�o bateu a meta");
	}
}
}
