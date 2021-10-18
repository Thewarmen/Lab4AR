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
        int count = 100000;
        double pi = 0;
        double denominator = 1;

        for (int x = 0; x < count; x++) {

           if (x % 2 == 0) {
              pi = pi + (1 / denominator);
           } else {
              pi = pi - (1 / denominator);
           }
           denominator = denominator + 2;
        }
        pi = pi * 4;
        sortie.ecrire(Double.toString(pi));
    }
    
}
