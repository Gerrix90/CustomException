/**
 * Created by Gerrix on 11.3.2017..
 */
public class CustomException extends Exception{

    private int check;

    CustomException(int check){
        this.check = check;
    }

    public String toString(){
        return "CustoException [Number " + check + " is bigger then 10]" ;
    }
}
