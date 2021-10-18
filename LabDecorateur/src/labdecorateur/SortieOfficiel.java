/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdecorateur;

import labdecorateur.Interfaces.ISortie;

/**
 *
 * @author etudiant
 */
public class SortieOfficiel implements ISortie
{

    @Override
    public void ecrire(String txt) 
    {
        System.out.println(txt);
    }
    
}
