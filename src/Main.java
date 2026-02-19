import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário 

public class Main { // classe principal do programa 
    public static void main(String[] args) { // metódo principal do programa 
        Scanner sc = new Scanner(System.in); 

        // Pedir ao usuário para inserir dois números 
        System.out.println("Insira o primeiro número: "); 
        double num1 = sc.nextDouble(); 

        System.out.println("Insira o segundo número: "); 
        double num2 = sc.nextDouble(); 

        // Digite aqui o código para adição, subtração, multiplicação e divisão dos dois números 
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        String divisao = (num2 != 0) ? "Divisão: " + (num1 / num2) : "Divisão: não é possível dividir por zero";

        // Digite aqui o código para exibir o resultado das operações
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println(divisao);

        /* Digite aqui o código para fazer a comparação se os dois números são iguais, se o 
        primeiro número é maior que o segundo e se o primeiro número é menor que o segundo. */ 
        boolean igual = num1 == num2;
        boolean maior = num1 > num2;
        boolean menor = num1 < num2;

        // Digite aqui o código para exibir o resultado das comparações 
        System.out.println("Os números são iguais? " + igual);
        System.out.println("O primeiro número é maior que o segundo? " + maior);
        System.out.println("O primeiro número é menor que o segundo? " + menor);

        // Fechar o scanner 
        sc.close(); 
      } 
}