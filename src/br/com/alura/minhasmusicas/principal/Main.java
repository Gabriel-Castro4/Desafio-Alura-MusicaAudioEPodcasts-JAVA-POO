package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musicas;
import br.com.alura.minhasmusicas.modelos.Podcasts;

public class Main {
    public static void main(String[] args) {

        Podcasts podcast1 = new Podcasts();
        podcast1.play();
        podcast1.setHost("DisComenta");
        podcast1.setTitulo("DisComenta #1 DEFTONES (Discografia comentada)");
        podcast1.setDescricao("Fala pessoas, Tudo bem???? Quem tá falando é Castro e comecei \n esse podcast chamado DisComenta pra falar sobre discos de bandas que eu amo e   \n de hj foi o DEFTONES, com um convidado muito mais que especial O GRITO MATERIAL \n Nícolas Henrique e foi simplesmente sensacional e espero que curtam");
        podcast1.setDuracaoEmMinutos(166);
        podcast1.exibirFichaTecnicaPocast();
        podcast1.curtir();

        System.out.println("**************************************************");


        Musicas musica1 = new Musicas();
        musica1.setTitulo("One");
        musica1.setArtista("Metallica");
        musica1.setAlbum("And Justice for all...");
        musica1.setDuracaoEmSegundos(447);
        musica1.setGenero("Metal");
        musica1.play();
        musica1.play();
        musica1.play();
        musica1.curtir();
        musica1.exibirFichaTecnica();

        System.out.println("**************************************************");
    }



}
