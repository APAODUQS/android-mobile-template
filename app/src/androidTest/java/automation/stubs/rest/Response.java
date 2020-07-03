package automation.stubs.rest;

class Response {

    private String status;
    private String statusMessage;
    private String body;
    private String base64Body;
    private String fault;
    private String fromCOnfiguredStub;
    private String proxyBaseUrl;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBase64Body() {
        return base64Body;
    }

    public void setBase64Body(String base64Body) {
        this.base64Body = base64Body;
    }

    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }

    public String getFromCOnfiguredStub() {
        return fromCOnfiguredStub;
    }

    public void setFromCOnfiguredStub(String fromCOnfiguredStub) {
        this.fromCOnfiguredStub = fromCOnfiguredStub;
    }

    public String getProxyBaseUrl() {
        return proxyBaseUrl;
    }

    public void setProxyBaseUrl(String proxyBaseUrl) {
        this.proxyBaseUrl = proxyBaseUrl;
    }
}
