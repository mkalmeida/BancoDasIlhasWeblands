package Caixa;

import java.util.Scanner;

public class AnaliseNotas {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
		
	int n50=0, n10=0, n5=0, n1=0, Rn50=100, Rn10=100, Rn5=100, Rn1=100, valorSaque, valorRestante=0, saqueTotal = 0;
	int Ln50=0, Ln10=0, Ln5=0, Ln1=0, saques = 0, valor =0, i=0, opcao = 0;
	boolean validaNotas = false;
		
		
		
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
	}
	}
	
	if(valorSaque>=10) {
	n10 = (int)valorSaque/10;
	valorSaque = valorSaque - 10*n10;
	Rn10 = Rn10 - n10;
	if (Rn10 < 1) {
		System.out.println("Não há notas de B$ 10 suficientes");
	}
	}
		
	if(valorSaque>=5) {
	n5 = (int)valorSaque/5;
	valorSaque = valorSaque - 5*n5;
	Rn5 = Rn5 - n5;
	if (Rn5 < 1) {
		System.out.println("Não há notas de B$ 5 suficientes");
	}
	}
			
	if(valorSaque>=1) {
	n1 = (int)valorSaque/1;
	valorSaque = valorSaque - 1*n5;
	Rn1 = Rn1 - n1;
	if (Rn1 < 1) {
		System.out.println("Não há notas de B$ 1 suficientes");
	}
	}	
			
	} while (valor > 0 && saques <= 6);
	
	System.out.println("O valor solicitado é: " + valorSaque);
	System.out.println("Restam " +Rn50+ " notas de B$ 50, " +Rn10+ " notas de B$ 10, " +Rn5+ " notas de R$ 5 e " +Rn1+ " notas de B$ 1.");
	
	}
	
}
