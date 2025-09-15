public class AlgebraVectorial2 {
    private float a1;
    private float a2;
    private float a3;

    public AlgebraVectorial2(float a1, float a2) {
        this(a1, a2, 0);
    }
    public AlgebraVectorial2(float a1, float a2, float a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }
    public boolean igual(AlgebraVectorial2 otro) {
        return this.a1 == otro.a1 && this.a2 == otro.a2 && this.a3 == otro.a3;
    }
    // a) 
    public AlgebraVectorial2 sumar(AlgebraVectorial2 otro) {
        return new AlgebraVectorial2(this.a1 + otro.a1, this.a2 + otro.a2, this.a3 + otro.a3);
    }
    public AlgebraVectorial2 restar(AlgebraVectorial2 otro) {
        return new AlgebraVectorial2(this.a1 - otro.a1, this.a2 - otro.a2, this.a3 - otro.a3 );
    }
    // b) 
    public AlgebraVectorial2 multiplicar(float escalar) {
        return new AlgebraVectorial2( this.a1 * escalar, this.a2 * escalar, this.a3 * escalar );
    }
    // c) 
    public double magnitud() {
        return Math.sqrt(this.a1 * this.a1 + this.a2 * this.a2 + this.a3 * this.a3);
    }
    // d) 
    public AlgebraVectorial2 normalizar() {
        double mag = this.magnitud();
        if (mag == 0) {
            return new AlgebraVectorial2(0, 0, 0);
        }
        return new AlgebraVectorial2((float)(this.a1 / mag), (float)(this.a2 / mag), (float)(this.a3 / mag));
    }
    // e) 
    public float productoPunto(AlgebraVectorial2 otro) {
        return this.a1 * otro.a1 + this.a2 * otro.a2 + this.a3 * otro.a3;
    }
    // f) 
    public AlgebraVectorial2 productoCruz(AlgebraVectorial2 otro) {
        return new AlgebraVectorial2(this.a2 * otro.a3 - this.a3 * otro.a2, this.a3 * otro.a1 - this.a1 * otro.a3, this.a1 * otro.a2 - this.a2 * otro.a1);
    }

    public boolean verificaParalelogramoRectangulo(AlgebraVectorial2 otro) {
        double diagonal1 = this.sumar(otro).magnitud();
        double diagonal2 = this.restar(otro).magnitud();
        return diagonal1 == diagonal2;
    }
    public String toString() {
        if (this.a3 == 0) {
            return "(" + this.a1 + ", " + this.a2 + ")";
        }
        return "(" + this.a1 + ", " + this.a2 + ", " + this.a3 + ")";
    }
}
