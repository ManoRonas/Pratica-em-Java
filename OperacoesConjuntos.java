//Questão 5 Vetores

import java.util.*;

public class OperacoesConjuntos {
    public static void main(String[] args) {
        Integer[] arrayA = {2, 4, 7, 13, 14, 15, 16};
        Integer[] arrayB = {1, 6, 7, 11, 13, 16, 18};

        // Usa Set para operações de conjunto
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(arrayA));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(arrayB));

        // União: A ∪ B
        Set<Integer> uniao = new HashSet<>(conjuntoA);
        uniao.addAll(conjuntoB);

        // Interseção: A ∩ B
        Set<Integer> intersecao = new HashSet<>(conjuntoA);
        intersecao.retainAll(conjuntoB);

        // Diferença: A - B
        Set<Integer> diferenca = new HashSet<>(conjuntoA);
        diferenca.removeAll(conjuntoB);

        // Exibir os resultados
        System.out.println("A = " + conjuntoA);
        System.out.println("B = " + conjuntoB);
        System.out.println("\nA ∪ B (União): " + uniao);
        System.out.println("A ∩ B (Interseção): " + intersecao);
        System.out.println("A − B (Diferença): " + diferenca);
    }
}
