package UPSKILLING.MODULE_3.CORE_JAVA;

public class S19_INTERFACE_IMPLEMENTATION {
    interface Playable {
        void play();
    }

    static class Guitar implements Playable {
        public void play() {
            System.out.println("Playing the guitar.");
        }
    }

    static class Piano implements Playable {
        public void play() {
            System.out.println("Playing the piano.");
        }
    }

    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        guitar.play();
        piano.play();
    }
}
