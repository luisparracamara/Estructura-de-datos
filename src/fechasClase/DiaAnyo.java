/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechasClase;

/**
 *
 * @author Luis Parra
 */
public class DiaAnyo {
     private int mes, dia;
    
    public DiaAnyo(int d, int m){
        dia = d;
        mes = m;
    }
    
    public boolean igual(DiaAnyo d){
        if (dia == d.dia && mes == d.mes ) {
            return true;
        }else{
            return false;
        }
    }
    
    public void visualizar(){
        System.out.println("MES = " +mes + ",DIA = "+dia );
    }
}
