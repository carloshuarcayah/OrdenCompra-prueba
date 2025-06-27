import java.util.Date;

/*
* Se requiere crear la clase OrdenCompra con los siguientes campos privados: identificador tipo Integer autoincremental, descripcion String, fecha tipo Date, cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos con 4 elementos: Producto[] productos.

En la clase OrdenCompra, crear constructor que inicialice solo la descripción.

En la clase OrdenCompra, crear métodos getter para todos los atributos.

En la clase OrdenCompra implementar sólo métodos set para cliente y fecha.

Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando el metodo public void addProducto (Producto producto), nada más, es decir no se pueden agregar en el constructor ni en métodos setter.

La clase OrdenCompra debe tener un metodo que devuelva el gran total, sumando los precios de los productos.

* */
public class OrdenCompra {
    private int id;
    private static int ultimoId;

    private String description;
    private Date fecha;

    private Cliente cliente;
    private Producto[] productos;

    //ver cuantos productos hay
    private int contador;

    public OrdenCompra(String description) {
        //EL ID EMPIEZA CON 0 Y LUEGO INCREMENTA, Y ESPERA AL SIGUIENTE OBJETO ORDENCOMPRA
        this.id=ultimoId++;
        this.description = description;
    }

    public OrdenCompra addProducto(Producto producto){
        //SI NO HAY MAS DE 4 PRODUCTOS
        if(contador<4){
            if(this.contador==0){
                this.productos= new Producto[4];
            }
            //ASIGNAMOS Y LUEGO SUMAMOS
            this.productos[contador++]=producto;
        }
        return this;
    }

    //FALTA INFORMACION DE MOMENTO
    public void granTotal(){
        int suma=0;
        System.out.println("Productos");
        for (Producto producto:this.productos){
            System.out.println(producto.getNombre()+": "+producto.getPrecio());
            suma+=producto.getPrecio();
        }
        System.out.println("Total a pagar: "+suma+"\n-------------------------------------------");
    }

    public int getId() {
        return id;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public String getDescription() {
        return description;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
