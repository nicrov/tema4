import java.util.Scanner;
public class Ejercicio6 {
    //Atributos.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;
        int[] array; // Declaración
        array = new int[10]; // instanciacion
        //inicializacion
        System.out.println("dime 10 numeros");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i <= 4; i++) {
            temp = array[0];
            array[i] = array[9-i];
            array[9-i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento indice" + i + " = " + i + " = " + array[i]);



        }

    }
}