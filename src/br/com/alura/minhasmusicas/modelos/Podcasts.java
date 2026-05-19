package br.com.alura.minhasmusicas.modelos;

public class Podcasts extends Audio {

    private String host;
    private String descricao;
    private int duracaoEmMinutos;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public void exibirFichaTecnicaPocast() {
        System.out.println(host);
        System.out.println("Podcast: " + this.getTitulo());
        System.out.println(descricao);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Vezes tocadas: " + getTotalDeReproducoes());
        if (getClassificacao() == 3){
            System.out.println("Está em alta recentemente!!!!");
        }
    }
}
