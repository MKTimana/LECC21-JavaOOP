import java.util.*;

public class main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Vector v = new Vector(2);
        Operacoes op = new Operacoes();
        int id;

        //Insercao manual
        Filmes f1 = new Filmes(1,2023,"milton","Accao");
        Filmes f2 = new Filmes(2,2023,"KC","drama");
        Filmes f3 = new Filmes(3,2017,"KM","Drama");
        Filmes f4 = new Filmes(4,2019,"raquel","romance");

        v.add(f1);
        v.add(f2);
        v.add(f3);
        v.add(f4);
        //Insercao automatica
//        for(int i = 0; i < v.capacity(); i++) {
//            id = i;
//
//            System.out.println("Insira o nome do Filme");
//            String nome = input.nextLine();
//
//            System.out.println("Insira o genero do Filme");
//            String genero = input.nextLine();
//
//            System.out.println("Em que ano foi lançado o filme?");
//            int ano = input.nextInt();
//
//            Filmes f1 = new Filmes(id, ano, nome, genero);
//            op.insert(f1, v);
//
//            input.nextLine();
//        }

        op.index(v);
System.out.println("\n===============ATUALIZAÇÃO=============");
        System.out.print("Insira o genero que deseja atualizar...: ");
        String genero = input.nextLine();
        System.out.print("Insira o novo genero: ");
        String ng = input.nextLine();

        op.update(ng,genero,v);
        System.out.println("\n===============LISTA ATUALIZADA=============");
        op.index(v);
        //Isso foi adicionado na classe Operacoes!
//        for(int i = 0; i< v.capacity(); i++){
//            if( ( (Filmes) v.get(i) ).getGenero().equalsIgnoreCase(genero) ){
//                System.out.print("Para que genero deseja atualizar? ");
//                String ng = input.nextLine();
//
//                ((Filmes) v.get(i)).setGenero(ng);
//                System.out.print("Para que genero deseja atualizar? ");
//            }
//        }
        System.out.println("\n===============REMOÇÃO=============");
        System.out.println("Da lista de filmes, indique o numero do filme que deseja remover...");
        int numero = input.nextInt();

        op.remove(v,numero);

        op.index(v);
        System.out.println("\n===============GENERO=============");
        op.indiceGenero(v,"drama");
    }
}
