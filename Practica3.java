import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numeros enteros quieres que se generen al azar?");

        int cantidad = sc.nextInt();
        int numAleatorio=0;
        int numMax= 0;
        for (int conteo = 0; conteo < cantidad; conteo++ ) {

            numAleatorio = (int) (Math.random() * 100) +1;
            System.out.println(+numAleatorio);

            if (numAleatorio>numMax) {
                numMax=numAleatorio;
            }
        }System.out.println("El numero maximo de toda la secuencia es el "+numMax);
    }
}
