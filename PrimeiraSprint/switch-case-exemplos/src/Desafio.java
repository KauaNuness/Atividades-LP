import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        Utilitaria util = new Utilitaria();

        util.exibirMenu();

        Integer numero = scanner.nextInt();

        while (numero != 1 && numero != 2 && numero != 3){
            util.exibirMenu();
            numero = scanner.nextInt();
        }

        switch (numero) {

            case 1:
                System.out.println("Digite o primeiro número:");
                Integer nota01 = scanner.nextInt();

                System.out.println("Digite o segundo número:");
                Integer nota02 = scanner.nextInt();

                Integer resultado1 = calc.somar(nota01, nota02);

                System.out.println(nota01 + " + " + nota02 + " = " + resultado1);
                break;

            case 2:
                System.out.println("Digite o primeiro número:");
                nota01 = scanner.nextInt();

                System.out.println("Digite o segundo número:");
                nota02 = scanner.nextInt();

                Integer resultado2 = calc.subtrair(nota01,nota02);

                System.out.println(nota01 + " - " + nota02 + " = " + resultado2);
                break;

            case 3:
                System.out.println("Digite o primeiro número:");
                nota01 = scanner.nextInt();

                System.out.println("Digite o segundo número:");
                nota02 = scanner.nextInt();

                Integer resultado3 = calc.multiplicar(nota01,nota02);

                System.out.println(nota01 + " * " + nota02 + " = " + resultado3);
                break;

        }

    }
}
