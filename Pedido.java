import java.time.LocalDate;
import java.time.LocalDateTime;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Date;
import  java.time.*;


public class Pedido {

    public int idPedido;
    public String nombreEnvia;
    public String tipoPedido;
    public LocalDate fecharecoleccion;
    public LocalDate fechaentrega;
    public String descripcion;
    public int cantidad;
    public int costo;

    public Pedido(){

    }

    public Pedido(int id, String nombre, String tipo, LocalDate recoleccion, LocalDate entrega, String desc, int cantidad, int costo){
        this.idPedido=id;
        this.nombreEnvia=nombre;
        this.tipoPedido=tipo;
        this.fecharecoleccion=recoleccion;
        this.fechaentrega=entrega;
        this.descripcion=desc;
        this.cantidad=cantidad;
        this.costo=costo;
    }

    public int getidPedido(){
        return idPedido;
    }

    public void setidPedido(int idPedido){
        this.idPedido=idPedido;
    }

    public String getnombreEnvia(){
        return nombreEnvia;
    }

    public void setnombreEnvia(String nombreEnvia){
        this.nombreEnvia=nombreEnvia;
    }

     public String gettipoPedido(){
        return tipoPedido;
    }

    public void settipoPedido(String tipoPedido){
        this.tipoPedido=tipoPedido;
    }

    
     public LocalDate getfecharecoleccion(){
        return fecharecoleccion;
    }

    public void setfecharecoleccion(LocalDate fecharecoleccion){
        this.fecharecoleccion=fecharecoleccion;
    }

    public LocalDate getfechaentrega(){
        return fechaentrega;
    }

    public void setfechaentrega(LocalDate fechaentrega){
        this.fechaentrega=fechaentrega;
    }

    public String getdescripcion(){
        return descripcion;
    }

    public void setdescripcion(String descripcion){
        this.descripcion=descripcion;
    }

     public int getcantidad(){
        return cantidad;
    }

    public void setcantidad(int cantidad){
        this.cantidad=cantidad;
    }

     public int getcosto(){
        return costo;
    }

    public void setcosto(int costo){
        this.costo=costo;
    }

     public void ModificarPedido(String desc){
        this.descripcion = desc;
        System.out.println("La nueva descripcion del pedido es: "+this.descripcion);
    }

    public String toString(){
      try{
      return "No. Pedido: "+this.idPedido+" |Tipo Pedido: "+this.tipoPedido+" | Cantidad: "+this.cantidad+" | Costo: "+this.costo+" | Fecha: "+this.fechaentrega;
      }catch(NullPointerException npe){
        return "sin valores";
      }
    }
}