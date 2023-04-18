/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuemta;

/**
 *
 * @author info7
 */
public class CuentaApp {
    public static void main(String[] args) {
        Cuemta c1 = new Cuemta ("Ailen", "7810", 7, 1000);
        Cuemta c2 = new Cuemta();
        c2.setNombre("Juan");
        c2.ingreso(5000);
        c1.ingreso(2000);
        //System.out.println(c1.getSaldo());
        //System.out.println(c2.getSaldo());
        c1.extraccion(1500);
        //System.out.println(c1.getSaldo());
        c2.transferencia(c1, 3000);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        
    }
    }

