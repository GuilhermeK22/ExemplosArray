public class ExemploArray1 {
    public static void main(String arg[]) {
        declaracaoArray();
        tamanhoArray();
        percorrendoArray();
        arrayBidimensional();
    }

    private static void arrayBidimensional() {
        System.out.println("************** Array Bidimensional *************");
        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] array2 ={{1,2}, {3}, {6, 9,7}};

        System.out.println("Valores no array1 passados na linha são");
        outputArray(array1); //exibe o array 2 por linha

        System.out.println("Valores no array2 passados na linha são");
        outputArray(array2); //exibe o array 2 por linha
    }
    public static void outputArray(int[][] array) {
        //Faz um loop pelas linhas do array
        for (int linha = 0; linha < array.length; linha++) {
            //Faz loop pelas colunas da linha atual
            for (int coluna = 0; coluna < array[linha].length; coluna++) {
                System.out.printf("%d", array[linha][coluna]);
            }
            System.out.println();
        }
    }

    private static void percorrendoArray() {
        System.out.println("**********Percorrendo Array*********");
        int[] arrayNum = {56, 30, 23, 6, 98, 10, 36};
        int total = 0;
        //Adiciona o valor de cada elemento ao total
        for (int i : arrayNum) {
            total += i;
        }
        System.out.println("1 - Total de elementos arrayNum:" +total);
    }
    private static void tamanhoArray() {
        System.out.println("*****Tamanho Array*****");
        int[] array1 = {20, 56, 5, 1000, 89, 30, 28, 3, 895, 2356, 21};
        int[] array2 = {23, 6, 78, 10, 2, 6, 56};

        if (array2.length > 8) {
            System.out.println("Tamanho do Array2 - Maior que 8");
        }else {
            System.out.println("Tamanho do Array2 - Menor que 8");
        }
        System.out.println("\nTamanho do Array1 = "+array1.length);
    }
    private static void declaracaoArray() {
        System.out.println("******* Declaração Array ********");
        //[] - são inseridos em uma variável que referencia um array
        int[] a = new int[4];
        //Outra maneira de fazer um declaração de array
        int[] b;
        b = new int[10];
        //Declarando vários arrays
        int[] r = new int[44], k = new int[23];

        //{} - inicializar valores em um array sua declaração
        int[] iniciaValores = {12, 32, 54, 6, 8, 89, 64, 64,6};

        //Declara um array de inteiros
        int[] meuArray;

        //Aloca memória para 10 inteiros
        meuArray = new int[10];

        //Inicializa o primeiro elemento
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
    }

}

