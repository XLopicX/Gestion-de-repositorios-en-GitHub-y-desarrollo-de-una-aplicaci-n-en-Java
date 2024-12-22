import java.util.Random;
import java.util.Scanner;

public class main {
	static int matriu[][] = new int[5][5];
	
	public static void main(String[] args) {
		omplirMatriu();
        mostrarTaula();
        Scanner scan = new Scanner(System.in);
        System.out.println("Quin numero vols buscar?");
        int numero = scan.nextInt();
        String resultat = buscarInt(numero);
        if (resultat.equals("n")) {
            System.out.println("No s'ha trobat el numero");
        }
        else {
            System.out.println("La fila on es troba el numero es la: " + resultat.charAt(0));
            System.out.println("La columna on es troba el numero es la: " + resultat.charAt(2));
        }
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
    
    public static String buscarInt(int numero) {
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                if (matriu[i][j] == numero) {
                    return (i + 1) + ":" + (j + 1); // Odio que el primer sigui 0 per tant li sumem 1 per defecte
                }
            }
        }
        return "n";
    }
}
