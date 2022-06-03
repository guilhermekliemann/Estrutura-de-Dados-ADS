package br.com.kliemann.listaconceitosbasicosjava;

public class Exercicio17 {

    public static void main(String[] args) {
        
        /*
        Declare uma matriz de 24 posições, sendo 8 linhas e 3 colunas. insira nas colunas de cada linha os 3 
        lados de um triângulo. Após, imprima o número do triângulo (linha) e o seu tipo, conforme as regras 
        já vistas em outros exercícios.
        */
        
        //INCOMPLETO
        
        int[][] matriz = {
            {1,2,6},
            {4,4,4},
            {7,4,5},
            {3,8,8},
            {4,5,4},
            {2,1,2},
            {5,6,5,},
            {7,8,9}
        };
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
    
    public static void tipoTriangulo() {
        
        /*
        if (a<=0 || b<=0 || c<=0) {
         System.out.println("Lados nulos ou negativos nao sao aceitos.");
         System.exit(2);
      }

      if (a>=b+c || b>=c+a || c>=a+b) {
         System.out.println("Triangulo inexistente.");
         System.exit(3);
      }

      if (a==b && b==c)
         System.out.println("Triangulo equilatero.");

      else if (a==b || b==c || c==a)
         System.out.println("Triangulo isosceles.");

      else
         System.out.println("Triangulo escaleno.");
        */
        
    }
    
}
