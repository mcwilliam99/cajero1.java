/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo1;

/**
 *
 * @author fvp
 */
public class ClaseHija_Retiro extends ClasePadre_Abstracta {
    
    public void Transacciones(){
        
        System.out.println("Cuanto deseas retirar del cajero?" );
        Retiro();
        try {
            
      
        if(retiro <= getSaldo()){

            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("------------------------------------");
            System.out.println("Has Retirado de tu cuenta:" + retiro);
            System.out.println("Tu nuevo saldo actual es: " + getSaldo());
            System.out.println("------------------------------------");
           
            
        } else {
            System.out.println("------------------------------------");
            System.out.println("Fondos insuficientes!");
            System.out.println("------------------------------------");
        }
          } catch (Exception e) {
              System.out.println("Su transacion no puede ser procesada "+ e); }finally{
            System.out.println("operacion exitosa !!");
        
        }
        
        
        
    }
    
    
}
