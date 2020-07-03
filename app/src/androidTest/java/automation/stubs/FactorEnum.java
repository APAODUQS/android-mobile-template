package automation.stubs;

public enum FactorEnum {
    X("1", "X"),
    Y("2", "Y"),
    UNKNOWN("000","No match");

    FactorEnum(String idFactor, String parameter) {
        this.idFactor = idFactor;
        this.parameter = parameter;
    }

    String idFactor;
    String parameter;

    public String getIdFactor() {
        return idFactor;
    }

    public String getParameter() {
        return parameter;
    }

    public static FactorEnum fromStringResponse(String stringResponse) {
        for(FactorEnum enumCode : FactorEnum.values()){
            if(enumCode.parameter.equals(stringResponse)){
                return enumCode;
            }
        }
        return UNKNOWN;
    }

    public static FactorEnum fromIdResponse(String idResponse) {
        for(FactorEnum enumCode : FactorEnum.values()){
            if (enumCode.idFactor.equals(idResponse)) {
                return enumCode;
            }
        }
        return UNKNOWN;
    }

}
