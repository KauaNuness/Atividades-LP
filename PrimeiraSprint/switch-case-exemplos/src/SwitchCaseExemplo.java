import java.util.Scanner;

public class SwitchCaseExemplo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número do dia da semana:");
        Integer diaDaSemaana = leitor.nextInt();

        switch (diaDaSemaana){
            case 1:
                System.out.println("Segunda!!!");
                break;

            case 2:
                System.out.println("Terça!!!");
                break;

            case 3:
                System.out.println("Aula de LP!!!");
                break;

            case 4:
                System.out.println("Quinta!!!");
                break;

            case 5:
                System.out.println("Sexta!!!");
                break;

        }

        String fruta = "Melancia";
        switch (fruta){

            case "Maçã":
                System.out.println("Temos no estoque!");
                break;

            case "Melancia":
                System.out.println("Não temos no estoque");
                break;

        }

    }
}
