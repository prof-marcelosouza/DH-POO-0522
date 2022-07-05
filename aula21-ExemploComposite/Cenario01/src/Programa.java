import entities.*;

public class Programa {

    public static void main(String[] args) {

        Departamento vendas = new DepVendas(1,"Departamentop de vendas");
        Departamento financeiro = new DepFinanceiro(2, "Departamento Financeiro");
        Departamento rh = new DepRH(3, "Departamento de Recuros Humanos");

        DepComposite composite = new DepComposite(1, "Composite");

        composite.addDepartamento(vendas);
        composite.addDepartamento(financeiro);
        composite.addDepartamento(rh);

        composite.getName();

    }

}
