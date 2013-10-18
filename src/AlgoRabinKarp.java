
public class AlgoRabinKarp {

	public void run(char[] text, char[] pattern) {
		
		System.out.println("Algorithme : RK");
		
		long startTime = System.currentTimeMillis();

		int textSize = text.length;
		int patternSize = pattern.length;

		String valPattern = "";
		for (int i =0; i<patternSize; i++) {
			valPattern += String.format("%03d", (int)pattern[i]); // Genius mode
			// formate la chaine avec 3 chiffres (ajoute des zéros) 
		}

		String buffer = "";
		for (int i =0; i<patternSize; i++)
			buffer += String.format("%03d", (int)text[i]);

		for (int i=patternSize; i<textSize-patternSize; i++) {

			if (buffer.equals(valPattern)) {
				System.out.println("Motif trouvé place :"+(i-patternSize));
				
				long endTime = System.currentTimeMillis();
				System.out.println("Temps d'exécution : "+(endTime-startTime)+" ms\n");
				return;
			}
			buffer = buffer.substring(3); // enlève les 3 premiers charactères
			buffer += String.format("%03d", (int)text[i]);

		}
		System.out.println("Motif non trouvé");

		long endTime = System.currentTimeMillis();
		System.out.println("Temps d'exécution : "+(endTime-startTime)+" ms\n");
	}

}

