package module.demo;

import module.demo.api.Model;

public class ModuleDemo {
    public static void main(String[] args) {
        System.out.println("module.demo.api.Model located in " + Module.class.getModule());
        System.out.println(new Model("First module").getModuleName());
    }
}
