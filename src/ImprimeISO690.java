/**
 *
 * @author GabrielRoda
 */
public class ImprimeISO690 implements GetTextoGerado {

    private static ImprimeISO690 singleton;

    private ImprimeISO690() {

    }

    public static ImprimeISO690 getInstance() {
        if (singleton == null) {
            singleton = new ImprimeISO690();
        }
        return singleton;
    }

    @Override
    public String getBibliografia(Obra fonte) {
        String saida = "";
        switch (fonte.getAutores().size()) {
            case 1:
                saida = saida + fonte.getAutores().get(0).getSobrenome();
                saida = saida + ", " + fonte.getAutores().get(0).getNome();
                break;
            case 2:
                saida = saida + fonte.getAutores().get(0).getSobrenome();
                saida = saida + ", " + fonte.getAutores().get(0).getNome();
                saida = saida + ", " + fonte.getAutores().get(1).getSobrenome();
                saida = saida + ", " + fonte.getAutores().get(1).getNome();
                break;
            default:
                saida = saida + fonte.getAutores().get(0).getSobrenome();
                saida = saida + ", " + fonte.getAutores().get(0).getNome();
                saida = saida + ", et al.";
        }
        saida = saida + fonte.getAnoPublicacao();
        saida = saida + ", " + fonte.getTitulo();
        saida = saida + ". " + fonte.getEditora() + ": " + fonte.getCidade();
        saida = saida + ", " + fonte.getAnoPublicacao();
        return saida;
    }

    @Override
    public String getCitacao(Obra fonte) {
        String saida = "(";
        switch (fonte.getAutores().size()) {
            case 1:
                saida = saida + fonte.getAutores().get(0).getSobrenome();
                break;
            case 2:
                saida = saida + fonte.getAutores().get(0).getSobrenome();
                saida = saida + ", " + fonte.getAutores().get(0).getSobrenome();
                break;
            default:
                saida = saida + fonte.getAutores().get(0).getSobrenome();
                saida = saida + ", et al.";
        }
        saida = saida + ", " + fonte.getAnoPublicacao() + ")";
        return saida;
    }
}
