package automation.cucumber.steps;

import android.util.Log;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.crypto.NoSuchPaddingException;

import automation.entities.AnyEntity;
import automation.stubs.ConfigBuilder;
import automation.stubs.ConfigStub;
import automation.stubs.FactorEnum;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class BackgroundSteps {

    private WireMockServer wireMockServer = new WireMockServer();

    private ConfigStub configStub = new ConfigStub();
    private ConfigBuilder configBuilder = new ConfigBuilder();
    private ArrayList<FactorEnum> factorList = new ArrayList<>();

    public BackgroundSteps() throws NoSuchPaddingException, NoSuchAlgorithmException {
    }

    @Before
    public void setup() {
        wireMockServer.start();
        wireMockServer.resetRequests();
    }

    @Given("^a Mock with the params:$")
    public void setAuthenticationFactors(DataTable options) {
        Log.i("Automation", "a Mock with the params: " + options);
        factorList.addAll(options.asList(FactorEnum.class));

        AnyEntity requestBody = configBuilder
                .addParam1(factorList.get(0).getParameter())
                .addParam2(factorList.get(1).getParameter())
                .build();
        configStub.startStub(requestBody);
        Log.i("Automation", "Global Config stub were up");
    }

    @After
    public void afterTests() throws UnirestException {
        this.wireMockServer.stop();
    }
}
