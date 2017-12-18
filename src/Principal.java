/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplina: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 *
 * Página 29 Exercício 2-22 Thomas H. Cormen 3 ed
 *
 * Algoritmo SelectionSort
 *
 * Atenção:
 * Vetor em java inicia em 0, os algoritmos consideram início em 1.
 * A subtração de -1 ocorre somente no local de acesso ao vetor ou matriz 
 * para manter a compatibilidade entre os algoritmos.
 * 
 */

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {

    /**
     * Realiza a troca de posição de dois elementos do vetor.
     *
     * @param A Vetor que contém os dados
     * @param i Primeira posição de troca
     * @param j Segunda posição de troca
     */
    public static void troca(int[] A, int i, int j) {
        int aux = A[i];
        A[i] = A[j];
        A[j] = aux;
    }

    /**
     * SelectionSort
     *
     * Considere a ordenação de números armazenado sno arranjo A, localizando o
     * menor elemento de A e permutando esse elemento contindo em A[1]. Em
     * seguida encontre o segundo menor elemento de A e o troque pelo elemento
     * A[2]. Continue dessa maneira para os primeiros n -1 elementos de A.
     *
     * Não é um método estável, ou seja não preserva a ordem relativa das chaves
     * iguais.
     *
     * Complexidade O(n^2)
     *
     * Espaço O(1)
     *
     * @param A Vetor a ser ordenado
     */
    public static void selectionSort(int A[]) {
        for (int i = 1 - 1; i <= A.length - 1 - 1; i++) {           //Theta(n)
            int min = i;                                            //Theta(1)
            for (int j = i + 1; j <= A.length - 1; j++) {           //n * Theta(n)
                if (A[j] < A[min]) {                                //Theta(n)
                    min = j;                                        //O(n)
                }
            }
            troca(A, min, i);                                       //Theta(n)
        }
    }

    public static void main(String args[]) {

        //Vetor dos dados        
        int A[] = {50, 70, 60, 90, 10, 30, 20, 40};

        //Fim do vetor
        int r = A.length;

        System.out.println(">>> Algoritmo SelectionSort/Ordenação pelo Seleção <<<");
        System.out.println("Original: ");
        for (int i = 0; i < r; i++) {
            System.out.println((i + 1) + " - " + A[i]);
        }

        selectionSort(A);

        System.out.println("Depois: ");
        for (int i = 0; i < r; i++) {
            System.out.println((i + 1) + " - " + A[i]);
        }
    }
}