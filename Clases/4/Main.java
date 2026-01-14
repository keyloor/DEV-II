public class Main {
    public static void main(String[] args) {
        //Metodo que saca el num max de un array
        int[] array = {12, 20, 4, 6, 10, 5, 23};  
        System.out.println("1- Max: " + maxNum(array));

        //Metodo que saca el square root de cada elemento de un array
        int[] square = squareArray(array);
        System.out.print("\n2- Square Root Array: ");
        for (int d : square) {
            System.out.print(d + " ");
        }

        //Metodo que saca el num min de un array
        System.out.println("\n\n3- Min: " + minNum(array));

        //Metodo que suma todos los elementos del array
        System.out.println("\n4- Sum: " + sum(array));

        System.out.println("\n5- Second Max: " + secondMax(array));

        int[] array2 = {12, 20, 4, 6, 10, 5, 23}; 

        System.out.println("\n6- Average: " + average(array2));

        System.out.println("\n7- " + evenOdd(array2));

        System.out.println("\n8- Search (20): " + search(array2, 20));

    } 

    public static int maxNum(int[] array) {
        //Se establece un max inicial con el menor monto posible para un int
        int max = -999999999;

        //Se itera el array en busca de alguno que sea mayor al max el cual se actualiza continuamente
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        
        return max;
    }

    public static int[] squareArray(int[] array) {
        int[] squareArray = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            squareArray[i] = array[i] * array[i];
        }

        return squareArray;  
    }

    public static int minNum(int[] array) {
        //Se establece un max inicial con el mayor monto posible para un int
        int min = 999999999;

        //Se itera el array en busca de alguno que sea menor al min el cual se actualiza continuamente
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    }

    public static int sum(int[] array) {
        //Se establece un acumulador
        int sum = 0;

        //Se itera el array sumando todos los elementos
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        return sum;
    }

    public static int secondMax(int[] array) {

        //SE BUSCA EL MAX
        //Se establece un max inicial con el menor monto posible para un int
        int max = -999999999;

        //Se itera el array en busca de alguno que sea menor al max el cual se actualiza continuamente
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        //SE BUSCA EL SEGUNDO MAX
        //Se elimina el primer max del array
        for(int i = 0; i < array.length; i++) {
            if(array[i] == max) {
                array[i] = -999999999;
            }
        }

        //Se itera el array en busca de alguno que sea menor al max el cual se actualiza continuamente
        int secondMax = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        
        return secondMax;
    }

    public static int average(int[] array) {
        int sum = 0;
        int size = 0;
        
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            size++;
        }

        return sum / size;  
    }

    public static String evenOdd(int[] array) {
        int even = 0;
        int odd = 0;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return "Even: " + even + " Odd: " + odd;
    }

    public static boolean search(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) {
                return true;
            }
        }

        return false;
    }





}
