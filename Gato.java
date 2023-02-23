public class Gato{
    public static void main (String[] args){
        char [][] marcoJuego = {{' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '},
                            {'-', '+', '-', '+', '-'},
                            {' ', '|', ' ', '|', ' '}};
        for(char[] row : marcoJuego) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}