/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdecorateur;

import labdecorateur.Commandes.CalculLeibniz;
import labdecorateur.Decorateurs.DecoDuree;
import labdecorateur.Decorateurs.DecoLog;
import labdecorateur.Decorateurs.DecoNbExec;
import labdecorateur.Decorateurs.DecoRepeteur;
import labdecorateur.Interfaces.ICommande;
import labdecorateur.Interfaces.ISortie;

/**
 *
 * @author etudiant
 */
public class LabDecorateur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ISortie maSortie = new SortieOfficiel();
        maSortie.ecrire("Début Leibniz!!!");
        ICommande commandeLeibniz = new DecoDuree(new DecoRepeteur(new DecoLog(new DecoNbExec(new CalculLeibniz(maSortie))), 3));
        commandeLeibniz.executer(maSortie);
        
        maSortie.ecrire("Début Monte Carlo!!!");
        ICommande commandeMonteCarlo = new DecoDuree(new DecoRepeteur(new DecoLog(new DecoNbExec(new CalculLeibniz(maSortie))), 3));
        commandeMonteCarlo.executer(maSortie);
        
        maSortie.ecrire(("fin!!!"));
    }
    
}
