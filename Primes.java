public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]) + 1;
        Boolean[] arr = new Boolean[n];
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i < n; i++){
            arr[i] = true;
        }
        int index = 2;
        while (index < n) {
            isIndexPrime(index, arr);
            index ++;
        }
        printArr(arr);
    }

    public static void isIndexPrime(int i, Boolean[] arr) {
        int num = i + 1;
        while (num < arr.length) {
            if ((num % i) == 0)     {arr[num] = false;}
            num ++;
        }
    }

    public static void printArr(Boolean[] arr) {
        System.out.println("Prime numbers up to " + (arr.length - 1) + ":");
        int index = 0;
        int primeCounter = 0;
        while (index < arr.length) {
            if (arr[index] == true) {
                System.out.println(index);
                primeCounter ++;
            }
            index ++;
        }
        double percentage = (((double) primeCounter) / (arr.length - 1.0)) * 100 ;
        System.out.println("There are " + primeCounter + " primes between 2 and " + (arr.length - 1) + " (" + (int)percentage + "% are primes)");
    }
}