import java.util.Scanner;
public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores a,b,c: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
    
        EcuacionCuadratica ecd = new EcuacionCuadratica (a,b,c);
        
        if (ecd.getDiscriminante()>0){
            System.out.printf("La ecuacion tiene dos raices %.6f y %.5f",ecd.getRaiz1(),ecd.getRaiz2());
        }else
            if(ecd.getDiscriminante()==0){
                System.out.printf("la ecuacion tiene una raiz %.1f",ecd.getRaiz1());
            }else
                if(ecd.getDiscriminante()<0){
                    System.out.println("La ecuacion no tiene raices reales");
                }
    }
}
