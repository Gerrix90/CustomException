/**
 * Created by Gerrix on 11.3.2017..
 */
public class MainClass {

    public static void main(String args[]){

        int number = 11;
        try {
            check(number);
        } catch (CustomException e) {
            e.printStackTrace();
        }finally {
            for (int i = 0; i < number; i++) {
                System.out.println("It works :)");
            }
        }
    }

    public static void check(int number)throws CustomException{

        if (number > 10){
            throw new CustomException(number);
        }
    }
}
