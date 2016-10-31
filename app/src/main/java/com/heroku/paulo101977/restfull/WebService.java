package com.heroku.paulo101977.restfull;

import android.os.AsyncTask;



/**
 * Created by paulo on 31/10/2016.
 */
public abstract class WebService extends AsyncTask<String, Void, String> {

    //TODO implement this class

    @Override
    protected String doInBackground(String... strings) {
        return null;
    }

    //TODO: implement a Class to build this object (Builder)
    public abstract WebService webServiceBuilder(String url);
}
