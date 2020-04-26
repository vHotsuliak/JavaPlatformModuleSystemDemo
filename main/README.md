#### Compiling 
javac -p target/main/classes:target/api/classes -d target/main/classes main/src/main/java/module/demo/main/*.java  main/src/main/java/module-info.java

#### Running from classes 
java -p target/main/classes:target/api/classes --module module.demo.main/module.demo.main.ModuleDemoMain

#### Creating JAR 
jar -cvf target/main/ModulesDemoMain.jar -C main/src/main/java/ .

#### Running from JARs
java -p target/main:target/api --module module.demo.main/module.demo.main.ModuleDemoMain