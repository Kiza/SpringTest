/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.hellospring;

/**
 *
 * @author Kiza
 */
public class HelloWorldMessageProvider implements MessageProvider{

    public String getMessage() {
        return "Hello World!";
    }
    
}
