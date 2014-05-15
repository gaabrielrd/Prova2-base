/**
 *
 * @author GabrielRoda
 */
public class ImprimeABNTNBR60232002 implements GetTextoGerado {

    private static ImprimeABNTNBR60232002 singleton;

    private ImprimeABNTNBR60232002() {

    }

    public static ImprimeABNTNBR60232002 getInstance() {
        if (singleton == null) {
            singleton = new ImprimeABNTNBR60232002();
        }
        return singleton;
    }

    @Override
    public String getBibliografia(Obra fonte) {
        String saida = "";
        switch (fonte.getAutores().size()) {
            case 1:
                saida = saida + fonte.getAutores().get(0).getSobrenome().toUpperCase();
                saida = saida + ", " + fonte.getAutores().get(0).getNome().charAt(0);
            case 2:
                saida = saida + fonte.getAutores().get(0).getSobrenome().toUpperCase();
                saida = saida + ", " + fonte.getAutores().get(0).getNome().charAt(0);
                saida = saida + fonte.getAutores().get(1).getSobrenome().toUpperCase();
                saida = saida + ", " + fonte.getAutores().get(1).getNome().charAt(0);
            default:
                saida = saida + fonte.getAutores().get(0).getSobrenome().toUpperCase();
                saida = saida + ", " + fonte.getAutores().get(0).getNome().charAt(0);
                saida = saida + ". et al.";
        }
        saida = saida + " " + fonte.getTitulo();
        saida = saida + ". " + fonte.getEditora() + ": " + fonte.getCidade();
        saida = saida + ", " + fonte.getAnoPublicacao();
        return saida;
    }

    @Override
    public String getCitacao(Obra fonte) {
        String saida = "(";
        switch (fonte.getAutores().size()) {
            case 1:
                saida = saida + fonte.getAutores().get(0).getSobrenome().toUpperCase();
                saida = saida + ", " + fonte.getAutores().get(0).getNome().toUpperCase();
            case 2:
                saida = saida + fonte.getAutores().get(0).getSobrenome().toUpperCase();
                saida = saida + ", " + fonte.getAutores().get(0).getNome().toUpperCase();
                saida = saida + fonte.getAutores().get(1).getSobrenome().toUpperCase();
                saida = saida + ", " + fonte.getAutores().get(1).getNome().toUpperCase();
            default:
                saida = saida + fonte.getAutores().get(0).getSobrenome().toUpperCase();
                saida = saida + ", " + fonte.getAutores().get(0).getNome().toUpperCase();
                saida = saida + ". et al.";
        }
        saida = saida + " " + fonte.getAnoPublicacao() + ")";
        return saida;
    }
}
