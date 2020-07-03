package automation.stubs;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.verification.LoggedRequest;
import com.google.gson.Gson;

import automation.cucumber.steps.Constants;

import org.hamcrest.CoreMatchers;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.awaitility.Awaitility.await;

public class ConfigStub implements WiremockManager {

    private final Gson gson = new Gson();

    @Override
    public void startStub(Object... args) {
        String dataResponse = gson.toJson(args[0]);

        WireMock.stubFor(post(urlPathMatching("PATH"))
                .withHeader("Accept", equalTo("application/vnd.detectid.v7.1+json"))
                .willReturn(aResponse().withBody(dataResponse).withStatus(Integer.parseInt(Constants.STATUS_CODE_OK))));
    }

    @Override
    public boolean waitToConsume() throws URISyntaxException, UnsupportedEncodingException {
        Callable<Boolean> licenseConsumed = () -> {
            List<LoggedRequest> licenseRequests = findAll(postRequestedFor(urlEqualTo("PATH")));
            return licenseRequests.size() > 0;
        };
        return await().atMost(30, TimeUnit.SECONDS).until(licenseConsumed, CoreMatchers.is(true));
    }

}
