package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Company;
import Entities.TaxPayer;
import Entities.individual;

public class aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		System.out.println("quantos dados serao cadrastrados :");
		int n = sc.nextInt();
		Double sum = 0.0;
		for (int i = 0; i < n; i++) {
			System.out.println("company or individual (c/i): ");
			char decision = sc.next().charAt(0);
			System.out.println("digite o nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite seu ganho anual :  ");
			Double anualIncome = sc.nextDouble();
			if (decision == 'i') {
				System.out.println("digite seus gastos com Saude:  ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new individual(name, anualIncome, healthExpenditures));
			} else {
				if (decision == 'c') {
					System.out.println("Quantos funcionarios : ");
					Integer employes = sc.nextInt();
					list.add(new Company(name, anualIncome, employes));
				}
			}

		}

		for (TaxPayer e : list) {
			Double tax = e.tax();
			sum = sum + e.tax();
			System.out.println("nome: " + e);
			System.out.println(String.format("%.2f", tax));

		}
		System.out.println("taxas totais a pagar : " + sum);
	}

}
