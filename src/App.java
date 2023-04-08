import java.util.Scanner;

class main {
    public static void main(String[] args) {

        int numero;
        int numero1;
        int soma;

        Scanner teclado = new Scanner(System.in);

        numero = teclado.nextInt();
        numero1 = teclado.nextInt();
        soma = (numero + numero1);
        System.out.println("soma é " + soma);
        teclado.close();
    }
}
