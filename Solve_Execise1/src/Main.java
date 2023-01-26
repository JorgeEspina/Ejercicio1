import java.util.ArrayList;
import java.util.List;

public class Main {
    /*1.	Un programa que imprima los primeros 10
    números primos (numero primo es el que es divisible
    únicamente sobre si mismo y 1).
    * */
    public static boolean VerificarNumber(int number){
        int contador = 2;
        boolean isprimenumber =true;
        while (isprimenumber && (contador!=number)){
            if (number % contador == 0)
                return false;
            contador++;
        }
        return true;
    }
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        int number = 2;

        while(result.size() < 10){
            if(VerificarNumber(number)){
                result.add(String.valueOf(number));
            }
            number++;
        }
        System.out.println("Primeros 10 Numeros primos");
        for (int i = 0; i <= result.size() - 1; i++) {
            System.out.println(result.get(i));
        }
    }
}