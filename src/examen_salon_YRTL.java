
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Y.R.T.L.
. */
public class examen_salon_YRTL {
    
     public static void imprimirventadecocheYRTL() {
        Scanner in = new Scanner(System.in);
        double descuento, monto_de_pago, monto_del_descuento, precio_del_producto;
        String nombre_del_producto;
        String tecla_repetir;
        do {
            System.out.print("Ingrese el nombre del producto: ");
            nombre_del_producto = in.nextLine();
            System.out.print("Ingrese el valor de descuento: ");
            descuento = in.nextDouble();
            System.out.print("Ingrese el valor de precio del producto: ");
            precio_del_producto = in.nextDouble();
            in.nextLine();
            monto_del_descuento=descuento*precio_del_producto/100;
            monto_de_pago=precio_del_producto-monto_del_descuento;
            System.out.println("Nombre del producto: " + nombre_del_producto);
            System.out.println("Valor de monto de pago: " + monto_de_pago);
            System.out.println("Valor de monto del descuento: " + monto_del_descuento);
            System.out.println();
            do {
                System.out.print("\u00BFDesea repetir el proceso? (S/N): ");
                tecla_repetir = in.nextLine();
            } while (!tecla_repetir.equalsIgnoreCase("s") && !tecla_repetir.equalsIgnoreCase("n"));
        } while (tecla_repetir.equalsIgnoreCase("s"));
    }

    
    public static void imprimirSumadeoperadoresYRTL(){
        int n1,n2, total=1;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        n1=leer.nextInt();
        System.out.println("Ingresa la operacion: ");
        String op=leer.next();
        System.out.println("Ingrese el segundo numero: ");
        n2=leer.nextInt();
        if(null != op)switch (op) {
            case "+":
                total=n1+n2;
                break;
            case "-":
                total=n1-n2;
                break;
            case "x":
                total=n1*n2;
                break;
            default:
                break;
        }
if("/".equals(op)){
            total=n1/n2;
        }
        System.out.println("el Resultado es "+n1+" "+op+" "+n2+ " = "+total);
}
    
 
    public static void main(String []args){
	System.out.println("Ingrese la opción que desee probar:");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){    
            case 1: imprimirventadecocheYRTL();break;
            case 2: imprimirSumadeoperadoresYRTL(); break; 
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("\nIngrese la opción que desee probar:");            
            opcion =leer.nextInt();
        }
        }   
}

   
    

