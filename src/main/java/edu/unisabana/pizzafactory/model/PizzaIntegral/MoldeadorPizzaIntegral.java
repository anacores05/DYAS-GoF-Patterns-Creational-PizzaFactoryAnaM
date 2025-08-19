/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.PizzaIntegral;

import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author cmari
 */
public class MoldeadorPizzaIntegral implements Moldeador {
    
    
    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa integral.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }
    
   @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa integral.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
