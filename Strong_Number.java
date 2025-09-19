class Strong_Number {
    public static void main(String[] args) {
        int n = 145;
        int temp = n;
        int sum = 0;
        
        while(temp > 0) {
            int d = temp % 10;  
            int fact = 1;
            int i = 1;
            while(i <= d) {
                fact = fact * i;
                i++;
            }
            sum = sum + fact;
            temp = temp / 10;
        }
        
        if(sum == n) {
            System.out.println(n + " is Strong Number");
        } else {
            System.out.println(n + " is Not Strong Number");
        }
    }
}

