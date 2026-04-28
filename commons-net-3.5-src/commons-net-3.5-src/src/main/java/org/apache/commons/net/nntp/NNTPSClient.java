package org.apache.commons.net.nntp;

/**
 * NNTPSClient implements NNTP over SSL/TLS.
 */
public class NNTPSClient extends NNTPClient {
    public static final int DEFAULT_NNTPS_PORT = 563;

    public NNTPSClient() {
        super();
        setDefaultPort(DEFAULT_NNTPS_PORT);
    }
}