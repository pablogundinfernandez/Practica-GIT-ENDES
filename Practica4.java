import java.util.Scanner; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Practica4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Generando numeros al azar...");

        int contador = 0;

        int numero = (int) (Math.random() * 100) + 1;

        int nvecesnumero12 = 0;
        while ((contador < 100) && (numero != 99)) {
            numero = (int) (Math.random() * 100) + 1;
            System.out.println("Numero generado: " + numero);
            contador++;

            if (numero == 12){
                nvecesnumero12++;
            }


        }

        System.out.println("Se genero el numero 12 un total de "+nvecesnumero12+" veces");
            }


        }


