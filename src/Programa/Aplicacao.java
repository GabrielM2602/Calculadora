package Programa;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Entidades.Calculadora;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Calculadora cal = new Calculadora();

        cal.setNum1(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro valor: ")));
        cal.setNum2(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo valor: ")));
        

        System.out.println("A soma dos valores é: "+cal.somar());
        System.out.println("A subtração do 1º pelo 2º valor é: "+cal.subtrair());
        System.out.println("A multiplicação dos valores é: "+cal.multiplicar());
        System.out.println("A divisão do 1º pelo 2º valor é: "+cal.dividir());

        System.out.println(cal.toString());
        leia.close();

    }
}
