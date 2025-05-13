//Questão 4 Matrizes

public class MatrizOposta {
    public static void main(String[] args) {
        // Matriz A fornecida
        int[][] A = {
            {2, -3},
            {-1, 4}
        };

        // Criar a matriz oposta -A
        int[][] oposta = new int[2][2];

        // Calcular -A
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                oposta[i][j] = -A[i][j];
            }
        }

        // Exibir a matriz oposta
        System.out.println("Matriz oposta (-A):");
        for (int i = 0; i < oposta.length; i++) {
            for (int j = 0; j < oposta[i].length; j++) {
                System.out.print(oposta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
