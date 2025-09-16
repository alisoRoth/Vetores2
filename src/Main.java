
   import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numeros = new int[10];

            System.out.println("Digite 10 números inteiros ");
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                numeros[i] = scanner.nextInt();
            }

            int maiorNumero = numeros[0];
            int menorNumero = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > maiorNumero) {
                    maiorNumero = numeros[i];
                }
                if (numeros[i] < menorNumero) {
                    menorNumero = numeros[i];
                }
            }
            System.out.println("O maior número digitado é: " + maiorNumero);
            System.out.println("O menor número digitado é: " + menorNumero);

            scanner.close();
        }
    }