package ex7;

public class paciente {
	String nome;
	int idade;
	String estado;
	void clinico(int i)
	{
		if (i==1)
		{
			System.out.println("Liberar");
		}
		if (i==2)
		{
			System.out.println("Observação");
		}
		if (i==3)
		{
			System.out.println("Cirurgia");
		}
	}
	void baixa (int i)
	{
		if (i==1)
		{
			System.out.println("Óbito");
		}
		if (i==0)
		{
			System.out.println("Paciente vivo");
		}
	}

}
