package domain;

import java.util.Locale;
import java.util.Scanner;

public class Terminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o numero da conta: " ); 
		Integer numeroConta = sc.nextInt();
		System.out.print("Digite o numero da Agencia: ");
		Integer numeroAgencia = sc.nextInt();
		System.out.print("Digite o nome do cliente: ");
		String nomeCliente = sc.next();
		System.out.print("Informe qual sera o saldo inicial: ");
		Double saldo = sc.nextDouble();
		
		CadastroCliente cadastro = new CadastroCliente(numeroConta, numeroAgencia, nomeCliente, saldo);
		
		System.out.println(cadastro);
		sc.close();
			
	}

	
}
