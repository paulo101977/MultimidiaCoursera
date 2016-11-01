package com.heroku.paulo101977.restfull;

import android.os.AsyncTask;



/**
 * Created by paulo on 31/10/2016.
 */
public abstract class AbstractWebService extends AsyncTask<String, Void, String> {

    //TODO implement this class

    @Override
    protected String doInBackground(String... strings) {

        //TODO: implement here
        publishProgress(null); //send msg to other method
        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        //TODO: implement
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }


    //TODO: It will be moved to Client Class

    //public abstract void getMethod();
    //public abstract void postMethod();
    //public abstract void updateMethod();
    //public abstract void removeMethod();
}
