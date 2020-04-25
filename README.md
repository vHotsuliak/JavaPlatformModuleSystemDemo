#### Compiling 
javac -p mods -d target/classes  src/main/java/module/demo/*.java  src/main/java/module-info.java

#### Running from classes 
java -p target/classes --module module.info.file/module.demo.ModuleDemo

#### Creating JAR 
jar -cvf target/modulesDemo.jar -C src/main/java/ .

#### Running from 
java -p target -m module.info.file/module.demo.ModuleDemo