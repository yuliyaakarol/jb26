package by.epam.ex4;

public class Ex4 {
    public static void main(String[] args){
        int [] arr = generateArray(10);
        for (int i=0; i<arr.length; i++){
            if (isPrime(arr[i])){
                System.out.println("\nNumber "+arr[i]+" is prime. Serial number: "+i);
            }
        }
    }

    public static boolean isPrime(int x){
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] generateArray(int size){
        int[] arr = new int[size];
        for (int i=0; i<size;i++){
            arr[i] = (int) (Math.random() * 100);
            System.out.println("Elemet: "+arr[i]);
        }
        return arr;
    }

}
