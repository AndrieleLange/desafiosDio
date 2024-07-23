/**
 * ReprodutorMusical
 */
public interface ReprodutorMusical {
    public String musicaAtual = "";

    public void tocar();

    public void pausar();

    public void selecionarMusica(String musica);
}