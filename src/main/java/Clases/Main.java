/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Jesus Alberto
 */
public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        var respuesta = l.crearLista();
       // System.out.println(respuesta);
        respuesta.visualizar();
        
    }
    
    
//    public Lista insertarCabezaLista(int entrada){
//        Nodo nuevo;
//        nuevo = new Nodo(entrada);
//        nuevo.enlace = primero;
//        primero = nuevo;
//        return this;
//    }
}
