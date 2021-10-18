/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdecorateur.Decorateurs;

import java.time.Duration;
import java.time.Instant;
import labdecorateur.Interfaces.ICommande;
import labdecorateur.Interfaces.ISortie;

/**
 *
 * @author etudiant
 */
public class DecoDuree extends DecorateurCommande
{
    
    public DecoDuree(ICommande commande) 
    {
        super(commande);
    }
   
    public void executer(ISortie sortie)
    {
        Instant start = java.time.Instant.now();
        super.executer(sortie);
        Instant end = java.time.Instant.now();
        Duration between = java.time.Duration.between(start, end);
        executerAvecDuree(sortie, between);
    }
    
    private void executerAvecDuree(ISortie sortie, Duration between)
    {
        String s = String.format("%dD, %02d:%02d:%02d.%04d \n", between.toDays(), between.toHours(), between.toMinutes(), between.getSeconds(), between.toMillis());
        sortie.ecrire(" à pris:" + s + " à s'executer.\n");
    }
}
