package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String []arrayList = {"line1", "line2", "line3", "line4", "line5", "line6", "line7", "line8", "line9", "line10"};
        int recordsCount = arrayList.length;
        int recordsPerFile = 2;
        int filesCount = recordsCount / recordsPerFile;

        for(int i = 0; i < filesCount; i++){
            //create the file
            for(int j = 0; j < recordsPerFile;j++){
                //write to a file
                int recordNumber = i * recordsPerFile + j;
                String record = "Record " + recordNumber;
                System.out.println(record);
            }
            //close the file
            System.out.println("*****");
        }
    }
}