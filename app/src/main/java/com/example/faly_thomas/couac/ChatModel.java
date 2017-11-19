package com.example.faly_thomas.couac;

/**
 * Created by Faly-Thomas on 18/11/2017.
 */

public class ChatModel {
    public String charMessage;
    public boolean isSend;

    public ChatModel(String charMessage, boolean isSend) {
        this.charMessage = charMessage;
        this.isSend = isSend;
    }

    public String getCharMessage() {
        return charMessage;
    }

    public void setCharMessage(String charMessage) {
        this.charMessage = charMessage;
    }

    public boolean isSend() {
        return isSend;
    }

    public void setSend(boolean send) {
        isSend = send;
    }
}
