package Entidades;

public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora(){};

    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }   

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int somar() {
        int soma = num1 + num2;
        return soma;
    }

    public int subtrair(){
        int sub = num1 - num2;
        return sub;
    }

    public int multiplicar(){
        int multi = num1 * num2;
        return multi;
    }

    public double dividir(){
        double div = num1 / num2;
        return div;
    }
  
    @Override
    public String toString() {
        return "Calculadora [num1=" + num1 + ", num2=" + num2 + "]";
    }
}
