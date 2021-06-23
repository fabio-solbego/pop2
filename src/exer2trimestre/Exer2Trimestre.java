/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer2trimestre;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Exer2Trimestre {

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        //Supondo que a população de um país A seja da ordem de 80000 habitantes /n
                //com uma taxa anual de crescimento de 3% e que a população de B /n
                //seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça/n
                //um programa que calcule e escreva o número de anos necessários para 
                //que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
        
 double popA = 80000;
double popB = 200000;

for (int anos = 1; ; anos++) {
    popA = popA * 1.03; //aumenta 3%
    popB = popB * 1.015; //aumenta 1,5%
    if (popA >= popB) {
        System.out.printf("Após %d anos o pais A alcançara o pais B", anos);
        break;
    }
}             
             
    }
}

