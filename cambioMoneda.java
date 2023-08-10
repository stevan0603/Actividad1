//Desarrollar un programa que pueda calcular el valor del tipo de
//cambio de moneda (pesos colombianos– hacia dólar y viceversa)

import java.util.Scanner;

public class cambioMoneda {

    public static int pedirMoneda() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la moneda que desea cambiar: ");
        System.out.println("1. Pesos Colombianos a Dolar");
        System.out.println("2. Dolar a Pesos Colombianos");
        System.out.println("3. Salir");
        int valor = entrada.nextInt();
        return valor;

    }

    public static float Cambio(int valor) {

        Scanner entrada = new Scanner(System.in);
        float resultado = 0;

        switch (valor) {
            case 1:
                System.out.println("Ingrese la cantidad de pesos colombianos que desea cambiar: ");
                float pesos = entrada.nextFloat();
                resultado = pesos / 3800;
                break;
            case 2:
                System.out.println("Ingrese la cantidad de dolares que desea cambiar: ");
                float dolares = entrada.nextFloat();
                resultado = dolares * 3800;
                break;
            case 3:
                System.out.println("Gracias por usar el programa");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int valor = pedirMoneda();
        float resultado = Cambio(valor);
        System.out.println("El resultado es: " + resultado);
    }

}