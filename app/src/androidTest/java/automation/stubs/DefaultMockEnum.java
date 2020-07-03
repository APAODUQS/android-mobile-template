package automation.stubs;

public enum DefaultMockEnum {

    DEVICE_REGISTRATION("","","",""),
    REGISTRATION_CODE("","","","");

    DefaultMockEnum(String path, String queryParams, String headers, String body) {
        this.path = path;
        this.queryParams = queryParams;
        Headers = headers;
        Body = body;
    }

    String path;
    String queryParams;
    String Headers;
    String Body;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(String queryParams) {
        this.queryParams = queryParams;
    }

    public String getHeaders() {
        return Headers;
    }

    public void setHeaders(String headers) {
        Headers = headers;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }
}
