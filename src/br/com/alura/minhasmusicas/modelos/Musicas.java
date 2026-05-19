package br.com.alura.minhasmusicas.modelos;

public class Musicas extends Audio {

    private String album;
    private String genero;
    private String artista;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.println(artista);
        System.out.println(album);
        super.exibirFichaTecnica();
        System.out.println(genero);
    }

}
