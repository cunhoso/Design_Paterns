package padroescriacao.singleton;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String nomeBiblioteca;
    private String funcionarioLogado;

    public String getnomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setnomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getfuncionarioLogado() {
        return funcionarioLogado;
    }

    public void setfuncionarioLogado(String funcionarioLogado) {
        this.funcionarioLogado = funcionarioLogado;
    }
}