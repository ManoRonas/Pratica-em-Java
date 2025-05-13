//Questão 2 Matrizes

public class OperacoesMatriz {
  public static void main(String[] args) {
     
      int[][] matriz = {
          {1, 2, 3, 4},
          {5, 6, 7, 8},
          {9, 10, 11, 12},
          {13, 14, 15, 16}
      };

      // 1. Soma dos elementos da primeira coluna
      int somaPrimeiraColuna = 0;
      for (int i = 0; i < matriz.length; i++) {
          somaPrimeiraColuna += matriz[i][0];
      }

      // 2. Produto dos elementos da primeira linha
      int produtoPrimeiraLinha = 1;
      for (int j = 0; j < matriz[0].length; j++) {
          produtoPrimeiraLinha *= matriz[0][j];
      }

      // 3. Soma de todos os elementos da matriz
      int somaTotal = 0;
      for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[i].length; j++) {
              somaTotal += matriz[i][j];
          }
      }

      // 4. Produto da diagonal principal
      int produtoDiagonalPrincipal = 1;
      for (int i = 0; i < matriz.length; i++) {
          produtoDiagonalPrincipal *= matriz[i][i];
      }

      // Exibição dos resultados
      System.out.println("Soma dos elementos da primeira coluna: " + somaPrimeiraColuna);
      System.out.println("Produto dos elementos da primeira linha: " + produtoPrimeiraLinha);
      System.out.println("Soma de todos os elementos: " + somaTotal);
      System.out.println("Produto da diagonal principal: " + produtoDiagonalPrincipal);
  }
}