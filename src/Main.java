

public class Main {

	/* Liste des algos : 
	 * recherche naive
	 * algo de Rabin-Karp
	 * algo KMP
	 * construction naive d'arbre de suffixe
	 */
	
	public static void main (String args[]) {
		
		/*
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("Le fichier n'existe pas. Verifiez l'orthographe ou creez un nouveau fichier");
			return;
		}
		*/
		
		// On va commencer par utiliser un string, puis on va le mettre dans un fichier
		
		/*if (args.length < 3 ) {
			System.out.println("Les arguments du programme doivent être de cette forme " +
					": \n <algorithme désiré> <sequence voulue> <motif à chercher>\n"); // <fichier d'entrée>
			return;
		}*/
		
		//System.out.println("sequence : " + args[1]);
		
		//System.out.println("motif : " + args[1]);
		//char[] sequence = args[2].toCharArray();
		String seq = "gaattcgagatgcgaatgagcagcagccattttgatgttgtgagcatcggaacgtttctgcgtccgtacactgtccttttgttacttagataatggctaaggcaagcagtccgggccacaggagtcaaaggcttttcgccagctcctaaacgctggaagtgtaattttttttcttcttataaaattaaacaaacccttttagaaaggaacactcgctttatctcttcgaccgaatttactatacatggatatatatatattatcttctgttcacagttaaaactaggaatagcatagtcataagttaacaccatcatgttgagaacgtcaacattgttcaccaagcgtgtccaaccaagcctattttctagaaacattcttagattgcaatccacagctgcaatccctaagactcaaaaaggtgtcatcttttatgagaataaggggaacctgcattacaaagatatccctgtccccgagcctaagccaaatgaaattttaatcaacgttaaatattctggtgtatgtcacaccgatttacatgcttggcacggcgattggccattacctgttaaactaccattagtaggtggtcatgaaggtgctggtgtagttgtcaaactaggttccaatgtcaagggctggaaagtcggtgatttagcaggtatcaaatggctgaacggttcttgtatgacatgcgaattctgtgaatcaggtcatgaatcaaattgtccagatgctgatttatctggttacactcatgatggttctttccaacaatttgcgaccgctgatgctattcaagccgccaaaattcaacagggtaccgacttggccgaagtagccccaatattatgtgctggtgttactgtatataaagcactaaaagaggcagacttgaaagctggtgactgggttgccatctctggtgctgcaggtggcttgggttccttggccgttcaatatgcaactgcgatgggttacagagttctaggtattgatgcaggtgaggaaaaggaaaaacttttcaagaaattggggggtgaagtattcatcgactttactaaaacaaagaatatggtttctgacattcaagaagctaccaaaggtggccctcatggtgtcattaacgtttccgtttctgaagccgctatttctctatctacggaatatgttagaccatgtggtaccgtcgttttggttggtttgcccgctaacgcctacgttaaatcagaggtattctctcatgtggtgaagtccatcaatatcaagggttcttatgttggtaacagagctgatacgagagaagccttagacttctttagcagaggtttgatcaaatcaccaatcaaaattgttggattatctgaattaccaaaggtttatgacttgatggaaaagggcaagattttgggtagatacgtcgtcgatactagtaaataatagcgtgttacgcacccaaacttttatgaaagtctttgtttataatgatgaggtttataaatatatagtggagcaaagattaatcactaaatcaagaagcagtaccagtattttttctatatcaagtagtgataatggaaatagcccaaatttggcttccgtcgac";
		char[] sequence = seq.toCharArray();
		String mot = "tgatgg";
		char[] motif = mot.toCharArray();
		//char[] motif = args[1].toCharArray();

		
		
		/*
		if (args[0].equals("naif")){
			new AlgoNaif().run(sequence, motif);
		}
		else if (args[0].equals("RK")){
			new AlgoRabinKarp().run(sequence, motif);
		}
		else if (args[0].equals("KMP")){
			new AlgoRabinKarp().run(sequence, motif);
		}
		*/
		
		new AlgoNaif().run(sequence, motif);
		new AlgoRabinKarp().run(sequence, motif);
		new AlgoKMP().run(sequence, motif);
		
	}
}
