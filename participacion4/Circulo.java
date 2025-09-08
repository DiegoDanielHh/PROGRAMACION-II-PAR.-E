public class Circulo {
    private double x;
    private double y;
    private double radio;

    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.radio = 1;
    }

    public Circulo(double radio) {
        this.x = 0;
        this.y = 0;
        this.radio = radio;
    }

    public Circulo(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getRadio() {
        return radio;
    }
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
    public boolean contiene(Circulo otro) {
        double distancia = Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
        return distancia + otro.radio <= this.radio;
    }
    public boolean sobrepone(Circulo otro) {
        double distancia = Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
        return distancia < (this.radio + otro.radio);
    }    
}
