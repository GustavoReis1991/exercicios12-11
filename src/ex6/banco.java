package ex6;

public class banco {
	String nome;
	String conta;
	String cpf;
	double x=0;
	void adicionar(double i)
	{
		x=x+i;
		System.out.println("Adiocionou "+ i+" Reais a conta");
	}
	void retirar(double i)
	{
		x=x-i;
		System.out.println("Retirou "+i+" Reais da conta");
	}
	void saldo()
	{
		System.out.println("Saldo= "+ x+" Reais");
	}

}
