package primePackage;

class PrimeNumberProgram extends PrimeOrNot {
    public void displayResult() {
        int num = getNumber();
        if (isPrime()) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
