package org.example.utils.jsonnnn;

import java.util.Date;

public class Metadata {
    private String type;
    private String lastUpdated;

    public Metadata(String type,String lastUpdated) {
        this.type = type;
        // this.lastUpdated = new Date().toString();
        this.lastUpdated = lastUpdated;
    }

    public Metadata(){}

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "type='" + type + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
