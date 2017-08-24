
import java.util.Scanner;

public class Estudando{
    static Scanner leitor = new Scanner (System.in);

    static int[] tamanhoMatriz(){
        
        int [] vetorTamanho = new int [2];
        
        System.out.println("tamanhoMatriz");
        System.out.println("Informe o número de linhas: ");
        vetorTamanho[0] = leitor.nextInt();
        System.out.println("Informe o número de colunas: ");
        vetorTamanho[1] = leitor.nextInt();
        
        return vetorTamanho;
    }
    static int [][] criaMatriz(int [] vetorTamanho){
        System.out.println("criaMatriz");
    int linhas = vetorTamanho[0];
    int colunas = vetorTamanho[1];
    int [][] matriz = new int [linhas][colunas];
    
    return matriz;
}   
    static int [][] populaMatriz(int [][] matriz){
        System.out.println("populaMatriz");
        for (int i = 0; i <matriz.length; i++){
            System.out.println("Linha: "+i); 
            for (int j = 0; j<matriz[i].length; j++){
                 System.out.println("Coluna: "+j);
                 System.out.println("Elemento: ");
                 matriz[i][j] = leitor.nextInt();
            }
        }
        return matriz;
    }
    static int contPares(int [][] matriz){
        System.out.println("contPares");
        int cont = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz [i][j] %2 == 0){
                    cont++;
                }
            }
        }
        return cont;
    }    
    static int [] vetorPares(int [][] matriz){
        System.out.println("vetorPares");
        int contador = contPares(matriz);
        while (contador <= 0){
            System.out.println("Número maior que ZERO");
            contador = leitor.nextInt();
        }
        int [] vetorPares = new int [contador];
        int cont = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] %2 == 0){
                    vetorPares[cont] = matriz[i][j];
                    cont++; 
                }
            }
        }
        return vetorPares;
    }
    static void imprimeVetorPares(int [] vetorPares){
        System.out.println("imprimeVetorPares");
        for (int i = 0; i <vetorPares.length; i++){
             System.out.printf("vetor[%d]: %d \n", i,vetorPares[i]);
        }
    }
    public static void main(String[] args) {
      int [] vetorTamanho = tamanhoMatriz();
      int [][] matriz = criaMatriz(vetorTamanho);
      matriz = populaMatriz(matriz);
      int [] vetorPares =  vetorPares(matriz);
      imprimeVetorPares(vetorPares);
    }
}