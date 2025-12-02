import java.util.Scanner; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Practica4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // El programa muestra por pantalla el proceso de generar numeros al azar
        System.out.println("Generando numeros al azar...");

        int contador = 0;

        int numero = (int) (Math.random() * 100) + 1;


        // Mientras que se hayan contado menos de 100 numeros y que el numero generado no sea 99 (Porque se detendria el programa), el programa generara numeros al azar del 1 al 100

        int nvecesnumero30 = 0;
        while ((contador < 100) && (numero != 99)) {
            numero = (int) (Math.random() * 100) + 1;
            System.out.println("Numero generado: " + numero);
            contador++;

            //Si se genera el numero 30, se suma la vez que salio

            if (numero == 30){
                nvecesnumero30++;
            }


        }

        //Se imprime por pantalla si salio el numero 30 alguna vez
        System.out.println("Se genero el numero 12 un total de "+nvecesnumero30+" veces");
            }


        }


