# Modelagem e diagramação de um componente iPhone

Você pode encontrar o enunciado do desafio nesse link: [Desafio POO DIO](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)

### Diagrama de classes
[Feito no Mermaid](https://mermaid.js.org/intro/syntax-reference.html)

```mermaid
classDiagram
    AparelhoTelefonico <|-- iPhone
    ReprodutorMusical <|-- iPhone
    NavegadorInternet <|-- iPhone

    class ReprodutorMusical{
        - String musicaAtual
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    class AparelhoTelefonico{
      +ligar(String numero)
      +atender()
      +iniciarCorreioDeVoz()
    }
    class NavegadorInternet{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }

```

