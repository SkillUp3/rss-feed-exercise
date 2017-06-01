package com.example.idejesus.rssfeedexercise;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instantiate DownloadData
        //execute async task of downloadData
    }

    private class DownloadData extends AsyncTask<String, Void, String>{

        private static final String TAG = "DownloadData";

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.d(TAG, "onPostExecute: parameter is" + s);
        }

        @Override
        protected String doInBackground(String... params) {
            Log.d(TAG, "doInBackground: starts with " + params[0]);
            String rssFeed = downloadXML(params[0]);
            return "doInBackground completed.";
        }
    }

    private String downloadXML(String urlPath){

        StringBuilder xmlResult = new StringBuilder();
        try{
            //create a url
            //create a httpurlconnection
            //Use Java I/O to download data from the url connection

            //use a buffer to and append xmlResult from data coming from  the buffered reader

            //return xmlresult as string
        }catch(Exception e){

        }
        return null;
    }
}
