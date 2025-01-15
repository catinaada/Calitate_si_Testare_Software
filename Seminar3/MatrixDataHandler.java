import java.io.*;
public class MatrixDataHandler {
        private int[][] matrix;
        private int height;
        private int weight;
        private String filename;

    /**
     * Constructor care initializeaza matricea pe baza valorilor primite pt dimensiuni.
     * Matricea initializata este scrisa in fis. filename
     * @param height
     * @param weight
     * @param filename
     */

    public MatrixDataHandler(int height, int weight, String filename) {
        this.height = height;
        this.weight = weight;
        this.filename = filename;
        this.matrix = new int[height][];
        for (int i = 0; i < height; i++) {
            matrix[i] = new int[weight];
        }

        if(!this.writeMatrixToFile()){
            System.out.println("Ceva nu a fost ok la scrierea in fisier");

        }
    }

    /**
     * Metoda scrie matricea in fisierul  <thid.filename>
     * @return Se returneaza true daca acea scriere e cu succes iar folse in caz contrar
     */
    public boolean writeMatrixToFile() {
        try {

            FileWriter fw = new FileWriter(this.filename);
            fw.write(height + " " + weight + "\n");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < weight; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
            fw.close();
            return true;

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            System.exit(-1);
            return false;
        }
    }

    /**
     * Returneaza val de pe o anumita pozitie din matrice
     * inainte de a returna se va actualiza  matr cu datele din fisier
     *
     * @param filename
     * @param posHeight
     * @param posWeight
     * @return
     */
        public int getValueFromPosition(String filename, int posHeight, int posWeight) {
          if( !this.readMatrixFromFile())
              System.out.println("Citirea din fisier a esuat ");
          return this.matrix[posHeight][posWeight];

        }

    /**
     * Citeste din fisier datele din matrice conform clasei create
     * @return true daca s-a citit cu succes si false daca a aparut o exceptie
     */


    public boolean readMatrixFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filename));
            String line = br.readLine();
            height = Integer.parseInt(line.split(" ")[0]);
            weight = Integer.parseInt(line.split(" ")[1]);

            for (int i = 0; i < height; i++) {
                line = br.readLine();
                for (int j = 0; j < weight; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
            br.close();
            return true;
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }


    /**
     * Se citesc val din fisier ,se modif valoarea si apoi se rescriu in fisier
     * @param posHeight linia
     * @param posWeight coloana
     * @param val noua val
     */

    public void modifyValueAndUpdateFile( int posHeight, int posWeight, int val) {
                this.readMatrixFromFile();
                this.matrix[posHeight][posHeight]=val;
                this.writeMatrixToFile();

    }
}



