package com.accenture.bootcamp.task5c;

/**
 * caller's IP address, as returned from
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IPAddress {
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "IPAddress{" +
                "ip='" + ip + '\'' +
                '}';
    }
}
