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
public class DecoNbExec extends DecorateurCommande
{
    public static int count = 0;

    public DecoNbExec(ICommande commande) 
    {
        super(commande);
    }
    
    public void executer(ISortie sortie)
    {
        super.executer(sortie);
        count++;
        executerAvecCompteur(sortie, count);
    }
    
    private void executerAvecCompteur(ISortie sortie, int nbExec)
    {
        sortie.ecrire("La methode a été appelée: " + Integer.toString(nbExec) + " fois\n");
    }
}
