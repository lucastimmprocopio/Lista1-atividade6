import java.util.Scanner;
public class lt1_at6 {
    public static void main(String[] args) throws Exception {
        //Req_1: Pedir raio do círculo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o raio do círculo: ");
        double raio = sc.nextDouble();
        sc.close();

        //Req_2: Calcular área do círculo. 
        // =PI() * Potência (c3;2)
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println(" A área do círculo de raio " + raio + " é igual a " + area);


    }
}
