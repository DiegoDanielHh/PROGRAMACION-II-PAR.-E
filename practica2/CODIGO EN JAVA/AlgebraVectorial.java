public class AlgebraVectorial {
    public double x;
    public double y;
    public double z;

    public AlgebraVectorial(double x, double y) {
        this(x, y, 0);
    }
    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public boolean igual(AlgebraVectorial otro) {
        return this.x == otro.x && this.y == otro.y && this.z == otro.z;
    }
    public AlgebraVectorial sumar(AlgebraVectorial otro) {
        return new AlgebraVectorial(this.x + otro.x, this.y + otro.y, this.z + otro.z);
    }
    public AlgebraVectorial restar(AlgebraVectorial otro) {
        return new AlgebraVectorial(this.x - otro.x, this.y - otro.y, this.z - otro.z);
    }
    public AlgebraVectorial multiplicar(double escalar) {
        return new AlgebraVectorial(this.x * escalar, this.y * escalar, this.z * escalar);
    }
    public double magnitud() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
    public double productoPunto(AlgebraVectorial otro) {
        return this.x * otro.x + this.y * otro.y + this.z * otro.z;
    }
    public AlgebraVectorial productoCruz(AlgebraVectorial otro) {
        return new AlgebraVectorial(this.y * otro.z - this.z * otro.y, this.z * otro.x - this.x * otro.z, this.x * otro.y - this.y * otro.x);
    }
    // a)
    public boolean esPerpendicular(AlgebraVectorial otro) {
        AlgebraVectorial suma = this.sumar(otro);
        AlgebraVectorial resta = this.restar(otro);
        return suma.magnitud() == resta.magnitud();
    }
    // b), c), d)
    public boolean esPerpendicular(AlgebraVectorial otro, String metodo) {
        if (metodo.equals("b")) {
            AlgebraVectorial resta1 = this.restar(otro);
            AlgebraVectorial resta2 = otro.restar(this);
            return resta1.magnitud() == resta2.magnitud();
        } else if (metodo.equals("c")) {
            return this.productoPunto(otro) == 0;
        } else if (metodo.equals("d")) {
            AlgebraVectorial suma = this.sumar(otro);
            return Math.pow(suma.magnitud(), 2) == (Math.pow(this.magnitud(), 2) + Math.pow(otro.magnitud(), 2));
        } else {
            return false;
        }
    }
    public boolean esParalela(AlgebraVectorial otro) {
        if (otro.magnitud() == 0) {
            return this.magnitud() == 0;
        }
        Double r=null;
        if (otro.x != 0) {
            r = this.x / otro.x;
        } else if (otro.y != 0) {
            r = this.y / otro.y;
        } else if (otro.z != 0) {
            r = this.z / otro.z;
        } else {
            return false;
        }
        AlgebraVectorial esperado = otro.multiplicar(r);
        return this.igual(esperado);
    }
    // f)
    public boolean esParalela(AlgebraVectorial otro, String metodo) {
        if (metodo.equals("f")) {
            return this.productoCruz(otro).igual(new AlgebraVectorial(0, 0, 0));
        } else {
            return false;
        }
    }
    // g)
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial otro) {
        if (otro.magnitud() == 0) {
            return new AlgebraVectorial(0,0,0);
        }
        double escalar = this.productoPunto(otro) / Math.pow(otro.magnitud(), 2);
        return otro.multiplicar(escalar);
    }
    // h)
    public double componenteEnDireccion(AlgebraVectorial otro) {
        if (otro.magnitud() == 0) {
            return 0;
        }
        return this.productoPunto(otro) / otro.magnitud();
    }

    public String toString() {
        if (this.z == 0) {
            return "(" + this.x + ", " + this.y + ")";
        }
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}
