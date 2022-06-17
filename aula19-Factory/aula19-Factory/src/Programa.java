import entities.EmpregadoFactory;
import entities.Empresa;

public class Programa {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("132.456.789/0001-55");

        EmpregadoFactory factory = EmpregadoFactory.getInstance();
        System.out.println(factory);

        empresa.addEmpregado(factory.criarEmpregado("EMP-INT"));
        empresa.addEmpregado(factory.criarEmpregado("EMP-EXT"));
        empresa.addEmpregado(factory.criarEmpregado("EMP-INT"));
        empresa.addEmpregado(factory.criarEmpregado("EMP-EXT"));
        empresa.addEmpregado(factory.criarEmpregado("EMP-INT"));
        empresa.addEmpregado(factory.criarEmpregado("EMP-EXT"));

        System.out.println("CNPJ da Empresa: " + empresa.getCnpj());
        empresa.listEmpregado();
    }

}
