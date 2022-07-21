import javax.swing.*;

public  class Calculadora {
     private  String marca;
     private String anio;

    public Calculadora(String marca, String anio) {
        this.marca=marca;
        this.anio=anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getAnio() {
        return anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    @Override
    public String toString() {
        return "Calculadora{" +
                "marca='" + marca + '\'' +
                ", anio='" + anio + '\'' +
                '}';
    }

    public void iniciar (){
        System.out.println("inicio de la calculadora");
        while (true){
                    double num1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO"));
                    double num2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO"));
                    int operacion = Integer.parseInt(JOptionPane.showInputDialog("1:+\n2:-\n3:*\n4:/"));
                    switch (operacion){
                        case 1: sumar(num1,num2);break;
                        case 2: restar(num1,num2);break;
                        case 3: mult(num1,num2);break;
                        case 4: dividir(num1,num2);break;
                        default:JOptionPane.showMessageDialog(null,"la operacion no es valida");
            }
        }
    }

    public void dividir(double num1, double num2) {
        System.out.println("el resultado es: "+(num1/num2));
    }
    public void restar(double num1, double num2) {
        System.out.println("el resultado es: "+(num1-num2));

    }
    public void mult(double num1, double num2) {
        System.out.println("el resultado es: "+(num1*num2));

    }

    public void sumar(double num1, double num2) {
        System.out.println("el resultado es: "+(num1+num2));


    }


}
