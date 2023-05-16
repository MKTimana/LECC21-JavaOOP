public class Filmes {
    private int num, ano;
    private String nome, genero;

    public Filmes(int num, int ano, String nome, String genero) {
        this.num = num;
        this.ano = ano;
        this.nome = nome;
        this.genero = genero;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme lançado no ano de "+getAno()+" com o titulo "+getNome()+" do genero "+getGenero();
    }
}
