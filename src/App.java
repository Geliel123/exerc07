import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double base;
        double altura;
        double area;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da base do quadrado: ");
        base = teclado.nextDouble();

        System.out.println("Digite o valor da altura do quadrado: ");
        altura = teclado.nextDouble();

        area = (base + altura);

        System.out.println("A area do quadrado é: " + area);

        area = area + area;

        System.out.println("E o dobro da area  é: " + area);
    }

}
