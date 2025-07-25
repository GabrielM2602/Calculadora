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

        System.out.println(cal.toString());
        leia.close();

    }
}
