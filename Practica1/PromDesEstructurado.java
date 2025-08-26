import java.util.Scanner;

public class PromDesEstructurado {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        double[]a=new double[n];
        System.out.println("Ingrese 10 numeros: ");
        for (int i=0;i<n;i++){
            a[i]=sc.nextDouble();
        }
        double suma=0;
        for (int j = 0; j < n; j++) {
            suma=suma+a[j];
        }
        double promedio=suma/n;
        System.out.printf("el promedio es: %.2f\n",promedio);
        double suma2=0;
        for (int k=0;k<n;k++){
            suma2=suma2+(Math.pow(a[k]-promedio, 2));
        }
        double desviacion=Math.sqrt(suma2/(n-1));
        System.out.printf("La desviacion estandart es: %.5f",desviacion);
    }
}
