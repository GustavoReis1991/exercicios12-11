package ex1;

public class testecliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cliente c1 = new cliente();
		c1.nome = "Gustavo";
		c1.idade = 29;
		c1.cpf = 1234567890;
		System.out.println(c1.nome + "\n" + c1.idade+"\n"+c1.cpf);
		c1.compra(1);
		c1.pagar(1);
		c1.devolucao(0);

	}

}
