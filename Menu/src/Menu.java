import  java.util.Scanner;
public class Menu {
    public static void Suma(int num1,int num2){
        int suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("Presiona Enter para continuar");
        new Scanner(System.in).nextLine();
    }
    public static void Resta(int num1,int num2){
        int resta = num1 - num2;
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("Presiona Enter para continuar");
        new Scanner(System.in).nextLine();
    }
    public static void Multiplicacion(int num1,int num2){
        int multiplicacion = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("Presiona Enter para continuar");
        new Scanner(System.in).nextLine();
    }
    public static void Division(int num1,int num2){
        if (num2 != 0) {
            int division = num1 / num2;
            System.out.println("El resultado de la división es: " + division);
        } else{
            System.out.println("No se puede dividir por cero");
        }
        System.out.println("Presiona Enter para continuar");
        new Scanner(System.in).nextLine();
    }
    public static void Potencia(int num1,int num2){
        int potencia = num1;
        if (num2 != 0) {
            for (int i = 2; i <= num2; i++) {
                potencia *= num1;
            }
        } else{
            potencia = 1;
        }
        System.out.println("El resultado de la potencia es: " + potencia);
        System.out.println("Presiona Enter para continuar");
        new Scanner(System.in).nextLine();
    }
    public static void Raiz(int num1,int num2){
        float raiz = (float) Math.pow(num1, 1.0/num2);
        System.out.println("El resultado de la raiz es: " + raiz);
        System.out.println("Presiona Enter para continuar");
        new Scanner(System.in).nextLine();
    }
    public static int Tomar_num(int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita el numero #" + num);
        return sc.nextInt();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,loop=0;
        String r;

        System.out.println("Bienvenido a las operaciones matematicas!!!");
        while (loop == 0){
            System.out.println("""
                    Menú
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Potenciación
                    6. Radicación
                    0. Salir
                    """);
            r = sc.nextLine();
            switch (r) {
                case "1" -> {
                    num1 = Tomar_num(1);
                    num2 = Tomar_num(2);
                    Suma(num1, num2);
                }
                case "2" -> {
                    num1 = Tomar_num(1);
                    num2 = Tomar_num(2);
                    Resta(num1, num2);
                }
                case "3" -> {
                    num1 = Tomar_num(1);
                    num2 = Tomar_num(2);
                    Multiplicacion(num1, num2);
                }
                case "4" -> {
                    num1 = Tomar_num(1);
                    num2 = Tomar_num(2);
                    Division(num1, num2);
                }
                case "5" -> {
                    num1 = Tomar_num(1);
                    num2 = Tomar_num(2);
                    Potencia(num1, num2);
                }
                case "6" -> {
                    num1 = Tomar_num(1);
                    num2 = Tomar_num(2);
                    Raiz(num1, num2);
                }
                case "0" -> {
                    loop = 1;
                    System.out.println("Ok, Hata la proxima\n****************    FIN DEL PROGRAMA    ****************");
                }
                default -> System.out.println("Número invalido... intentalo de nuevo");
            }
        }
    }
}