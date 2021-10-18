/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdecorateur.Decorateurs;

import java.sql.Timestamp;
import labdecorateur.Interfaces.ICommande;
import labdecorateur.Interfaces.ISortie;

/**
 *
 * @author etudiant
 */
public class DecoLog extends DecorateurCommande
{
    
    public DecoLog(ICommande commande) 
    {
        super(commande);
    }
    
    public void executer(ISortie sortie)
    {
        executerAvecLog(sortie, new Timestamp(System.currentTimeMillis()));
        super.executer(sortie);   
    }
    
    private void executerAvecLog(ISortie sortie, Timestamp time)
    {
        sortie.ecrire("La methode executer est appelée à: " + time + "\n");
    }
}
