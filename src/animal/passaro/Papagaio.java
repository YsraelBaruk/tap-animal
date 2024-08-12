package animal.passaro;

import java.util.ArrayList;
import java.util.List;

public class Papagaio extends Passaro {
    private List<String> voz = new ArrayList<>();

    public void setVoz(String voz) {
        this.voz.add(voz);
    }

    public String fala(String frase){
        return frase;
    }

    @Override
    public void talk() {
        voz.forEach(System.out::println);
    }
}
