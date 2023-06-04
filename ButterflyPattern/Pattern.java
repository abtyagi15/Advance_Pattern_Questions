public class Pattern {
    public static void printUpperPattern(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=8;j++){
                if(j>i&&j<=(8-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void printLowerPattern(){
        for(int i=4;i>=1;i--){
            for(int j=1;j<=8;j++){
                if(j>i&&j<=(8-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern(){
        printUpperPattern();
        printLowerPattern();
    }
    public static void main(String[] args) {
        printPattern();
    }
}