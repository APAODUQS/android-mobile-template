package automation.stubs;

import com.google.gson.Gson;
import automation.entities.AnyEntity;

public class ConfigBuilder {

    private AnyEntity anyEntity;
    private final Gson gson = new Gson();

    public ConfigBuilder addParam1(String param) {
        anyEntity.setParam1(param);
        return this;
    }

    public ConfigBuilder addParam2(String param) {
        anyEntity.setParam2(param);
        return this;
    }

    public AnyEntity build() {
        String messageConfig = gson.toJson(anyEntity);
        return this.anyEntity;
    }

}
