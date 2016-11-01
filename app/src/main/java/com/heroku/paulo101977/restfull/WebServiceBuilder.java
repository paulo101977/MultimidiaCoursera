package com.heroku.paulo101977.restfull;

/**
 * Created by paulo on 31/10/2016.
 */

//TODO implement this builder class
public class WebServiceBuilder extends AbstractWebService {

    private String url = null;

    private WebServiceBuilder(String url){
        this.url = url;
    }

    public static AbstractWebService webServiceBuilder(String url) {
        AbstractWebService builder = new WebServiceBuilder(url);
        return builder;
    }
}
