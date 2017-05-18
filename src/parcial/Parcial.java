/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    
    public static void totalObras() throws FileNotFoundException{
        double sumaTotal = 0;
        Scanner input = new Scanner(new File("gallery.txt"));
        while (input.hasNext()) {        
        do {            
            input.next();
        } while (input.hasNextDouble() == false);
        sumaTotal += input.nextDouble();
        }
        System.out.println("La suma total de las obras es: " + sumaTotal);
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList <Artista> artistas = new ArrayList <Artista>();
        ArrayList <Comprador> compradores = new ArrayList <Comprador>();        
        Scanner input = new Scanner(new File("gallery.txt"));
        PrintStream output = new PrintStream(new File("gallery.txt"));
        
        
        Scanner sc = new Scanner(System.in);
        int nuevoUsuario = 0;
        while (nuevoUsuario != 2) {  
            System.out.println("Desea agregar un nuevo usuario 1. Si 2. No");
            do {                
                nuevoUsuario = sc.nextInt();
            } while (nuevoUsuario != 1 && nuevoUsuario != 2);
            switch(nuevoUsuario){
                case 1:
                    int tipoUsuario = 0;
                    System.out.println("1. Artista    2. Comprador");
                    do {                        
                        tipoUsuario = sc.nextInt();
                    } while (tipoUsuario != 1 && tipoUsuario != 2);
                    String nombre = "";
                    String apellido = "";
                    String curriculum = "";
                    String distinciones = "";
                    switch(tipoUsuario){                        
                        case 1:
                            System.out.print("nombre: ");
                            nombre = sc.next();
                            System.out.print("apellido: ");
                            apellido = sc.next();
                            System.out.print("curriculum: ");
                            curriculum = sc.next();
                            System.out.print("distinciones: ");                            
                            distinciones = sc.next();
                            System.out.print("cantidad de obras: ");
                            int cantidadObras = sc.nextInt();
                            Artista artista = new Artista(curriculum, distinciones, nombre, apellido);
                            artistas.add(artista);
                            output.println(cantidadObras);
                            output.println("Artista:" + nombre + ":" + apellido + ":" + curriculum + ":" + distinciones );
                            for (int i = 0; i < cantidadObras; i++) {
                                System.out.println("Nombre de la obra # " + i);
                                String nombreObra = sc.next();
                                System.out.println("descripcion de la obra # " + i);
                                String descripcion = sc.next();
                                System.out.println("estilo de la obra # " + i);
                                String estilo = sc.next();
                                System.out.println("valor de la obra # " + i);
                                double valor = sc.nextDouble();
                                Obra obras = new Obra(nombreObra, descripcion, estilo, valor);
                                artista.agregarObra(obras);                                
                                output.println(nombreObra + ":" + descripcion + ":" + estilo + ":" + valor);
                            }
                        break;
                            case 2:
                            System.out.print("nombre: ");
                            nombre = sc.next();
                            System.out.print("apellido: ");
                            apellido = sc.next();                            
                            Comprador comprador = new Comprador(nombre, apellido);
                            compradores.add(comprador);
                            output.println("Comprador:" + nombre + ":" + apellido);
                        break;
                        
                    }
               break;
                case 2:
                    break;
            }
        }
//        totalObras();
    }
    
}
