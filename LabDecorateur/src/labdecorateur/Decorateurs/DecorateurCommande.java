/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdecorateur.Decorateurs;

import labdecorateur.Interfaces.ICommande;
import labdecorateur.Interfaces.ISortie;

/**
 *
 * @author etudiant
 */
public abstract class DecorateurCommande implements ICommande
{
    private ICommande commande;
    
    public DecorateurCommande(ICommande c)
    {
        commande = c;
    }

    @Override
    public void executer(ISortie sortie) 
    {
        commande.executer(sortie);
    }
    
}
