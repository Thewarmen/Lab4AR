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
public class CalculMonteCarlo implements ICommande
{

    @Override
    public void executer(ISortie sortie) 
    {
        int numThrows = 100000;
        int inCircle= 0;
		for(int i= 0;i < numThrows;i++){
			//a square with a side of length 2 centered at 0 has 
			//x and y range of -1 to 1
			double randX= (Math.random() * 2) - 1;//range -1 to 1
			double randY= (Math.random() * 2) - 1;//range -1 to 1
			//distance from (0,0) = sqrt((x-0)^2+(y-0)^2)
			double dist= Math.sqrt(randX * randX + randY * randY);
			//^ or in Java 1.5+: double dist= Math.hypot(randX, randY);
			if(dist < 1){//circle with diameter of 2 has radius of 1
				inCircle++;
			}
		}
        double pi = 4.0 * inCircle / numThrows;
        sortie.ecrire(Double.toString(pi));
    }
    
}
