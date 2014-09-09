package monpackage;

import java.util.Scanner;

public class sujet1 {

	/**
	 * @param args
	 */
	public static void main2(String[] args) {
		// TODO Auto-generated method stub


		double departement21[] = {2,0.86,1.72,21.93,1.29,2.58,21.93};
		double departement25[] = {2.1,0.83,1.66,22.5,1.2,2.4,22.5};
		double departement39[] = {2.1,0.83,1.66,22.5,1.23,2.46,25};
		double departement44[] = {2.2,0.79,1.58,24.19,1.19,2.37,24.19};
		double departement72[] = {2.15,0.79,1.58,22.86,1.19,2.38,22.86};
		double departement73[] = {2.4,0.84,1.68,25.4,1.26,2.52,25.4};
		double departement74[] = {3.15,0.92,1.84,17.3,1.38,2.76,17.3};
		double departement75[] = {2.5,1,1.24,0,1.5,1.5,0};
		double departement85[] = {2.3,0.8,1.6,22.2,1.2,2.4,22.2};
		double departement90[] = {2.2,0.83,1.66,21,1.15,2.3,21};

		System.out.println("Déplacement effectué dans quel département ?");

		Scanner departement = new Scanner(System.in);
		int dept= departement.nextInt();

		switch(dept){
			case 21:

			double TarifNuitDimanche = departement21 [4];
			double priseencharge = departement21 [0];
				Scanner Type = new Scanner (System.in);
				System.out.println("Type de déplacement AR ou AS ?");
				String t = Type.next();
				if (t == "AR"){
					Scanner trajet = new Scanner (System.in);
					System.out.println("Trajet effectué dans la nuit du dimanche ? (Oui/Non)");
					String T = trajet.next();

					if(T == "Oui"){
					Scanner KM = new Scanner (System.in);
					System.out.println("Quel kilométrage ?");
					int nbkm = KM.nextInt();

					double Tarifapayer = priseencharge + (nbkm * TarifNuitDimanche);
					System.out.println("Le tarif final est " + Tarifapayer + "");

					}
				}

		System.out.println("Quel jours est effectué le déplacement ?");

		Scanner jours = new Scanner(System.in);
		String j= jours.next();

	}

	}
	}
