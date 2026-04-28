package org.apache.commons.net.telnet;

public class TelnetSClient extends TelnetClient {
    public static final int DEFAULT_TELNETS_PORT = 992;

    public TelnetSClient() {
        super();
        setDefaultPort(DEFAULT_TELNETS_PORT);
    }
}