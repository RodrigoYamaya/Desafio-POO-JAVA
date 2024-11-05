public class  Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);


    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");


    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");


    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);


    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");


    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");


    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");

    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");


    }

    @Override
    public void selecionarMusica(String Musica) {
        System.out.println("Musica Selecionada: " + Musica);

    }


    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.selecionarMusica("HADDAWAY");
        iphone.pausar();

        System.out.println();

        iphone.ligar("4002-8922");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println();

        iphone.exibirPagina("http://www.Dio.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();



    }


}

