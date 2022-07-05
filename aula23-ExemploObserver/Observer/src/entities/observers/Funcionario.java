package entities.observers;

import entities.Email;
import entities.Observer;
import entities.Subject;

public class Funcionario implements Observer {

    private String nome;
    private String email;
    private Subject subject;

    public Funcionario(String nome, String email, Subject subject) {
        this.nome = nome;
        this.email = email;
        this.subject = subject;
        //this.subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        Email.enviarEmail(this, msg);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "Funcionário - " + subject;
    }
}
