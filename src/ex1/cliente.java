package ex1;

public class cliente {
	String nome;
	int cpf,idade;
	void compra(int i)
	{
		if (i==1)
		{
			System.out.println("Compra efetuada");
		}
		if (i==0)
		{
			System.out.println("Compra cancelada");
		}
	}
	void pagar(int i)
	{
		if (i==1)
		{
		System.out.println("Pagamento efetuado com sucesso");
		}
		if (i==0)
		{
			System.out.println("Pagamento não Efetuado");
		}
	}
	void devolucao(int i)
	{
		if (i==1)
		{
			System.out.println("Efetuar devolucao");
		}
		if (i==0)
		{
			System.out.println("Não efetuar devolucao");
		}
	}

}
