
import java.util.Scanner;
/**
 * Calcular area de un circulo y volumen de una esfera a partir del radio
 * 
 * @author Jeimmy Naranjo
 * @version 1
 */
public class Principal  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada: radio (r)
        // 1. Definicion de variables
        // Datos de entrada
        double r;
        // Datos de salida
        double area, volumen;
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese valor del radio:");
        r = teclado.nextDouble();
        
        
        // 2. Realizar calculos
        area = Math.PI * Math.pow(r,2);
        volumen = (4/3) * Math.PI * Math.pow(r,3);
        // Las funciones matematicas vienen definidas en la clase Math
        // Se deben llamar de la siguiente forma Math.funcion(argumentos)
        
        
        // 3. Mostrar datos de salida
        System.out.println("El area de un circulo de radio" + r + "es de: " + area);
        System.out.println("El volumen de una esfera de radio" + r + "es de: " + volumen);
        
                                 
      
         
  } //Fin de la clase principal
}