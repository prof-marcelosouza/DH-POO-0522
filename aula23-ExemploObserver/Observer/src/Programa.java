import entities.Newsletter;
import entities.observers.Cliente;
import entities.observers.Fornecedor;
import entities.observers.Funcionario;
import entities.observers.Parceiro;

public class Programa {

    public static void main(String[] args) {

        Newsletter news = new Newsletter();

        Cliente cli1 = new Cliente("Amanda", "amanda@gmail.com", news);
        Funcionario func1 = new Funcionario("Jonas", "jon@gmail.com", news);
        Fornecedor for1 = new Fornecedor("bianca", "bia@gmail.com", news);
        Parceiro par1 = new Parceiro("Patricia", "paty@gmail.com", news);

        news.registerObserver(cli1); news.registerObserver(func1);
        news.addMessage("Primeira mensagem");

        System.out.println("");

        news.removeObserver(cli1);
        news.removeObserver(func1);
        news.registerObserver(for1);
        news.registerObserver(par1);
        news.addMessage("Segunda mensagem");

        System.out.println("");

        news.registerObserver(cli1); news.registerObserver(func1);
        news.addMessage("Terceira mensagem");

    }

}
