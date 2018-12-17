package com.trevorpc.weekendwarrior5.viewmodels;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.trevorpc.weekendwarrior5.views.MainActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static android.content.ContentValues.TAG;

public class DataFetch extends AsyncTask<Void,Void,Void> {
    String data;
    @Override
    protected Void doInBackground(Void... voids) {

        try{
        URL url = new URL("http://de-coding-test.s3.amazonaws.com/books.json");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(inputStream));

        String line = "";
        while(line != null)
        {
            line = bufferReader.readLine();
            data = data + line;
        }
        }
        catch (MalformedURLException e){
            Log.e("TAG", "doInBackground: ",e );
        }
        catch (IOException e) {
            Log.e("TAG", "doInBackground: ", e);
        }

        Log.d(TAG, "doInBackground: " + data);
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        //listObject ls = Gson.fromJson(data, ls.class);
        MainActivity.textView.setText(this.data);
    }
}
