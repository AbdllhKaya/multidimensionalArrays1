import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        String [][] character = new String[6][4];

        for ( int i= 0; i< character.length; i++ ){
            for ( int j = 0; j<character[i].length; j++){
                if(i == 0 || i==2 ){
                    character[i][j] = " * ";
                }else if (j==0 || j== 3 ){
                    character[i][j] = " * ";
                }else {
                    character[i][j]= "   ";
                }
            }
        }
        for (String[] row : character){
            for (String col : row) {
                System.out. print(col);
            }
            System .out.println();
        }





    }
}