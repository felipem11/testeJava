package com.itau.felipe.spring.restservices;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getIdCl() {
        return id;
    }

    public String getContentcl() {
        return content;
    }
    
    public String getVersao() {
        return "1.0";
    }
}
