
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
     * Aceasta metoda calculeaza suma dintre x ridicat la puterea a-5a si y ridicat la putearea a-7a.
     * @return Returneaza rezultatul calculat.
     * @throws IOException Arunca exceptie daca datele introduse nu au formatul corect.
     */
    public double calculateX5PlusY7() throws IOException {
        double result = 0.0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Tastati valoarea pentru X:");
        double x = Double.parseDouble(reader.readLine());

        System.out.println("Tastati valoarea pentru Y:");
        double y = Double.parseDouble(reader.readLine());

       try{
           double x5 = calculatePow(x,5);
           double y7 = calculatePow(y,7);

           result = x5 + y7;
       }catch(NumberFormatException ioe){
           System.out.println("Valoarea nu este numerica");


       }

        return result;
    }

    private double calculatePow(double x, int number ) {
        double result=x;
        for( int i=0;i<number;i++){
            result *= x;
        }
        return result;

    }


}