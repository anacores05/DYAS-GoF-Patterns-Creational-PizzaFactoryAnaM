package edu.unisabana.pizzafactory.model.PizzaIntegral;

import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cmari
 */
public class HorneadorPizzaIntegral implements Horneador {
    
    @Override
    public void hornear() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza con masa integral.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
