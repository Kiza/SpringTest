/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.hellospring;

/**
 *
 * @author Kiza
 */
public interface MessageRenderer {

    public void render();

    public void setMessageProvider(MessageProvider messageProvider);

    public MessageProvider getMessageProvider();
}
