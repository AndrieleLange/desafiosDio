/**
 * iPhone
 */
public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    // aparelho telefonico
    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }

    public void atender(){
        System.out.println("Atendendo chamada");
        System.out.println("Desligando chamada");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Correio de voz iniciado");
        System.out.println("Correio de voz concluido");
    }

    // Navegador internet
    public void exibirPagina(String url){
        System.out.println("Exibindo pagina: " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina(){
        System.out.println("Pagina atualizada.");
    }

    // reprodutor musical
    private String musicaAtual;

    public void tocar(){
        System.out.println("Tocando " + musicaAtual);
    }

    public void pausar(){
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica){
        this.musicaAtual = musica;
        tocar();
    }    
}