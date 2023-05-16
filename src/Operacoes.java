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
          }
        }
    }

    public void index(Vector v){
        for(int i = 0; i < v.size(); i++){
            System.out.println((Filmes) v.get(i));
        }
    }

    public void remove(Vector v, int i){
        v.removeElementAt(i);
    }
}
