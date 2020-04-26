package module.demo.api;

import java.util.Objects;

public class Model {
    private String moduleName;

    public Model() {
    }

    public Model(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return moduleName.equals(model.moduleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleName);
    }

    @Override
    public String toString() {
        return "Model{" +
                "moduleName='" + moduleName + '\'' +
                '}';
    }
}
