package iostreampractice.csv.AdvancedProblems;

import java.io.*;
import java.util.*;

public class MergeCsv {
    public static void main(String[] args) {
        try (BufferedReader br1 = new BufferedReader(new FileReader("student1.csv"));
             BufferedReader br2 = new BufferedReader(new FileReader("student2.csv"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("mergeStudent.csv"))) {

            Map<String, ArrayList<String>> data = new HashMap<>();

            String line;
            while ((line = br1.readLine()) != null) {
                String[] st = line.split(",");
                String id = st[0].trim();
                String name = st[1].trim();
                String age = st[2].trim();

                ArrayList<String> arr = new ArrayList<>();
                arr.add(name);
                arr.add(age);

                data.put(id, arr);
            }
            while ((line = br2.readLine()) != null) {
                String[] st = line.split(",");
                String id = st[0].trim();
                String grade = st[2].trim();

                ArrayList<String> arr = data.get(id);
                if (arr != null) {
                    arr.add(grade);
                } else {
                    System.out.println("ID " + id + " in student2.csv not found in student1.csv");
                }
            }

            bw.write("id,name,age,grade");
            bw.newLine();
            for (Map.Entry<String, ArrayList<String>> entry : data.entrySet()) {
                bw.write(entry.getKey());
                ArrayList<String> user = entry.getValue();

                for (String s : user) {
                    bw.write("," + s);
                }
                bw.newLine();
            }

            System.out.println("CSV files merged successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}