#### Compiling 
javac -p mods -d target/classes  api/src/main/java/module/demo/*.java api/src/main/java/module/demo/api/*.java  api/src/main/java/module-info.java

#### Running from classes 
java -p target/classes --module module.demo.api/module.demo.ModuleDemo

#### Creating JAR 
jar -cvf target/ModulesDemoApi.jar -C api/src/main/java/ .

#### Running from 
java -p target -m module.demo.api/module.demo.ModuleDemo