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

public class Operaciones {
    private Racional r1, r2;
    
    //creamos los cconstructores correspondientes
    
    public Operaciones (){
        r1 = new Racional(0,0);//iniciamos los constructores
        r2 = new Racional(0,0);
    }
    
    //se sobrecarga el constructor
    public Operaciones (Racional r1, Racional r2){
        this.r1 = r1;
        this.r2 = r2;
    }
    
    //aplicamos los metodos setter y getter
    
    public Racional getr1(){
        return r1;
    }
    
    public void setr1(Racional r1){
        this.r1 = r1;
    }
    
    public Racional getr2(){
        return r2;
    }
    
    public void setr2(Racional r2){
        this.r2 = r2;
    }
    
    
    //aplicamos los metodos matematicos que se nos pide anteriormente
    
    public float sumar(){
        return ((r1.getnumerador()*r2.getdenominador())+(r1.getdenominador()*r2.getnumerador()))/(r1.getdenominador()*r2.getdenominador());//Directamente retornamos el valor de la operacion
    }
    
    public float dividir(){
        return (r1.getnumerador()*r2.getdenominador())/(r1.getdenominador()*r2.getnumerador());
    }
    
    //creamos los metodos mostrar de los respectivos
    
    public String mostrarSuma(){
        return "La suma de los racionales s: " + sumar();
    }
    public String mostrarDivicion(){
        return "La divacion de los radicales es" + dividir();
    }
    
}
