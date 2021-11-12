package ex4;

public class funcionario {
	String nome;
	int idade;
	String cargo;
	void presença(int i)
	{
		if (i==1)
		{
			System.out.println("Funcionário presente");
		}
		if (i==0)
		{
			System.out.println("Funcionário faltou");
		}
	}
	void almoço(int i)
	{
		if (i==1)
		{
			System.out.println("Funcionário está em hora de almoço");
		}
		if (i==0)
		{
			System.out.println("Funcionário não está almoçando");
		}
	}
void meta (int i)
{
	if (i==1)
	{
		System.out.println("Funcionário bateu a meta");
	}
	if (i==0)
	{
		System.out.println("Funcionário não bateu a meta");
	}
}
}
