package com.jiker.keju;


import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class FileUtileTest  {

    @Test
    public void test() {
        FileUtile fileUtile = new FileUtile();
        try {
            assertEquals(fileUtile.readConfig( "testData.txt"), 0);
            assertEquals(fileUtile.getString(new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            }),0);

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
