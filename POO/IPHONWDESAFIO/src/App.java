public class App {
    public static void main(String[] args) throws Exception {
        iPhone meuIPhone = new iPhone();


        System.out.println("Abrindo Aparelho Telefonico");
        meuIPhone.ligar("4002-8922");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioDeVoz();

        System.out.println("\nNavegando na internt.");
        meuIPhone.adicionarNovaAba();
        meuIPhone.exibirPagina("https://github.com/AndrieleLange/desafiosDio/blob/main/POO/README.md");
        meuIPhone.atualizarPagina();

        System.out.println("\nReproduzindo música:");
        meuIPhone.selecionarMusica("Fantasy - Mariah Carey");
        meuIPhone.pausar();
        meuIPhone.tocar();
    }
}
