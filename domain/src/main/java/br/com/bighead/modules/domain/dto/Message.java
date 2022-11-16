package br.com.bighead.modules.domain.dto;

public class Message {

    private String payload;
    private String topic;

    public Message() {
    }

    public Message(String payload, String topic) {
        this.payload = payload;
        this.topic = topic;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPayload() {
        return payload;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String toString() {
        return "Message [payload=" + payload + ", topic=" + topic + "]";
    }

}
