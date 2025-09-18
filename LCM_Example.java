
class LCM_Example {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int x = a, y = b;
        while(x != y) {
            if(x < y) {
                x = x + a;
            } else {
                y = y + b;
            }
        }
        System.out.println("LCM = " + x);
    }
}
