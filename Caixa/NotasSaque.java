package Caixa;

import java.util.Scanner;

public class NotasSaque {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n50=0, n10=0, n5=0, n1=0, Rn50=100, Rn10=100, Rn5=100, Rn1=100, valorSaque, valorRestante, saqueTotal = 0;
		int Ln50=0, Ln10=0, Ln5=0, Ln1=0, saques = 0, valor =0, i=0;
		boolean validaNotas = false;
		
		//6600
		do {
		System.out.println("Digite o valor do saque");
		valorSaque = input.nextInt();
		saqueTotal = saqueTotal + valorSaque;
		saques = saques + 1;
		

			if(valorSaque>=50) {
			n50 = (int)valorSaque/50;
			valor = Math.abs(valorSaque - 50*n50);
			Rn50 = 100 - n50;
		//	if (Rn50 < 1) {
			//System.out.println("Não há notas de B$ 50 suficientes");
			//Ln50 = Ln50 + n50;
			}
			//} 
			
			if (valorSaque>=10) {
			n10 = (int)valorSaque/10;
			valor = Math.abs(valorSaque - 10*n50);
			Rn10 = 100 - n10;
			Ln10 = Ln10 + n10;
			} 
		
			
			if (valorSaque>=5) {
			n5 = (int)valorSaque/5;
			valor = Math.abs(valorSaque - 5*n50);
			Rn5 = 100 - n5;
			Ln5 = Ln5 + n5;
			} 
			

			if (valorSaque>=1) {
			n1 = (int)valorSaque/1;
			valor = Math.abs(valorSaque - 1*n50);
			Rn1 = 100 - n1;
			Ln1 = Ln1 + n1;
			}
			
		System.out.println("valor da soma: " + valor);
		System.out.println("valor do saque: " + valorSaque);
		System.out.println("saques: " + saques);
		System.out.println("notas 50: " + Rn50);
		
		} while (valorSaque > 0 && saques <= 2);
		System.out.println("O valor solicitado é: " + valorSaque);
		System.out.println("Restam " +Rn50+ " notas de B$ 50, " +Rn10+ " notas de B$ 10, " +Rn5+ " notas de R$ 5 e " +Rn1+ " notas de B$ 1.");

	}
}
