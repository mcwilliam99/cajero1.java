/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo1;

/**
 *
 * @author william murillo 
 */
public class ClaseHija_Deposito extends ClasePadre_Abstracta {
    
    
    public void Transacciones(){
        System.out.println("Cuanto desea depositar?");
        Deposito();
           try{
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("------------------------------------");
        System.out.println("Depositaste en tu cuenta: " + deposito);
        System.out.println("Tu nuevo saldo en: " + getSaldo());
        System.out.println("------------------------------------");
        }  catch (Exception e ){
                System.out.println("su operacion  no puede ser procesada en este momento !!!!!  "+ e);
                }finally{
            System.out.println("Su operacion se a realizado  exitosamente !!");
       
}
           
    }
}
