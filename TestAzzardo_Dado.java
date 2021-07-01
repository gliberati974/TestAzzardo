/*
 * 
 * Author Giuseppe Liberati.
 */
	public class TestAzzardo_Dado {

		public static void main(String[] args) {
			// TODO: implementare un test per scoprire quale dei tre dadi è truccato.
		
		
			Dado1 d1 = new Dado1();
			Dado2 d2 = new Dado2();
			Dado3 d3 = new Dado3();
		
	
			float sommaValoriDado1 = 0;
			float sommaValoriDado2 = 0;
			float sommaValoriDado3 = 0;
			final int NUM_LANCI_DADI = 999999;
			float mediaDado1;
			float mediaDado2;
			float mediaDado3;
		
		
			for(int i=1; i<NUM_LANCI_DADI; i++) {
			
				sommaValoriDado1 += d1.lancio();
				sommaValoriDado2 += d2.lancio();
				sommaValoriDado3 += d3.lancio();
			
			}
			
			//Utilizzo questa stampa come riprova della somma dei valori per il calcolo della media.
			
			System.out.println(sommaValoriDado1 + " Somma valori per calcolo media");
			System.out.println(sommaValoriDado2 + " Somma valori per calcolo media");
			System.out.println(sommaValoriDado3 + " Somma valori per calcolo media");
			System.out.println("");
			
			mediaDado1 = sommaValoriDado1/NUM_LANCI_DADI;
			mediaDado2 = sommaValoriDado2/NUM_LANCI_DADI;
			mediaDado3 = sommaValoriDado3/NUM_LANCI_DADI;
		
			System.out.println("Test dado 1: " + mediaDado1);
			System.out.println("Test dado 2: " + mediaDado2);
			System.out.println("Test dado 3: " + mediaDado3);
			System.out.println("");
			System.out.println("Il dado truccato è il numero 3");
		
		}
	}
