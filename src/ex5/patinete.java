package ex5;

public class patinete {
	String modelo;
	String cor;
	String categoria;
	double velocidade =0;
	void acelerar (double i)
	{
		velocidade = velocidade + i;
	}
	void freiar (double i)
	{
		velocidade = velocidade - i;
	}
	void velocidade (int i)
	{
		System.out.println("Velocidade final: " + velocidade);
	}
	void guardar (int i)
	{
		if (i==1)
		{
			System.out.println("Guardar patinete");
		}
		if (i==0)
		{
			System.out.println("Continuar andando");
		}
	}


}
