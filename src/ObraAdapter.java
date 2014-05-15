/**
 *
 * @author GabrielRoda
 */
public class ObraAdapter extends Obra {

    private GetTextoGerado formatoDeReferencias;

    public ObraAdapter(String titulo, String subtitulo, String editora, String cidade, int anoPublicacao) {
        super(titulo, subtitulo, editora, cidade, anoPublicacao);

    }

    @Override
    public String getBibliografia() {
        return formatoDeReferencias.getBibliografia(this);
    }

    @Override
    public String getCitacao() {
        return formatoDeReferencias.getCitacao(this);
    }

    /**
     * @param formatoDeReferencias the formatoDeReferencias to set
     */
    public void setFormatoDeReferencias(GetTextoGerado formatoDeReferencias) {
        this.formatoDeReferencias = formatoDeReferencias;
    }

}
