public class Main {
    public static void main(String[] args){

        char[] row1 = {'1','2','3'};
        char[] row2 = {'4','5','6'};
        char[] row3 = {'7','8','9'};

        char[][] keyPad = {row1, row2, row3};


        for(char[] row: keyPad){
            for(char number: row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
