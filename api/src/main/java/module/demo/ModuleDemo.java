package module.demo;

import module.demo.api.Model;

public class ModuleDemo {
    public static void main(String[] args) {
        System.out.println(new Model("First module").getModuleName());
    }
}
