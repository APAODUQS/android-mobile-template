package automation.stubs;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

public interface WiremockManager {

    void startStub(Object... args) throws Exception;

    boolean waitToConsume() throws URISyntaxException, UnsupportedEncodingException;
}
