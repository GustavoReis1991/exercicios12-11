package ex3;

import java.util.Scanner;

public class celular {
	String marca;
	String modelo;
	void ligar(int i)
	{
		if (i==1)
		{
			System.out.println("Aparelho ligado");
		}
		if (i==0)
		{
			System.out.println("Aparelho desligado");
		}
	}
	void atualizar (int i)
	{
		if (i==1)
		{
			int resp;
			System.out.println("Atualização Disponivel Deseja atualizar (1-sim/2-não): ");
			Scanner leia = new Scanner (System.in);
			resp=leia.nextInt();
			System.out.println(resp);
			if (resp ==1)
			{
				System.out.println("Atualizando");
			}
			if (resp==2)
			{
				System.out.println("Atualizar mais tarde");
			}
			leia.close();
		}
		if (i==0)
		{
			System.out.println("Não há atualização disponivel");
		}
	}

}
