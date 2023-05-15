//Clase1 class PanPOO
public class PanPOO
{
    String codigos;
    String nombres;
    String productos1;
    String productos2;
    String productos3;
    double panuno;
    double pandos;
    double pantres;
}

//Clase2 class POO//
import java.util.Scanner;
public class POO
{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int numClientes;
       PanPOO[] losPanes = new PanPOO[50];
       String codigo, nombre, producto1, producto2, producto3;
       double pan1 = 0, pan2 = 0, pan3 = 0;
       double costototal = 0;
       System.out.println("Digite el numero de clientes");
       numClientes = sc.nextInt();
       for(int i=0; i < numClientes; i++){
            System.out.println("Digite el codigo del pedido: ");
            codigo = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite el nombre del producto: ");
            producto1 = sc.next();
            System.out.println("Digite el precio del producto " + producto1 +" :");
            pan1 = sc.nextDouble();
            System.out.println("Digite el nombre del producto: ");
            producto2 = sc.next();
            System.out.println("Digite el precio del producto " + producto2 +" :");
            pan2 = sc.nextDouble();
            System.out.println("Digite el nombre del producto: ");
            producto3 = sc.next();
            System.out.println("Digite el precio del producto " + producto3 +" :");
            pan3 = sc.nextDouble();
            PanPOO unPan = new PanPOO();
            unPan.codigos = codigo;
            unPan.nombres = nombre;
            unPan.productos1 = producto1;
            unPan.productos2 = producto2;
            unPan.productos3 = producto3;
            unPan.panuno = pan1;
            unPan.pandos = pan2;
            unPan.pantres = pan3;
            losPanes[i] = unPan;
       }
       for(int i = 0; i < numClientes; i++){
                costototal = costototal + (losPanes[i].panuno + losPanes[i].pandos + losPanes[i].pantres);
         }
       System.out.println("Productos comprados:");
       for(int i = 0; i < numClientes; i++){
                System.out.println(losPanes[i].productos1);
                System.out.println(losPanes[i].productos2);
                System.out.println(losPanes[i].productos3);
       }
       System.out.println("El total de todo es: $" + costototal);
    }
}
