public class TestPromedioDesviacion {
    public static void main(String[] args) {
        PromedioDesviacion prd=new PromedioDesviacion(10);
       
        System.out.println("Ingrese 10 numero por favor:");
        prd.lecturaNros();
        System.out.printf("El promedio es: %.2f%n",prd.promedio());
        System.out.printf("La desviacion estandart es: %.5f%n ",prd.desviacion());
    }
}
//VENTAJAS DE LA POO:
//- Se divide en metodos, una para cada tarea, es mas organizado, pues la estructurada todo lo tiene mas lineal y mezclado.
//- Por ejemplo la clase PromedioDesviacion se puede usar varias veces en distintas ocasiones que uno desees, no obstante en lo estructurado habria que copiar y pegar el codigo para usarlo nuevamente.
//- Los atributos en una clase se pueden proteger, ya sea de manera conjunta o individual, lo cual no se puede en el otro tipo de programacion.
//- En la POO es mas facil añadir nuevos metodos que pueda realizar a clase, en cambio con la otra forma se necesita mas codigo y se aumenta el riesgo de tener errores.
//- En la POO se facilita la logica debido al orden que tiene en su estructura.

