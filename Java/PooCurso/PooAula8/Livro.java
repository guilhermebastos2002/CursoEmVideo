public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String ti, String au, int tot, Pessoa le) {
        this.titulo = ti;
        this.autor = au;
        this.totPaginas = tot;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = le;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAtor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitorPessoa() {
        return leitor;
    }

    public void setLeitorPessoa(Pessoa leitor) {
        this.leitor = leitor;
    }

    

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    public void detalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de Páginas: " + totPaginas);
        System.out.println("Leitor: " + leitor.getNome() + " " + leitor.getIdade() + " anos e sexo " + leitor.getSexo());
        System.out.println("Aberto: " + aberto);
        System.out.println("Página Atual: " + pagAtual);
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas || this.aberto == false) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        if (this.pagAtual == this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual++;
        }
    }

    @Override
    public void voltarPag() {
        if (this.pagAtual == 0) {
            this.pagAtual = 0;
        } else {
            this.pagAtual--;
        }
    }
} 
