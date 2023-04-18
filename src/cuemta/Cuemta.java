/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuemta;

/**
 *
 * @author info7
 */
public class Cuemta {
     private String Nombre;
     private String NroCuenta;
     private double Interes; 
     private double Saldo;

    public Cuemta() {
    }

    public Cuemta(String Nombre, String NroCuenta, double Interes, double Saldo) {
        this.Nombre = Nombre;
        this.NroCuenta = NroCuenta;
        this.Interes = Interes;
        this.Saldo = Saldo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNroCuenta(String NroCuenta) {
        this.NroCuenta = NroCuenta;
    }

    public void setInteres(double Interes) {
        this.Interes = Interes;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
     public String getNombre() {
        return Nombre;
    }

    public String getNroCuenta() {
        return NroCuenta;
    }

    public double getInteres() {
        return Interes;
    }
    public double getSaldo() {
        return Saldo;
    }
    public boolean ingreso (double importe){
        if (importe > 0){
            Saldo += importe;
            return true;
        }else{
            return false;
        }
    }
    public boolean extraccion (double importe){
        if (importe > 0 && Saldo >= importe){
            Saldo -= importe;
            return true;
        }else{
            return false;
        }
    }
    public boolean transferencia (Cuemta cuentaDestino, double importe){
      if(extraccion (importe) && cuentaDestino.ingreso (importe)){
          return true;
          }else{
          return false;
      }
     
}

}
    

