package application;

import java.util.Scanner;

import entities.Test;

public class Program {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

        Test x, y;
        x = new Test();
        y = new Test();

        System.out.println("Digite a nota da prova do primeiro bimestre: ");
        x.a = sc.nextDouble();

        System.out.println("Digite a nota do trabalho do primeiro bimestre: ");
        x.b = sc.nextDouble();
        
        System.out.println("Digite a nota da prova do segundo bimestre: ");
        y.a = sc.nextDouble();

        System.out.println("Digite a nota do trabalho do segundo bimestre: ");
        y.b = sc.nextDouble();
      
               
        double mediasem = (x.nota() + y.nota()) / 2;
        
        if (mediasem > 6) {
              System.out.println("A media semestral eh: " + mediasem);
              System.out.println("Parabens! Voce foi aprovado");
        }
        else {
        	System.out.println("A media semestral eh: " + mediasem);
        	System.out.println("Infelizmente voce foi reprovado");
        }
        
        
        sc.close();
        
	}
} 