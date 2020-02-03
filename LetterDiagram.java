public class LetterDiagram {
    public static void main(String args[]) {
        for(int i = 0 ; i <= 4; i++){
            for(int j = 0; j <= 4; j++){
                if(i==0 || i ==4){
                    System.out.print("*");
                }
                else if(j ==0){
                    System.out.print("*");
                }
                else if(i ==2 && j >2){
                    System.out.print("*");
                }
                else if (i==3 && j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
