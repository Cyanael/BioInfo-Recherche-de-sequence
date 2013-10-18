
public class AlgoNaif {



	public void run(char[] text, char[] pattern) {

		System.out.println("Algorithme : Naif");
		
		long startTime = System.currentTimeMillis();

		int tailleS = text.length;
		int tailleM = pattern.length;

		for (int i=0; i<tailleS-tailleM; i++) {
			if (pattern[0] == text[i]) {
				//System.out.println("première lettre trouvée emplacement: " + i);
				for (int j=1; j<tailleM; j++) {
					if (pattern[j] == text[i+j]) {
						//System.out.println(pattern[j]);
						//System.out.println(text[i+j]);
						if (j==tailleM-1){
							System.out.println("Motif trouvé place : " + i);
							
							long endTime = System.currentTimeMillis();
							System.out.println("Temps d'exécution : "+(endTime-startTime)+" ms\n");
							return;
						}
					}
					else
						break;
				}
			}
		}
		System.out.println("Motif non trouvé");

		long endTime = System.currentTimeMillis();
		System.out.println("Temps d'exécution : "+(endTime-startTime)+" ms\n");
	}
}
