package automation.entities;


public class AnyEntity {

    public String param1;
    public String param2;

    public AnyEntity(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public boolean isEmpty() {
        return false;
    }

    public String getParam1() { return param1; }

    public void setParam1(String param1) { this.param1 = param1;  }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param1 = param2;
    }

}
