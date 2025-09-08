
public class TestCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(3.0);
        Circulo c3 = new Circulo(1.0, 3.0, 6.0);

        System.out.println("C1 tiene centro en: (" + c1.getX() + ", " + c1.getY() + ") y radio: " + c1.getRadio());
        System.out.println("C2 tiene centro en: (" + c2.getX() + ", " + c2.getY() + ") y radio: " + c2.getRadio());
        System.out.println("C3 tiene centro en: (" + c3.getX() + ", " + c3.getY() + ") y radio: " + c3.getRadio());

        System.out.println("Área de C3: " + c3.getArea());
        System.out.println("Perímetro de C3: " + c3.getPerimetro());
        System.out.println("¿C3 contiene a C2? " + c3.contiene(c2));
        System.out.println("¿C3 se sobrepone con C1? " + c3.sobrepone(c1));
    }
}
