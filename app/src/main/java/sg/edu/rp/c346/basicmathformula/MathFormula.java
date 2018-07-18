package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 17042725 on 18/7/2018.
 */

public class MathFormula {
    private String name;
    private String method;
    private String type;

    public MathFormula(String name, String method, String type) {
        this.name = name;
        this.method = method;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MathFormula{" +
                "name='" + name + '\'' +
                ", method='" + method + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}