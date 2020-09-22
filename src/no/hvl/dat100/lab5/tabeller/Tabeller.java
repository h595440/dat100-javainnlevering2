package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int tall : tabell) {
			System.out.print(tall + " ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tTekst = "[";
		String output;

		for (int i = 0; i < tabell.length; i++) {
			tTekst = tTekst + tabell[i] + ",";
		}

		if (tabell.length > 0) {
			output = tTekst.substring(0, tTekst.length() - 1);
			return output = output + "]";
		} else {
			return tTekst = tTekst + "]";
		}
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		int i = 0;

		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}

		return sum;
	}

	public static int summer2(int[] tabell) {

		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}

		return sum;
	}

	public static int summer3(int[] tabell) {

		int sum = 0;

		for (int i : tabell) {
			sum += i;
		}

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int t : tabell) {
			if (t == tall) {
				return true;
			}
		}

		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}

		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] newTab = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			newTab[i] = tabell[tabell.length - 1 - i];
		}

		return newTab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i - 1]) {
				return false;
			}
		}

		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] newTab = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {

			newTab[i] = tabell1[i];
		}

		for (int i = 0; i < tabell2.length; i++) {

			newTab[i + tabell1.length] = tabell2[i];
		}

		return newTab;
	}
}
