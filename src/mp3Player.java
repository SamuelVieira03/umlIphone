public class Mp3Player {
    private boolean estaTocando;
    private String musicaAtual;

    public Mp3Player() {
        
        estaTocando = false;
        musicaAtual = null;
    }

    public boolean abrirMP3() {
        if (!estaTocando) {
            System.out.println("Está pausado!");
            return false;
        } else {
            System.out.println("Está tocando!");
            return true;
        }
    }

    public void play(String music) {
        musicaAtual = music;
        estaTocando = true;
        System.out.println("Tocando música: " + musicaAtual);
    }

    public void trocarMusica(String newMusic) {
        if (estaTocando) {
            System.out.println("Trocando de música.");
            musicaAtual = newMusic;
            System.out.println("Tocando música atual: " + musicaAtual);
        } else {
            System.out.println("O player não está tocando nenhuma música.");
        }
    }

    public static void main(String[] args) {
        Mp3Player player = new Mp3Player();

        player.play("Música 1");

        player.trocarMusica("Música 2");

        player.abrirMP3();
    }
}

