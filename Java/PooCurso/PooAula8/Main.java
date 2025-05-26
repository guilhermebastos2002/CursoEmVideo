public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 15, "M");
        p[1] = new Pessoa("Giovana", 20, "F");
        
        l[0] = new Livro("O magico de OZ", "John oz", 200, p[0]);
        l[1] = new Livro("O pequeno Principe", "John pequeno", 120, p[1]);
        l[2] = new Livro("O principe cruel", "John Cruel", 250, p[0]);

        l[1].abrir();
        l[1].folhear(120);
        l[1].avancarPag();
        l[1].avancarPag();
        l[1].avancarPag();
        l[1].voltarPag();
        l[1].detalhes();
    }
}
