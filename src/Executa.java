import java.util.*;

public class Executa {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Vector v = new Vector();
        Operacoes op = new Operacoes();
        int id;
        for(int i = 0; i < 4; i++) {
            id = i;

            System.out.println("Insira o nome do Filme");
            String nome = input.nextLine();

            System.out.println("Insira o genero do Filme");
            String genero = input.nextLine();

            System.out.println("Em que ano foi lançado o filme?");
            int ano = input.nextInt();

            Filmes f1 = new Filmes(id, ano, nome, genero);
            op.insert(f1, v);

            input.nextLine();
        }

        op.index(v);
    }
}
