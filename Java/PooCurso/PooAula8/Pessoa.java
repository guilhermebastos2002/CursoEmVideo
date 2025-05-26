public class Pessoa {
    private String nome, sexo;
    private int idade;

    public Pessoa(String n, int i, String s) {
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAnive(String nome) {
        System.out.println(nome + " está fazendo aniversário.");
        this.idade = getIdade() + 1;
        System.out.println("Agora ele(a) tem " + idade + " anos.");
    }

}
