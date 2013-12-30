package com.telrikk.elasticnotes.client;

public class Clients {
    public static Client newDefaultClient() {
        return new DefaultClient();
    }
    
    public static Client newDefaultClient (
            Configuration configuration) {
        return new DefaultClient(configuration);
    }
}
