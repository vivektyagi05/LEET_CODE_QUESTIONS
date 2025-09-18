
class GCD_Example {
    public static void main(String[] args) {
        int a = 27, b = 6;
        while(a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("GCD = " + a);
    }
}