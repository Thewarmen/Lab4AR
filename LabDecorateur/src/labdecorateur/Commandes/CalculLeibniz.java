/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdecorateur.Commandes;

import labdecorateur.Interfaces.ICommande;
import labdecorateur.Interfaces.ISortie;

/**
 *
 * @author etudiant
 */
public class CalculLeibniz implements ICommande
{
    private ISortie sortie;
    public CalculLeibniz(ISortie s)
    {
        sortie = s;
    }

    @Override
    public void executer(ISortie sortie) 
    {
        
    }
    
}
