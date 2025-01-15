import java.io.*;
public class MatrixDataHandler {
        private int[][] matrix;
        private int h;
        private int w;
        private String filename;

    public void initializeMatrix(int h, int w, String filename) {
        this.h = h;
        this.w = w;
        this.filename = filename;
        this.matrix = new int[h][];
        for (int i = 0; i < h; i++) {
            matrix[i] = new int[w];
        }

    }
    private void writeMatrixFile(String filename) throws IOException {

        FileWriter fw = new FileWriter(filename);
        fw.write(h + " " + w + "\n");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                fw.write(matrix[i][j] + " ");
            }
            fw.write("\n");
        }
        fw.close();
    }
    public MatrixDataHandler(int h, int w, String filename) throws IOException {

        initializeMatrix(h,w,filename);

        writeMatrixFile(filename);

    }




        public int getValueFromPosition(String filename, int posH, int posW) {
            try {
                // !!!
                int valueFromPosition =-1;
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line = br.readLine();
                int h = Integer.parseInt(line.split(" ")[0]);
                int w = Integer.parseInt(line.split(" ")[1]);

                if(posH<h-1 && posW<w-1)
                    valueFromPosition=matrix[posH][posW];

                return valueFromPosition;
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
                return -1;
            }
        }

        public void modifyValueAndUpdateFile(String filename, int posH, int posW, int val) {
            try {
                // !!!
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line = br.readLine();
                int h = Integer.parseInt(line.split(" ")[0]);
                int w = Integer.parseInt(line.split(" ")[1]);

                initializeMatrix(h,w,filename);
                if(posH<h-1 && posW<w-1){
                    matrix[posH][posW] = val;
                } else{
                    val = -1;
                }

                writeMatrixFile(filename);
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }


