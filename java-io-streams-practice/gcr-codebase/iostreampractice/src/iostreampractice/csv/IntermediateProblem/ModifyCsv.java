package iostreampractice.csv.IntermediateProblem;

import java.io.*;

public class ModifyCsv {
	public static void main(String[] args) {

        String inputFile = "userData.csv";
        String outputFile = "updatedUserData.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    bw.write(line);
                    bw.newLine();
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                
                String id =data[0].trim();
                String name = data[1].trim();
                String department = data[2].trim();
                double salary = Double.parseDouble(data[3].trim());

                if (department.equalsIgnoreCase("IT")) {
                    salary = salary * 1.10;
                }

                bw.write(id+", "+name + "," + department + "," + (int) salary);
                bw.newLine();
            }

            System.out.println("CSV updated successfully!");

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

}