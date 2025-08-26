import java.util.Scanner;
public class TestEcuacionLineal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Estimado usuario ingrese por favor los valores de a,b,c,d,e,f: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        double f=sc.nextDouble();
        
        EcuacionLineal ecua=new EcuacionLineal(a,b,c,d,e,f);
        
        if (ecua.tieneSolucion()){
            System.out.println("x = "+ecua.getX()+ "\n" +"y = "+ecua.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
    }
}
