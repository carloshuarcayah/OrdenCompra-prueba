import java.util.Date;

/*
* La tarea es crear un proyecto nuevo llamado ProyectoOrdenCompra de la siguiente manera:

Escribir un programa, clase con metodo main, la cual llamaremos EjemploOrdenes:

Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro productos a cada una, cada orden con distintos productos, que no se repitan.

Para cada una imprimir sus valores en consola usando metodo getter incluyendo los productos, donde con el metodo getter obtenemos el arreglo de productos y con un foreach recorremos e imprimimos sus atributos fabricante, nombre y precio. Tener en cuenta en la salida el gran total de cada orden, los clientes, todo.
* */
public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden1= new OrdenCompra("Abarrotes");
        orden1.setCliente(new Cliente("Maria","Blanca"));
        //OBTENEMOS LA HORA DE CREACION
        orden1.setFecha(new Date());
        orden1.addProducto(new Producto("Gloria","Leche",5)).addProducto(new Producto("Nestle","Manjar Blanco",9)).addProducto(new Producto("Nestle","Milo",12)).addProducto(new Producto("Gloria","Mantequilla",7));
        System.out.println("Orden 1:"+orden1.getId());
        System.out.println("Nombre Cliente: "+orden1.getCliente().getNombre()+orden1.getCliente().getApellido()+"\n");
        System.out.println("Fecha creacion de orden:"+orden1.getFecha()+"\n");
        for (Producto p:orden1.getProductos()){
            System.out.println(p);
        }
        orden1.granTotal();

        OrdenCompra orden2=new OrdenCompra("Utiles escolares");
        orden2.setCliente(new Cliente("Renato","Casas"));
        orden2.addProducto(new Producto("Faber Castel","Lapiceros",1));
        orden2.addProducto(new Producto("Justus","Cuadernos",5));
        orden2.addProducto(new Producto("Faber Castel","Regla 30cm",3));
        orden2.addProducto(new Producto("Loro","Cuadernos",3));
        System.out.println("Orden 2:"+orden2.getId());
        System.out.println("Nombre Cliente: "+orden2.getCliente().getNombre()+orden2.getCliente().getApellido()+"\n");
        System.out.println("Fecha creacion de orden:"+orden2.getFecha()+"\n");
        for (Producto p:orden2.getProductos()){
            System.out.println(p);
        }
        orden2.granTotal();

        OrdenCompra orden3= new OrdenCompra("Variados");
        orden3.setCliente(new Cliente("Luis","Peña"));
        orden3.addProducto(new Producto("Sony","PS4",2400));
        orden3.addProducto(new Producto("Porta","Mochila",260));
        orden3.addProducto(new Producto("Coca Cola","Gaseosa personal",3));
        orden3.addProducto(new Producto("Faber Castel","Portaminas",15));
        System.out.println("Orden 3:"+orden3.getId());
        System.out.println("Nombre Cliente: "+orden3.getCliente().getNombre()+orden3.getCliente().getApellido()+"\n");
        System.out.println("Fecha creacion de orden:"+orden3.getFecha()+"\n");
        for (Producto p:orden3.getProductos()){
            System.out.println(p);
        }
        orden3.granTotal();
    }
}
