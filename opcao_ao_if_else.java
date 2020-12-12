import java.util.Scanner;

public class opcao_ao_if_else {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.01 : preco * 0.05;

		System.out.println(desconto);

		sc.close();

	}

}
