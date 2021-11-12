package ex3;


public class testecelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		celular cel1 = new celular();
		cel1.marca="Samsung";
		cel1.modelo="A22";
		System.out.println("Marca: "+ cel1.marca);
		System.out.println("Modelo: "+ cel1.modelo);
		cel1.ligar(1);
		cel1.atualizar(1);
		
		

	}

}
