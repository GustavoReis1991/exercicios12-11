package ex4;

public class testefuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcionario f1 = new funcionario();
		f1.nome = "Gustavo";
		f1.idade= 29;
		f1.cargo = "Aluno";
		System.out.println("Nome: " + f1.nome);
		System.out.println("Idade: "+ f1.idade);
		System.out.println("Cargo:"+ f1.cargo);
		f1.presença(1);
		f1.almoço(0);
		f1.meta(1);

	}

}
