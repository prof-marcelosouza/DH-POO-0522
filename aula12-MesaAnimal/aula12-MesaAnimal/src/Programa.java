import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Programa {

    public static void main(String[] args) {

        Cachorro cac1 = new Cachorro(1, "Bob", 5);
        System.out.println(cac1);
        cac1.emitirSom();
        cac1.correr();

        Cavalo cav1 = new Cavalo(2, "Corcel", 6);
        System.out.println(cav1);
        cav1.emitirSom();
        cav1.correr();

        Preguica pre1 = new Preguica(3, "Flecha", 9);
        System.out.println(pre1);
        pre1.emitirSom();
        pre1.subirArvore();
    }

}
