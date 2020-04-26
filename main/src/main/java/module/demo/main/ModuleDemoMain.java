package module.demo.main;

import module.demo.api.Model;

public class ModuleDemoMain {
    public static void main(String[] args) {
        System.out.println(new Model("Multi module demo").getModuleName());
    }
}
