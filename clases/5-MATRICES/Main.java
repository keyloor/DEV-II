public class Main {
    public static void main(String[] args) {

        int[][] m = {
                        {100, 200, 300},
                        {500, 500, 500},
                        {700, 800, 900}
                        };

        printRow(m, 0);
        printColumn(m, 1);
        System.out.println(sumDiagonally(m));
        System.out.println(sumInvertedDiagonally(m));
        System.out.println(verify(m, 1));

        int[][] nether = new int[8][6];
        border(nether);

        for (int i = 0; i < nether.length; i++) {
            for (int j = 0; j < nether[i].length; j++) {
                System.out.print(nether[i][j]);
            }
            System.out.println();
        }
        
        





    }
    
    public static void printRow(int[][] m, int row) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[row][i] + " ");
        }
        System.out.println();
    }

    public static void printColumn(int[][] m, int c) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][c] + " ");
        }
        System.out.println();
    }

    public static int sumDiagonally(int[][] m) {
        int sum = 0;

        for (int j = 0; j < m.length; j++) {
            sum += m[j][j];
        }

        return sum;
    }

    public static int sumInvertedDiagonally(int[][] m) {
        int c = 0; //CONTADOR QUE CONTROLA LA FILA
        int sum = 0;

        for (int j = m[c].length - 1; j >= 0; j--) { //FOR QUE CONTROLA CUAL DE LA COLUMNA
            sum += m[c][j];
            c++;
        }

        return sum;

    }

    public static boolean verify(int[][] m, int row) {
        for (int i = 0; i < m.length; i++) { //SER RECORRE LA FILA

            if(i < m.length - 1) { //REVISAR PARA NO SALIRSE

                if(m[row][i] != m[row][i + 1]) { //SI ALGUNO NO ES IGUAL AL OTRO
                    return false;
                }

            }  
        }
        return true; //SI TODOS FUERON IGUALES
    }

    public static void border(int[][] m) {
        for (int i = 0; i < m.length; i++) {

            if(i == 0) { //ARRIBA
                for (int j = 0; j < m[j].length; j++) {
                    m[i][j] = 1;
                }
            } else if(i == m.length - 1) { //ABAJO
                for (int j = 0; j < m[j].length; j++) {
                    m[i][j] = 1;
                }
            } else { //IZQUIERDA Y DERECHA

                for (int x = 0; x < m.length; x++) {
                    if(x == 0) { //IZQUIERDA
                        m[i][x] = 1;

                    } else if(x == m[i].length - 1) { //DERECHA
                        m[i][x] = 1;

                    }
                }
            }

        }
    }





}
