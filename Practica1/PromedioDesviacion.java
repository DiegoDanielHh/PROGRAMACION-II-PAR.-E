import java.util.Scanner;

public class PromedioDesviacion {
    //INDIRECTO:)
    int n;
    double[]a;
    
    public PromedioDesviacion(int n){
        this.n=n;
        this.a=new double [n];
    }
    //DIRECTO
    //int n=10;
    //double[]a=new double[n];
       
    public void lecturaNros(){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<n;i++){
            a[i]=sc.nextDouble();
        }
    }
    public double promedio(){
        double suma=0;
        for (int j=0;j<n;j++){
            suma=suma+a[j];
        }
        double promedio=suma/n;
        return promedio;
    }
    public double desviacion(){
        double promedio=promedio();
        double suma2=0;
        for (int k=0;k<n;k++){
            suma2 = suma2 + Math.pow(a[k] - promedio,2);
        }
        double desviacion=Math.sqrt(suma2/(n-1));
        return desviacion;
    }
}
