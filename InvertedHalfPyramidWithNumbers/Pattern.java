public class Pattern {

    public static void printPattern(int line){
        for(int i=0;i<line;i++){
            int num=1;
            for(int j=1;j<=(line-i);j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int line=5;
        printPattern(line);
    }
}
