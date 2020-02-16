package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.util;

public class pro_banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		util Util;

		System.out.println("entre com o numero da conta: ");
		int num_conta = sc.nextInt();
		System.out.println("nome do cliente: ");
		sc.nextLine();
		String nome_titular = sc.nextLine();
		System.out.println("o cliente deseja depositar inicialmente? y/n");
		char res = sc.next().charAt(0);
		if(res == 'y') {
			System.out.println("digite o valor do deposito inicial: ");
			double valor_inicial = sc.nextDouble();
			Util = new util(num_conta, valor_inicial, nome_titular);
		} else {
			Util = new util(num_conta, nome_titular);
		}
		System.out.println();
		System.out.println("dados da conta: ");
		System.out.println(Util);
		
		System.out.println();
		System.out.print("entre com valor do deposito: ");
		double valor_inicial = sc.nextDouble();
		Util.addMoney(valor_inicial);
		System.out.println();
		System.out.println(Util);
		
		System.out.print("entre com valor do saque: ");
		valor_inicial = sc.nextDouble();
		Util.removeMoney(valor_inicial);
		System.out.println();
		System.out.println(Util);

		sc.close();
	}

}
