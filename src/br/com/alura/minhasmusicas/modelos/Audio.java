package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int duracaoEmSegundos;
    private int totalDeReproducoes;
    private int curtidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    //O user não setará a classificacao

    public int getCurtidas() {
        return curtidas;
    }

    //O user não setará as curtidas

    public int getClassificacao() {
        if (totalDeReproducoes >= 3 || curtidas >= 3){
            return 3;
        }
        return 1;
    }

    //O user não setará a classificacao


    public void play (){
        System.out.println("Tocando " + getTitulo());
        this.totalDeReproducoes++;
    }

    public void pause() {
        System.out.println(getTitulo() + " pausada");
    }

    public void curtir(){
        this.curtidas++;
    }

    public void exibirFichaTecnica() {
        System.out.println("Nome da música: " + titulo);
        System.out.println("Duração em segundos: " + duracaoEmSegundos);
        System.out.println("Vezes tocadas: " + getTotalDeReproducoes());
        if (getClassificacao() == 3){
            System.out.println("Está em alta recentemente!!!!");
        }
    }

}
