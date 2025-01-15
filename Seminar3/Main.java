import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CalculatorRefactored calculator = new CalculatorRefactored();
        double result = calculator.calculatePowXPlusPowY();
        System.out.println("Rezultatul este: " + result);


        MatrixDataHandler mH = new MatrixDataHandler(5, 7, "matrix.txt");
        mH.modifyValueAndUpdateFile(1, 1, 345);
        System.out.println("Valoarea este: " + mH.getValueFromPosition("matrix.txt",3,4));

    }
}