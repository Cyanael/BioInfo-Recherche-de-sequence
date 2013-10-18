
public class AlgoKMP {

	
	void kmp_tableau(char[] pattern)
	{
	    //extern int T[];
	    int i = 0;
	    int j = -1;
	    char c = '\0';              //Donc c=P[-1]
	 
	    T[0] = j;                   //c'est-à-dire -1
	    while (P[i] != '\0') {      //Tant que l'on n'a pas atteint la fin de la chaine
	/* ATTENTION la condition suivante est fausse, contre exemple avec la chaine "ABABABAB", il faut plutot mettre if((P[i] == P[j]) && j < ((i+(i%2))/2)) */
	        if (P[i] == c) {        /* Si P[i]==P[j] donc si le caractère qu'on regarde est le même que le caractère suivant la fin
	                                 * du dernier motif initial trouvé */
	            T[i + 1] = j + 1;   //alors le motif est continué, et on incrémente i et j.
	            ++j;
	            ++i;
	        } else if (j > 0) {     //Sinon si au caractère précédant il existe un motif
	            j = T[j];           //on va regarder le motif initial précédant qui peut correspondre a la lettre où l'on était.
	        }
	        else {                  /* Sinon j=0 ou -1, i.e. si les lettres qui précédent la ième suivie de la ième ne peuvent
	                                 * correspondre a aucun marquage initiale */
	            T[i + 1] = 0;       //alors on indique qu'il n'y a aucun motif initiale pour cette lettre.
	            ++i;
	            j = 0;              //Cet affectation ne sert en fait que lorsque j=-1.
	        }
	        c = P[j];
	    }
	}
	
	
	public void run(char[] text, char[] pattern) {

		System.out.println("Algorithme : KMP");

		long startTime = System.currentTimeMillis();

		int textSize = text.length;
		int patternSize = pattern.length;

		int m = 0;
		int i = 0;

		// Tant que l'on n'a pas atteint la fin de la chaîne S ou de la chaîne P.
		//while (text[m + i] != '\0' && pattern[i] != '\0')
		while (m+i+1<textSize && i+1<patternSize) 
		{
			if (T[m + i] == pattern[i])
			{
				++i;
			}
			else
			{
				m += i - T[i];    /* la prochaine correspondance partielle possible est à T[i]
	                                 lettre avant celle qu'on vient de regarder. */

				if (i > 0)
					i = T[i];     /* Puisque l'on sait que les T[i]-1 premières lettres à partir
	                                 de m sont bonne, il suffit de regarder P à partir de la T[i]ème
	                                 position. Pour S on peut remarquer que on m+i est maintenant
	                                 égale à (m+i-T[i])+(T[i]) avec les anciennes valeurs. Ce qui
	                                 montre qu'on ne retourne pas en arrière. */
			}
		}


		if (i < patternSize) {
			System.out.println("Motif trouvé place :"+(m));
		}
		else{
			System.out.println("Not Found");
		}


		//System.out.println("Motif trouvé place :");
		//System.out.println("Motif non trouvé");

		long endTime = System.currentTimeMillis();
		System.out.println("Temps d'exécution : "+(endTime-startTime)+" ms\n");
	}
}
