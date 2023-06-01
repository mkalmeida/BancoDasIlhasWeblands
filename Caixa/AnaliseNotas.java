package Caixa;

import java.util.Scanner;

public class AnaliseNotas {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
		
	int n50=0, n10=0, n5=0, n1=0, Rn50=100, Rn10=100, Rn5=100, Rn1=100, valorSaque, saques = 1, valor =0, opcao = 0;
		
	do {
	System.out.println("Digite o valor do saque");
	valorSaque = input.nextInt();
	if (valorSaque > 1000) {
		System.out.println("VALOR INVÁLIDO");
		System.out.println("DIGITE: ");
		System.out.println("1 - PARA DIGITAR VALOR DE SAQUE MENOR QUE B$ 1000" + "\n" + "2 - SAIR");
		opcao = input.nextInt();
		switch (opcao) {
		case 1: 
			System.out.println("Digite o valor do saque");
			valorSaque = input.nextInt();
			break;
		case 2:
			System.out.println("Você digitou sair");
			System.out.println("Volte sempre");
			System.exit(0);
		}
		
	}
	valor = valorSaque;
	saques = saques + 1;
		
	if(valorSaque>=50) {
	n50 = (int)valorSaque/50;
	valorSaque = valorSaque - 50*n50;
	Rn50 = Rn50 - n50;
	if (Rn50 < 1) {
		System.out.println("Não há notas de B$ 50 suficientes");
		System.out.println("SAQUE NÃO PERMITIDO");
		System.exit(0);
	}
	}
	
	if(valorSaque>=10) {
	n10 = (int)valorSaque/10;
	valorSaque = valorSaque - 10*n10;
	Rn10 = Rn10 - n10;
	if (Rn10 < 1) {
		System.out.println("Não há notas de B$ 10 suficientes");
		System.out.println("SAQUE NÃO PERMITIDO");
		System.exit(0);
	}
	}
		
	if(valorSaque>=5) {
	n5 = (int)valorSaque/5;
	valorSaque = valorSaque - 5*n5;
	Rn5 = Rn5 - n5;
	if (Rn5 < 1) {
		System.out.println("Não há notas de B$ 5 suficientes");
		System.out.println("SAQUE NÃO PERMITIDO");
		System.exit(0);
	}
	}
			
	if(valorSaque>=1) {
	n1 = (int)valorSaque/1;
	valorSaque = valorSaque - 1*n5;
	Rn1 = Rn1 - n1;
	if (Rn1 < 1) {
		System.out.println("Não há notas de B$ 1 suficientes");
		System.out.println("SAQUE NÃO PERMITIDO");
		System.exit(0);
		
	}
	}
	
	} while (valor > 0 && saques <= 4);
	
	System.out.println("Notas a serem entregues: ");
	if(n50>0) {
		System.out.println(n50 + " notas de B$ 50");
	}
	if(n10>0) {
		System.out.println(n10 + " notas de B$ 10");
	}
	if(n5>0) {
		System.out.println(n5 + " notas de B$ 5");
	}
	if(n1>0) {
		System.out.println(n1 + " notas de B$ 1");
	}
	
	System.out.println("Restam " +Rn50+ " notas de B$ 50, " +Rn10+ " notas de B$ 10, " +Rn5+ " notas de R$ 5 e " +Rn1+ " notas de B$ 1.");
	
	input.close();
	
	}
	
}
