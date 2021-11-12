package ex2;

public class testeaviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aviao av1= new aviao();
		av1.companhia= "TAM";
		av1.destino= "Bahia";
		av1.voo= "178-BR";
		System.out.println("Companhia: "+ av1.companhia);
		System.out.println("Destino: "+ av1.destino);
		System.out.println("Voo: "+av1.voo);
		av1.decolar(1);
		av1.voar(1);
		av1.pousar(0);

	}

}
