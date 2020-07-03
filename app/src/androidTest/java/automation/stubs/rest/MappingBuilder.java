package automation.stubs.rest;

public class MappingBuilder {

    private Mapping mapping = new Mapping();


    public MappingBuilder registryServiceMapping() {

        Request request = new Request();
        request.setUrl("detect/public/registration/mobileServices.htm?code=");
        mapping.setName("registryService");
        mapping.setPriority(1);
        mapping.setRequest(request);

        return this;
    }

    public Mapping build() {
        return this.mapping;
    }
}
