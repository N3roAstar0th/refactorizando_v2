package figuras;
public class Circunferencia {
    public static final double PI = 3.1416;
    private double radio;
    private String color;

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void imprimir() {
        this.color = "rojo";
        String color = this.color;
        double d = 2 * radio;
        System.out.println("Di�metro: " + d);
        System.out.println("Color: " + color);
        double area = calcularArea();
        System.out.println(area);
    }

    private double calcularArea() {
        return 2 * PI * radio * radio;
    }

    public boolean esIgual (boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            return radio1 == radio2;
        }
        else {
            return Math.abs(radio1 - radio2) < 1;
        }
    }
}