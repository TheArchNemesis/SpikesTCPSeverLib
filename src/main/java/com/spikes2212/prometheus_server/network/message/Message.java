package com.spikes2212.prometheus_server.network.message;

import java.util.Map;

public abstract class Message {
    public String id;

    public abstract void fromMap(Map<String, String> map);
}
