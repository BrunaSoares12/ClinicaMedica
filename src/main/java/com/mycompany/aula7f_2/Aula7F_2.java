/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula7f_2;
import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author bruni
 */
public class Aula7F_2 {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner ler = new Scanner(System.in);
        Date data = null;
        String x,y,z,u,l,k;
        String a,b,c;
        double w,m,taxa;
        int pr;
        System.out.println("Sobre o Médico...");
        
        System.out.println("Digite o nome: ");
        a = ler.nextLine();
        System.out.println("Digite o crm: ");
        b = ler.nextLine();
        System.out.println("Digite o Telefone de Contato: ");
        c = ler.nextLine();
        
        System.out.println("Sobre o Paciente... ");
        System.out.println("Digite o nome: ");
        x = ler.nextLine();
        System.out.println("Digite o endereço: ");
        y = ler.nextLine();
        System.out.println("Digite o cpf: ");
        z = ler.nextLine();
        System.out.println("Digite a identidade: ");
        u = ler.nextLine();
        System.out.println("Digite o peso: ");
        w = ler.nextDouble();
        System.out.println("Sobre o Procedimento...");
        System.out.println("Digite a Descrição: ");
        l = ler.nextLine();
        System.out.println("Digite a Data: ");
        k = ler.next();
        
        try {
            data = sdf.parse(k);
        }catch (java.text.ParseException e){return;
        }
        System.out.println("Digite o valor: ");
        m = ler.nextDouble();
        
        Paciente pac=new Paciente(x,y,z,w,u);
        Medico Med = new Medico(a,b,c);
        Procedimentos proc=new Procedimentos(data,l,m);
        
        System.out.println("Digite o numero de procedimentos: ");
        pr = ler.nextInt();
        taxa=proc.Taxa(pr);
        System.out.println("Taxa: R$" +taxa);
    }
}
