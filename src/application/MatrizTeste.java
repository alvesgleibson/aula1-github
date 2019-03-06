package application;

import java.util.Scanner;

public class MatrizTeste {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Linha: ");
		int tL = sc.nextInt();
		System.out.print("Coluna: ");
		int tC = sc.nextInt();
		
		int[][]matz = new int[tL][tC];
		
		for (int i = 0; i < matz.length; i++) {
			for (int j = 0; j < matz[i].length; j++) {
				
				matz[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.print("Numero procurar: ");
		int possi = sc.nextInt();
		
		for (int i = 0; i < matz.length; i++) {
			for (int j = 0; j < matz[i].length; j++) {
				
				if(matz[i][j] == possi) {
					
					System.out.println("Position: "+i+", "+j);
					if(j > 0) System.out.println("Left: "+matz[i][j-1]);
					if(j < matz[i].length-1)System.out.println("Rigth: "+matz[i][j+1]);
					if(i > 0)System.out.println("Up: "+matz[i-1][j]);
					if(i < matz.length-1) {System.out.println("Down: "+matz[i+1][j]);
					
					System.out.println("----------------------------------------");
					System.out.println("Rigth: "+(matz[i].length-1)+" Down: "+(matz.length-1));
					}
					
				}
				
				
			}
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/**Scanner sc = new Scanner(System.in);

		System.out.print("Tamanho Matriz: ");
		int t = sc.nextInt();

		int[][] mtz = new int[t][t];

		//Receber os Valores do Usuario
		for (int i = 0; i < mtz.length; i++) {
			for (int j = 0; j < mtz.length; j++) {
				mtz[i][j] = sc.nextInt();
			}
		}

		//Informar A Diagonal Principal
		System.out.print("Main Diagonal: ");
		for (int i = 0; i < mtz.length; i++) {
			System.out.print(mtz[i][i]);
		}

		int cont = 0;
		System.out.println("Numeros Negativos foram: ");
		//int[] aloc = new int[mtz.length];
		for (int i = 0; i < mtz.length; i++) {
			for (int j = 0; j < mtz.length; j++) {

				if (mtz[i][j] < 0) {
					cont++;
					//aloc[cont] = mtz[i][j];
					System.out.print(mtz[i][j]);
				}

			}
		}
		System.out.print("Quantidades de valores negaticos são: "+cont);

		sc.close();

		
		/**
		
		
		
		
		
		
		
		
		/**
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("Informe o Tamanho da Matriz"); int tamanho = sc.nextInt();
		 * 
		 * int[][] matrizz = new int[tamanho][tamanho];
		 * 
		 * for (int i = 0; i < matrizz.length; i++) { for (int j = 0; j <
		 * matrizz.length; j++) { matrizz[i][j] = sc.nextInt(); }
		 * 
		 * } System.out.print("Diagonal Principal: "); for (int i = 0; i <
		 * matrizz.length; i++) {
		 * 
		 * System.out.print(matrizz[i][i]); }
		 * 
		 * int cont = 0; System.out.println(); for (int i = 0; i < matrizz.length; i++)
		 * { for (int j = 0; j < matrizz.length; j++) { if (matrizz[i][j] < 0) { cont++;
		 * } } }
		 * 
		 * System.out.print("Numeros Negativos São: " + cont); sc.close();
		 */
	}

}
