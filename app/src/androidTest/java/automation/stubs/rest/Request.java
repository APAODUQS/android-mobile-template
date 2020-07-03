package automation.stubs.rest;

class Request {

    private String method;
    private String url;
    private String urlPathPattern;
    private String getUrlPathPattern;
    private String queryParameters;
    private String headers;
    private String cookies;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlPathPattern() {
        return urlPathPattern;
    }

    public void setUrlPathPattern(String urlPathPattern) {
        this.urlPathPattern = urlPathPattern;
    }

    public String getGetUrlPathPattern() {
        return getUrlPathPattern;
    }

    public void setGetUrlPathPattern(String getUrlPathPattern) {
        this.getUrlPathPattern = getUrlPathPattern;
    }

    public String getQueryParameters() {
        return queryParameters;
    }

    public void setQueryParameters(String queryParameters) {
        this.queryParameters = queryParameters;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getCookies() {
        return cookies;
    }

    public void setCookies(String cookies) {
        this.cookies = cookies;
    }
}
