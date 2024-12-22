import java.util.Random;

public class main {
	static int matriu[][] = new int[5][5];
	
	public static void main(String[] args) {
		omplirMatriu();
        mostrarTaula();
	}
	
	public static void omplirMatriu() {
        for (int i = 0; i < matriu.length; i++) {
            for (int e = 0; e < matriu[i].length; e++) {
                Random rand  = new Random();
                matriu[i][e] = rand.nextInt(100); // per a que no surtin numeros fumada
            }
        }
    }

    public static void mostrarTaula() {
        System.out.print("\n");
        for (int i = 0; i < matriu.length; i++) {
            for (int e = 0; e < matriu[i].length; e++) {
                if (matriu[i][e] < 10) {
                    System.out.print(matriu[i][e] + "  ");
                }
                else {
                    System.out.print(matriu[i][e] + " ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
