package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] tabell : matrise) {

			for (int tall : tabell) {
				System.out.print(tall + " ");
			}

			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String output = "";

		for (int tabell[] : matrise) {

			for (int tall : tabell) {

				output = output + tall + " ";
			}

			output = output + "\n";
		}

		return output;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] output = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {

				output[i][j] = matrise[i][j] * tall;
			}
		}

		return output;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] != b[i][j]) {

					return false;
				}
			}
		}

		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] output = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {

				output[i][j] = matrise[j][i];
			}
		}

		return output;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		if (a[0].length != b.length) {
			throw new IllegalArgumentException(
					"Ikke samme antall kolonner i første matrisen, som rader i den andre matrisen");
		}
		
		int[][] output = new int[b.length][a[0].length];

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b[0].length; j++) {
				
				output[i][j] = 0;
				
				for (int k = 0; k < a[0].length; k++) {

					output[i][j] += (a[i][k] * b[k][j]);
				}
			}
		}

		return output;
	}
}
