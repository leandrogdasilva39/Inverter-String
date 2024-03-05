//Código feito por Leandro Gonçalves da Silva

import java.util.Scanner;
public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();
        String inverted = inverterString(input);
        System.out.println("String invertida: " + inverted);
        scanner.close();
    }
    public static String inverterString(String input) {
        char[] caracteres = input.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }
        return new String(caracteres);
    }
}