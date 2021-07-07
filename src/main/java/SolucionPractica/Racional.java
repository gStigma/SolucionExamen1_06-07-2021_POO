/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionPractica;

/**
 *
 * @author gStigma
 * version 1.0
 */

public class Racional {
    private int numerador,denominador;
    
    
    //cramos los constructores correspondientes
    public Racional(){
        numerador = 0;
        denominador= 0;
    }
    
    public Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    //ubicamos los metodos setters y getters
    
    public int getnumerador(){
        return numerador;
    }
    
    public void setnumerador(int numerador){
        this.numerador = numerador;
    }
    
     public int getdenominador(){
        return denominador;
    }
    
    public void setdenominador(int denominador){
        this.denominador = denominador;
    }
    
}
