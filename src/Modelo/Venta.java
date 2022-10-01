package Modelo;
public class Venta {

    private Producto productoVen;
    private String idVenta;
    private int cantidadProd;
    private double precio;
    private double totalVenta;
    
    public Venta() {
    }

    public Producto getProductoVen() {
        return productoVen;
    }

    public void setProductoVen(Producto productoVen) {
        this.productoVen = productoVen;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public int getCantidadProd() {
        return cantidadProd;
    }

    public void setCantidadProd(int cantidadProd) {
        this.cantidadProd = cantidadProd;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
    




}