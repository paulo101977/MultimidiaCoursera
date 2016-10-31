package com.heroku.paulo101977.restfull;

/**
 * Created by paulo on 31/10/2016.
 */

//TODO implement this builder class
public class WebServiceBuilder extends WebService {

    private WebServiceBuilder(){

    }

    @Override
    public WebService webServiceBuilder(String url) {
        WebService builder = new WebServiceBuilder();
        return builder;
    }
}
