/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Procedimentos {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date data = null;
    String descricao;
    Double valor;
    Double pagar;
    public Procedimentos (Date a, String b, Double c)
    { data=a;
    descricao = b;
    valor =c;
    }
    public double Taxa(int quant)
    { this.pagar=valor*quant;
    return pagar;
    }
}
