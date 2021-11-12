package ex7;

public class testepaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paciente p1 = new paciente();
		p1.nome="Gustavo";
		p1.idade=29;
		p1.estado="UTI";
		System.out.println("Nome: "+p1.nome);
		System.out.println("Idade: "+p1.idade);
		System.out.println("Está na: "+p1.estado);
		p1.baixa(0);
		p1.clinico(3);

	}

}
