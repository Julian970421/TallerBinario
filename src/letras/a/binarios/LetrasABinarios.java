/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras.a.binarios;

/**
 *
 * @author Julian Martinez
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetrasABinarios 
{

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) 
        {
            System.out.println();
            System.out.println("1. Encriptar palabra a binario");
            System.out.println("2. Desencriptar numero binario a palabra");
            System.out.println("3. Salir");
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) 
                {
                    case 1:
                        System.out.println("Has seleccionado Encriptar");
                         /////////INGRESO DE VALORES/////////////
                        System.out.println("Ingrese Palabra"); 
                        Scanner entrada = new Scanner(System.in);
                        String palabra = entrada.nextLine();
                        System.out.println("El codigo binario es:");

                        //////////CONVERSION DECIMAL --> ASCII//////////
                        for(int i = 0; i<palabra.length();i++ ) 
                        {
                        char characterValue = palabra.charAt(i);
                        int asciiValue = (int) characterValue;
                        //System.out.println("ASCII: "+asciiValue);

                        ////////CONVERSION ASCII --> BINARIO//////////
                          int exp, digito;
                          double binario;


                          while(asciiValue < 0);

                          exp=0;
                          binario=0;
                          while(asciiValue!=0){
                                  digito = asciiValue % 2;           
                                  binario = binario + digito * Math.pow(10, exp);                                                   
                                  exp++;
                                  asciiValue = asciiValue/2;
                          }
                          
                          System.out.print("0"+(int)binario +"");

                        }
                    break;
                        
                        
                    case 2:
                    System.out.println("Has seleccionado Desencriptar");
                    //System.out.println("Aqui se desencripta Julian");
                    System.out.println("Ingrese Un Valor Binario"); 
                    Scanner binario = new Scanner(System.in);
                    String convbinario = binario.nextLine();
                    System.out.println("El mensaje es: "); 
                    
                    
                   // String convbinario = "0100010101010011010000110100111101001101";   //DIVIDIR EN BYTES PARA REPETIR
                                                                                 //PROCESO DE ARRIBA
                    int AB = 0;
                    int AC = 8;
                    
                    for (int i=0; i<convbinario.length()/8;i++){      ///ULTIMO CAMBIO i=i+8
                        String Z = convbinario.substring(AB, AC);       ///<-- Esto Estaba arriba del for
                        //System.out.println(Z);              ///<-- Esto Estaba arriba del for
                        //System.out.println(convbinario.length()/8);   ///<-- Esto Estaba arriba del for
                        
                        AB=AB+8;
                        AC=AC+8;
                        
                      /////////Conversion BINARIO --> DECIMAL////////
                       String W = Z;
                       int contador = 0;
                       if(W.charAt(7)=='1'){
                           contador = contador + 1;
                           }
                       if(W.charAt(6)=='1'){
                           contador = contador + 2;
                           }
                       if(W.charAt(5)=='1'){
                           contador = contador + 4;
                           }
                       if(W.charAt(4)=='1'){
                           contador = contador + 8;
                           }
                       if(W.charAt(3)=='1'){
                           contador = contador + 16;
                           }
                       if(W.charAt(2)=='1'){
                           contador = contador + 32;
                           }
                       if(W.charAt(1)=='1'){
                           contador = contador + 64;
                           }
                       if(W.charAt(0)=='1'){
                           contador = contador + 128;
                           }
                       //System.out.println();
                       
                       char ZZ =(char) contador;
                       System.out.print(ZZ);
                       
                       
                       
                       //List<String> ascii = new ArrayList();
                       //ascii.add("a");
                       //ascii.add("b");
                       //ascii.add("c");
                       
                       //for(int i=0;i<ascii.size(); i++) {
                       // System.out.println(ascii.get(i));
                       //}
                       
                       
                       
                       
                    }
                    break;
                    case 3:
                        salir = true;
                    break;
                    default:
                    System.out.println("Solo números entre 1 y 3");   
                }    
        }            
    }                 
} 