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
public class DecoRepeteur extends DecorateurCommande
{
    private int _nbExec;
    public DecoRepeteur(ICommande commande, int nbExec)
    {
        super(commande);
        _nbExec = nbExec;
    }
    
    public void executer(ISortie sortie)
    {
        for(int i = 0; i < _nbExec; i++)
        {
            super.executer(sortie);
        }
    }
}
