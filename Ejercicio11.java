import java.util.Scanner;
import java.util.Random;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Random r = new Random();
        int NumMax = 0;
        int NumImpar = 0;
        int Promedio = 0;
        int NumDocena = 0;
        int ContaPar = 0;
        for (int i = 0; i < 10; i++) {
            int Num = r.nextInt(36);
            System.out.println(Num);
            if (Num % 2 == 0 && Num != 0) {
                Promedio += Num;
                ContaPar++;

            } else {
                NumImpar++;
            }

            if (Num >= 13 && Num <= 24) {
                NumDocena++;
            }
            if (Num > NumMax) {
                NumMax = Num;
            }

        }
        System.out.println("Hay un total de " + NumImpar + " numeros impares");
        System.out.println("El proemdio de los numero pares es de " + (float) Promedio / (float) ContaPar);
        System.out.println("El numero mas grande es el " + NumMax);

    }
}
