package ex6;

public class bancoteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		banco u1 = new banco();
		u1.nome="Gustavo";
		u1.cpf= "1234567890";
		u1.conta="121345907-9";
		System.out.println("Nome: "+u1.nome);
		System.out.println("CPF: "+u1.cpf);
		System.out.println("Conta: "+ u1.conta);
		u1.adicionar(500);
		u1.retirar(300);
		u1.adicionar(200);
		u1.saldo();

	}

}
