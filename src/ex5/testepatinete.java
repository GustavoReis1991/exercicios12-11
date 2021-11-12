package ex5;

public class testepatinete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patinete p1 = new patinete();
		p1.categoria="Juvenil";
		p1.cor="Preto";
		p1.modelo="XS500";
		System.out.println("Categoria: "+p1.categoria);
		System.out.println("Cor: "+p1.cor);
		System.out.println("Modelo: "+p1.modelo);
		p1.acelerar(30);
		p1.freiar(10);
		p1.velocidade(0);
		p1.guardar(0);
		

	}

}
