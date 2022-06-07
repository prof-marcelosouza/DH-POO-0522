import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Programa {

    public static void main(String[] args) {

        // É uma interface, portanto não pode ser instanciada.
//        List nossaLista = new ArrayList(); // Implementa o List(Interface)
//
//        nossaLista.add("Felipe");
//        nossaLista.add("Bruno");
//        nossaLista.add("Julia");
//        nossaLista.add("Jade");
//        nossaLista.add("Natashy");

//        System.out.println("Percorrendo com o FOR a nossaLista:");
//
//        for (int i = 0; i < nossaLista.size(); i++) {
//            System.out.println(nossaLista.get(i));
//        }

//        System.out.println("Percorrendo com o ITERATOR a nossaLista:");
//
//        Iterator it = nossaLista.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

//        System.out.println("Percorrendo com o For Each a nossaLista:");
//
//        for (Object obj : nossaLista) {
//            System.out.println(obj);
//        }

//        System.out.println("Percorrendo com o LinkedList a nossaLista:");
//
//        List link = new LinkedList();
//
//        link.add("Felipe");
//        link.add("Bruno");
//        link.add("Julia");
//        link.add("Jade");
//        link.add("Natashy");
//
//        for (Object obj : link) {
//            System.out.println((String)obj);
//        }

//        System.out.println("Percorrendo com o HashSet a hs:");
//
//        Set hs = new HashSet();
//
//        hs.add("Felipe");
//        hs.add("Bruno");
//        hs.add("Julia");
//        hs.add("Jade");
//        hs.add("Julia");
//
//        for (Object obj : hs) {
//            System.out.println((String)obj);
//        }

//        System.out.println("Percorrendo com o LinkedHashSet a hs2:");
//
//        Set hs2 = new LinkedHashSet();
//
//        hs2.add("Felipe");
//        hs2.add("Bruno");
//        hs2.add("Julia");
//        hs2.add("Jade");
//        hs2.add("Julia");
//
//        for (Object obj : hs2) {
//            System.out.println((String)obj);
//        }

//        System.out.println("Percorrendo com o TreeSet a hs3:");
//
//        Set hs3 = new TreeSet();
//
//        hs3.add("Felipe");
//        hs3.add("Bruno");
//        hs3.add("Julia");
//        hs3.add("Jade");
//        hs3.add("Julia");
//
//        for (Object obj : hs3) {
//            System.out.println((String)obj);
//        }

        System.out.println("Percorrendo com o HashMap a hmap:");
        // <Chave, Valor>
        Map hashmap = new HashMap();
        hashmap.put(123, "Matheus");
        hashmap.put(456, "William");
        hashmap.put(789, "Marcelo");
        hashmap.put(321, "Fernando");
        hashmap.put(654, "Jailson");

//        System.out.println("Busca pela chave 456: ");
//        System.out.println(hashmap.get(456));

        System.out.println("Percorrendo o HashMap: ");
        for (Object obj : hashmap.values()) {
            System.out.println((String)obj);
        }

    }

}
