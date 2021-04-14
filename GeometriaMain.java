import src.Quadrado;
import src.Circulo;

public class GeometriaMain {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(2.5);
        quadrado.setDiag(1.41);
        System.out.printf("Quadrado com diagonal = 1.41\n");
        System.out.printf(" -----> Area do quadrado = %.3f Cm²\n", quadrado.getArea());
        System.out.printf(" -----> Perimetro do quadrado = %.3f Cm \n", quadrado.getPerimetro());
        System.out.printf(" -----> Diagonal do quadrado = %.3f Cm \n", quadrado.getDiag());


        quadrado.setDiag(Math.sqrt(2));
        System.out.printf("Quadrado com diagonal da classe Math\n");
        System.out.printf(" -----> Diagonal do quadrado = %.3f Cm\n", quadrado.getDiag());

        Circulo circulo = new Circulo(2.5);

        circulo.setPi(3.14);
        System.out.printf("Circulo com Pi = 3.14\n");
        System.out.printf(" -----> Area do circulo = %.3f Cm² \n", circulo.getArea());
        System.out.printf(" -----> Perimetro do circulo = %.3f Cm \n", circulo.getCircunferencia());

        circulo.setPi(Math.PI);
        System.out.printf("Circulo com Pi com classe Math\n");
        System.out.printf(" -----> Area do circulo =  %.3f Cm² \n", circulo.getArea());
        System.out.printf(" -----> Perimetro do circulo = %.3f Cm \n", circulo.getCircunferencia());

    }
}

