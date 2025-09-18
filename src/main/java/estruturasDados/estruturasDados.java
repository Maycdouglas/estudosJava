package estruturasDados;

import java.util.*;

public class estruturasDados {
    public static void main(String[] args) {

        // ARRAYS

        // Declaração de Array
        Integer [] array = new Integer[6];
        // Integer [] array = new Integer[] {0,1,2,3,4,5}; // dessa forma já seta os valores para o array
        // Integer [] array = {0,1,2,3,4,5}; // forma ainda mais abreviada

        //se fizer com INT, já cria um array preenchido com zeros
        // int [] array = new int[6];

        for(int i = 0; i < array.length; i++){
            array[i] = i;
            System.out.println(array[i]);
        }

        // LISTS
        List <String> linguagens = new ArrayList();
        linguagens.add("Java");
        linguagens.add("C");
        linguagens.add("C++");
        linguagens.add("Python");
        System.out.println(linguagens);
        linguagens.remove("C");
        System.out.println(linguagens);

        System.out.println("SETS");

        // SETS
        Set <String> linguagensSet = new HashSet(); // pode embaralhar
        linguagensSet.add("Java");
        linguagensSet.add("Java");
        linguagensSet.add("Go");
        linguagensSet.add("C");
        linguagensSet.add("Haskell");
        System.out.println(linguagensSet);

        Set <String> linguaguensSetLinked = new LinkedHashSet(); // não embaralha
        linguaguensSetLinked.add("Java");
        linguaguensSetLinked.add("Java");
        linguaguensSetLinked.add("Go");
        linguaguensSetLinked.add("C");
        linguaguensSetLinked.add("Haskell");
        System.out.println(linguaguensSetLinked);

        Set <String> linguagensSetTree = new TreeSet(); // Ordem alfabetica
        linguagensSetTree.add("Java");
        linguagensSetTree.add("Java");
        linguagensSetTree.add("Go");
        linguagensSetTree.add("C");
        linguagensSetTree.add("Haskell");
        System.out.println(linguagensSetTree);

        // MAPS

        System.out.println("MAPS");
        Map <String, String> estados = new HashMap(); // pode embaralhar
        estados.put("CE", "Ceará");
        estados.put("MG", "Minas Gerais");
        estados.put("SC", "Santa Catarina");
        estados.put("GO", "Goiás");
        System.out.println(estados);

        // mesmos pontos que tivemos no SET valem aqui

    }
}
