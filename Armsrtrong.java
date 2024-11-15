class am{
    public static void main(String[] args) {
        int n=153,arm=0,rem;
        int store=n;
        while(n>0){
 
            rem=n%10;
            arm=rem*rem*rem+arm;
            n=n/10;
        }
        if(store==arm)
        System.out.println("Its Arm");
        else
        System.out.println("Is Not Arm");
    }
}