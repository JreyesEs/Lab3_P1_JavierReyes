/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_p1_javierreyes;
import java.util.Scanner;
/**
 *
 * @author Javier Reyes
 */
public class Lab3_P1_JavierReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        // TODO code application logic here
        boolean salir = false;
        int opcion;
        while (!salir){
            System.out.println("Bienvenido al menu del laboratorio 3");
            System.out.println("Que va a seleccionar: ");
            System.out.println("1. Triangulo");
            System.out.println("2. Calculando PI");
            System.out.println("3. Construyendo Casas");
            System.out.println("4. Salir");
            
            opcion = lea.nextInt();
            
            switch (opcion){
                
                case 1:
                    System.out.println("Selecciono la opcion, Triangulo");
                    
                    System.out.println("Ingrese el tamaño de la figura(4 a 16): ");
                    int size = lea.nextInt();
                    System.out.println("Ingrese el caracter para el triangulo superior: ");
                    
                    
                                while (size < 4 || size > 16 ){
                                    System.out.println("Ingrese los datos dentro del rango");
                                    System.out.println("Ingrese el tamaño de la figura(4 a 16): ");
                                    size = lea.nextInt();
                                }
                                    for (int i = 1; i <= size; i++){ 
                                        for (int j = size; j >= i; j--){
                                            System.out.print("*");
                                        }
                                        System.out.println();
                                    }
                    
                    
                    
                    break;
                    
                case 2:
                    System.out.println("Selecciono la opcion, Calculando PI");
                    
                    System.out.println("Ingrese el limite de la sumatoria: ");
                    int num = lea.nextInt();
                    int result = 0;
                    
                    result = ((-1)*num / 2(num)+1) * 4;   
                        
                    
                    
                    
                    
                    
                    break;
                    
                case 3:
                    System.out.println("Selecciono la opcion, Construyendo casas");
                    
                    System.out.println("ingrese el tamaño de la figura: ");
                    int n2 = lea.nextInt();
                    
                    while (n2 < 4){
                        System.out.println("El tamaño de la figura debe ser mayor a 4");
                        System.out.println("Ingrese el tamaño de la figura:");
                        n2 = lea.nextInt();
                    }
                    
                    // for utilizado para el triangulo
                    for (int i = 0; i <= n2; i++){
                        for (int j = n2-i; j > 0; j--){
                            System.out.print(" ");
                        }
                        
                        for (int j = 0; j < i; j++){
                            System.out.print(" *");
                        }
                        System.out.println("");
                        
                    } 
                    
                    //for utilizado para el cuadrado
                    for(int i=0; i<n2; i++){
                        for (int k=0; k<n2; k++){
                            System.out.print(" *");
                        }
                        System.out.println("");
                    }
                    
                    break;
                    
                case 4: 
                    
                    salir = true;
                    break;
                    
                
            }
        }
    }
}
