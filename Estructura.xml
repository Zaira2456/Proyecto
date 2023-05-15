import java.util.Scanner;
public class Estructurado
{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String[] codigos = new String [50];
         String[] nombres = new String[50];
         String[] productos1 = new String[50];
         String[] productos2 = new String[50];
         String[] productos3 = new String[50];
         double[] panuno = new double[50];
         double[] pandos = new double[50];
         double[] pantres = new double[50];
         int numClientes;
         String codigo, nombre, producto1, producto2, producto3;
         double pan1, pan2, pan3;
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
                codigos[i] = codigo;
                nombres[i] = nombre;
                productos1[i] = producto1;
                productos2[i] = producto2;
                productos3[i] = producto3;
                panuno[i] = pan1;
                pandos[i] = pan2;
                pantres[i] = pan3;
         }
         for(int i = 0; i < numClientes; i++){
                costototal = costototal + (panuno[i] + pandos[i] + pantres[i]);
         }
         System.out.println("Productos comprados:");
         for(int i = 0; i < numClientes; i++){
                System.out.println(productos1[i]);
                System.out.println(productos2[i]);
                System.out.println(productos3[i]);
         }
         System.out.println("El total de todos los productos comprados es: " + costototal);
     }
}
