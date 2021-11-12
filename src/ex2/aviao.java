package ex2;

public class aviao {
	String companhia;
	String destino;
	String voo;
	void decolar(int i)
	{
		if (i==1)
		{
			System.out.println("Decolagem liberada");
		}
		if (i==0)
		{
			System.out.println("Atrasar decolagem");
		}
	}
	void voar(int i)
	{
		if (i==1)
		{
			System.out.println("Rota segura prosseguir");
		}
		if (i==0)
		{
			System.out.println("Mudar rota de voo");
		}
	}
	void pousar (int i)
	{
		if (i ==1)
		{
			System.out.println("Pouso liberado");
		}
		if (i==0)
		{
			System.out.println("Atrasar pouso");
		}
	}

}
