package com.jiker.keju;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class FileUtile {
    public  List<String> readConfig( String args) throws IOException {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(args);
        String json = getString(inputStream);
        String[] datas = json.split("\n");
        return Arrays.asList(datas);
    }

    public  String getString(InputStream inputStream) {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        StringBuffer sb = new StringBuffer("");
        getBuffer(inputStreamReader,sb);
        return sb.toString();
    }

    public void getBuffer(InputStreamReader inputStreamReader,StringBuffer sb){
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
        } catch (Exception e) {
        }
    }
}
