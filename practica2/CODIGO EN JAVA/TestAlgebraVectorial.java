public class TestAlgebraVectorial {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(1,0);
        AlgebraVectorial b = new AlgebraVectorial(0,5);
        AlgebraVectorial c = new AlgebraVectorial(4,4);
        AlgebraVectorial d = new AlgebraVectorial(3,3);

        System.out.println("PERPENDICULARIDAD");
        System.out.println("a es perpendicular a b (a): " + a.esPerpendicular(b));
        System.out.println("a es perpendicular a b (b): " + a.esPerpendicular(b, "b"));
        System.out.println("a es perpendicular a b (c): " + a.esPerpendicular(b, "c"));
        System.out.println("a es perpendicular a b (d): " + a.esPerpendicular(b, "d"));

        System.out.println("\nPARALELISMO");
        System.out.println("c es paralela a d (e): " + c.esParalela(d));
        System.out.println("c es paralela a d (f): " + c.esParalela(d, "f"));

        System.out.println("\nPROYECIÓN Y COMPONENTE");
        AlgebraVectorial proj = a.proyeccionSobre(b);
        double comp = a.componenteEnDireccion(b);
        System.out.println("Proyección de a sobre b: " + proj);
        System.out.println("Componente de a en dirección de b: " + comp);
    }
}
