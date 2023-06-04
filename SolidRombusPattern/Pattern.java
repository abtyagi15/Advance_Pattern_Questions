public class Pattern {

    public static void printPattern(int rows){
        int space = rows-1;
        
        while(space>=0){
            for(int i=1;i<=space;i++){
                System.out.print(" ");
            }
            int  star = rows;
            while(star>0){
                System.out.print("*");
                star--;
            }
            space--;
            System.out.println();
        }
    }
    public static void main(String[] args){
        int rows = 6;
        printPattern(rows);
    }
}
