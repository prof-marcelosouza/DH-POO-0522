public class Programa {

    public static void main(String[] args) {

        String[] nomes = new String[5];

        nomes[0] = "Fernando";
        nomes[1] = "Mario";
        nomes[2] = "Carlos";
        nomes[3] = "Simone";
        nomes[4] = "Talita";

        System.out.println(nomes[3]);
        //System.out.println(nomes[9]);

        // Como percorrer arrays?

        // Utilizando o FOR
        for(int i = 0; i < nomes.length; i++) {
            System.out.println("Índice[" + i + "]: " + nomes[i]);
        }

        // Utilizando While
        int j = 0;
        while (j < nomes.length) {
            System.out.println("Índice[" + j + "]: " + nomes[j]);
            j++;
        }

        // Utilizando for each
        int i = 0;
        for(String n : nomes) {
            System.out.println("Índice[" + i + "]: " + n);
            i++;
        }
    }
}
