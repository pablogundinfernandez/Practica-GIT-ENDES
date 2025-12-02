import java.util.Scanner;

public class Practica1 {

    public static double introducireuros(double euros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros a convertir");
        euros = sc.nextDouble();
        return euros;
    }

    public static int introducirmoneda(int moneda) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la moneda a la que deseas cambiar (1: dolar || 2: yenes || 3: libras");
        moneda = sc.nextInt();
        return moneda;
    }

    public static double cambiarmoneda(double euros, double resultado, int moneda) {
        switch (moneda) {
            case 1:
                resultado = euros * 1.11;
                break;
            case 2:
                resultado = euros * 120.63;
                break;
            case 3:
                resultado = euros * 0.87;
                break;
            default:
                System.out.println("Moneda no válida");
                break;
        }
        return resultado;
    }

    public static void imprimir(double euros, double resultado, int moneda) {
        if (moneda ==1){
            System.out.println("Has introducido " + euros + " euros, los cuales se han convertido en " + resultado + " dolares");
        }else {
            if (moneda == 2) {
                System.out.println("Has introducido " + euros + " euros, los cuales se han convertido en " + resultado + " yenes");
            }else{
                if (moneda == 3) {
                    System.out.println("Has introducido " + euros + " euros, los cuales se han convertido en " + resultado + " libras");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double euros = 0;

        int moneda=0;

        double resultado=0;

        euros = introducireuros(euros);

        moneda = introducirmoneda(moneda);

        resultado = cambiarmoneda(euros, resultado, moneda);

        imprimir(euros, resultado, moneda);

    }
}
