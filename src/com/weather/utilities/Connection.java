package com.weather.utilities;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.*;
import java.net.URL;

public class Connection {
    public static void Connect(String url, String fileName) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(url);
            httpget.setHeader("Content-Type", "application/json");
            CloseableHttpResponse response = httpclient.execute(httpget);
            StringBuilder total = new StringBuilder();
            String line;
            BufferedReader r = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            FileOutputStream output = new FileOutputStream(fileName, false);
            if (response != null) {
            while ((line = r.readLine()) != null) {
                total.append(line);
            }
                PrintWriter printWriter = new PrintWriter (output);
                printWriter.print(total.toString());
                printWriter.close ();
             //System.out.println(total.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            httpclient.close();
        }
    }
}
