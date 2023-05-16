import java.util.*;

public class Operacoes {

    public void insert(Filmes f, Vector v) {
        v.add(f);
        System.out.println("Inserido com sucesso...\n");
    }

    public void update(String ng, String ag, Vector v ){
        for(int i = 0; i<v.size(); i++){
          if( ( (Filmes) v.get(i) ).getGenero().equalsIgnoreCase(ag)){
              ((Filmes) v.get(i)).setGenero(ng);
              System.out.println("Genero do filme "+((Filmes) v.get(i)).getNome()+" actualizado com sucesso!");
          }
        }
    }

    public void index(Vector v){
        for(int i = 0; i < v.size(); i++){
            System.out.println((i+1)+" "+ (Filmes) v.get(i));
        }
    }

    public void remove(Vector v, int i){
        System.out.println("O filme "+((Filmes) v.get(i)).getNome()+" foi removido com sucesso!");
        v.removeElementAt(i);
    }
}
