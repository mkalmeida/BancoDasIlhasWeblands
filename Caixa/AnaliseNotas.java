package Caixa;

import java.util.Scanner;

public class AnaliseNotas {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
		
	int n50=0, n10=0, n5=0, n1=0, Rn50=0, Rn10=0, Rn5=0, Rn1=0, valorSaque, valorRestante=0, saqueTotal = 0;
	int Ln50=0, Ln10=0, Ln5=0, Ln1=0, saques = 0, valor =0, i=0;
	boolean validaNotas = false;
		
		
		
	do {
	System.out.println("Digite o valor do saque");
	valorSaque = input.nextInt();
	saques = saques + 1;
		
	if(valorSaque>=50) {
	n50 = (int)valorSaque/50;
	valorRestante = valorSaque - 50*n50;
	Rn50 = 100 - n50 - Rn50;
	System.out.println("valor restante: 50 " + valorRestante);
	
	}
	
	if(valorRestante>=10) {
	n10 = (int)valorRestante/10;
	valorRestante = valorRestante - 10*n10;
	Rn10 = 100 - n10 - Rn10;
	System.out.println("valor restante: 10 " + valorRestante);
	}
		
	if(valorRestante>=5) {
	n5 = (int)valorRestante/5;
	valorRestante = valorRestante - 5*n5;
	Rn5 = 100 - n5 - Rn5;
	System.out.println("valor restante: 5 " + valorRestante);
	}
			
	if(valorRestante>=1) {
	n1 = (int)valorRestante/1;
	valorRestante = valorRestante - 1*n5;
	Rn1 = 100 - n1 - Rn1;
	System.out.println("valor restante: 1 " + valorRestante);
	}	
			
	} while (valorSaque > 0 && saques <= 2);
	
	System.out.println("O valor solicitado é: " + valorSaque);
	System.out.println("Restam " +Rn50+ " notas de B$ 50, " +Rn10+ " notas de B$ 10, " +Rn5+ " notas de R$ 5 e " +Rn1+ " notas de B$ 1.");
	
	}
}
