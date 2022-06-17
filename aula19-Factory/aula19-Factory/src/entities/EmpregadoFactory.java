package entities;

public class EmpregadoFactory {

    private static EmpregadoFactory instance;

    public EmpregadoFactory() {
    }

    public static EmpregadoFactory getInstance() {
        if (instance == null) {
            instance = new EmpregadoFactory();
        }
        return instance;
    }

    public Empregado criarEmpregado(String tipo) {
        if (tipo.equals("EMP-INT")) {
            return new EmpregadoRelacaoDep();
        } else if (tipo.equals("EMP-EXT")) {
            return new EmpregadoContratado();
        }
        return null;
    }
}
