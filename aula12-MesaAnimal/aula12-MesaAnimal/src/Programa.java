import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Programa {

    public static void main(String[] args) {

        Cachorro c1 = new Cachorro(1, "Bob", 5);
        System.out.println(c1);
        c1.emitirSom();
        c1.correr();

        Cavalo cav1 = new Cavalo(2, "Corcel", 6);
        System.out.println(cav1);
        cav1.emitirSom();
        cav1.correr();

        Preguica p1 = new Preguica(3, "Flecha", 9);
        System.out.println(p1);
        p1.emitirSom();
        p1.subirArvore();
    }

}
