package automation.stubs.rest;

public class Mapping {

    private String id;
    private String uuid;
    private String name;
    private Request request;
    private Response response;
    private boolean persistent;
    private Integer priority;
    private String scenarioName;
    private String requiredScenarioState;
    private String newScenarioState;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public boolean isPersistent() {
        return persistent;
    }

    public void setPersistent(boolean persistent) {
        this.persistent = persistent;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public String getRequiredScenarioState() {
        return requiredScenarioState;
    }

    public void setRequiredScenarioState(String requiredScenarioState) {
        this.requiredScenarioState = requiredScenarioState;
    }

    public String getNewScenarioState() {
        return newScenarioState;
    }

    public void setNewScenarioState(String newScenarioState) {
        this.newScenarioState = newScenarioState;
    }
}
