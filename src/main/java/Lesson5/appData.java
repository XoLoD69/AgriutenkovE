package Lesson5;

import java.io.*;


public class appData implements Serializable {
    private String[] header;
    private int[][] data;

    public appData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }
}
