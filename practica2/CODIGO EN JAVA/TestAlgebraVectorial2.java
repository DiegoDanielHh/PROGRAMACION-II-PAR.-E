public class TestAlgebraVectorial2 {
    public static void main(String[] args) {
        AlgebraVectorial2 a = new AlgebraVectorial2(3,4);
        AlgebraVectorial2 b = new AlgebraVectorial2(4,-3);

        System.out.println("Suma de vectores:");
        AlgebraVectorial2 c = a.sumar(b);
        System.out.println(c);

        System.out.println("\nMultiplicación por escalar:");
        int r=2;
        AlgebraVectorial2 resultado = a.multiplicar(r);
        System.out.println(resultado);

        System.out.println("\nMagnitud del vector:");
        System.out.println(a.magnitud());

        System.out.println("\nVector normal:");
        AlgebraVectorial2 normal = a.normalizar();
        System.out.println(normal);

        System.out.println("\nProducto escalar:");
        float productoEsc = a.productoPunto(b);
        System.out.println(productoEsc);

        System.out.println("\nProducto vectorial:");
        AlgebraVectorial2 productoVec = a.productoCruz(b);
        System.out.println(productoVec);

        System.out.println("\nParalelogramo:");
        boolean esRectangulo = a.verificaParalelogramoRectangulo(b);
        System.out.println("Igualdad en las diagonales del paalelogramo: " + esRectangulo);
        if (esRectangulo) {
            System.out.println("son perpendiculares");
        } else {
            System.out.println("No son perpendiculares");
        }
    }
}
