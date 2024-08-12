package animal.passaro;

public class Papagaio extends Passaro {
    private String voz;

    public void setVoz(String voz) {
        this.voz = voz;
    }

    public String fala(String frase){
        return frase;
    }

    @Override
    public void tallk() {

    }
}
