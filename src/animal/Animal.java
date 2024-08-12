package animal;

public class Animal {
    private String nome;
    private String classe;

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public void imp(){
        var msg = """
                Nome: %s
                Classe: %s
                """.formatted(getNome(), getClasse());
        System.out.println(msg);
    }

    public void talk(){
        System.out.println("Me not falar");
    }
}
