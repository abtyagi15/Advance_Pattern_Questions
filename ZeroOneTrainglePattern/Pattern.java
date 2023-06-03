public class Pattern {
    public static void printPattern(){
        int outerNum = 1;
        int innerNum = 0;
        for(int i=1;i<=5;i++){
            outerNum=switchZeroOne(outerNum);
            for(int j=1;j<=i;j++){
                if(j==1){
                    innerNum = switchZeroOne(outerNum);
                    System.out.print(innerNum); 
                }
                else{
                    innerNum = switchZeroOne(innerNum);
                    System.out.print(innerNum);  
                }
                             
            }
            System.out.println();
        }
    }
    public static int switchZeroOne(int num){
        switch(num){
            case 0:
            num= 1;
            break;

            case 1:
            num= 0;
            break;
        }
        return num;
    }
    public static void main(String args[]){
        printPattern();
    }
}
