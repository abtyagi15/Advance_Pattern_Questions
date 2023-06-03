public class Pattern {
    
    public static void printPattern(){
        int num=4;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=(num-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        printPattern();
    }
}
