import java.util.Scanner;

public class Practica2{
    public static double introducirCateto(String nombrecateto){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el valor de "+nombrecateto);
        double catetos = sc.nextDouble();

        return catetos;
    }

    public static double calcularHipotenusa (double cateto1, double cateto2){
        double hipotenusa = Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));

        return hipotenusa;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        double cateto1=introducirCateto("cateto1");
        double cateto2=introducirCateto("cateto2");
        double hipotenusa=calcularHipotenusa(cateto1,cateto2);

        System.out.println("La hipotenusa del triangulo es: "+hipotenusa);
    }
}
