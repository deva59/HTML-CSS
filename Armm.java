class Armm {
    int arm=0,rem,num=153,temp=num;

    public void disp(){
        while (temp>0) {
            rem=num%10;
            temp=rem*rem*rem+arm;
            num=num/10;
         }
         if(arm==temp){
            System.out.println("Its Arm");
         }else{
            System.out.println("Is Not Arm");
         }
    }
    
    public static void main(String[] args) {
        Armm aa = new Armm();
        aa.disp();
    }
    
}
