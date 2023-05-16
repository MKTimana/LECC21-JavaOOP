import java.util.*;

public class Executa {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Vector v = new Vector(3);
        Operacoes op = new Operacoes();
        int id;
        for(int i = 0; i < v.capacity(); i++) {
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

        System.out.println("Partindo para a atualização...");
        System.out.print("Insira o genero que deseja atualizar...: ");
        String genero = input.nextLine();
        System.out.print("Insira o novo genero: ");
        String ng = input.nextLine();

        op.update(ng,genero,v);
//        for(int i = 0; i< v.capacity(); i++){
//            if( ( (Filmes) v.get(i) ).getGenero().equalsIgnoreCase(genero) ){
//                System.out.print("Para que genero deseja atualizar? ");
//                String ng = input.nextLine();
//
//                ((Filmes) v.get(i)).setGenero(ng);
//                System.out.print("Para que genero deseja atualizar? ");
//            }
//        }
    }
}
