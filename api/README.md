#### Compiling 
javac -p target/api -d target/api/classes  api/src/main/java/module/demo/*.java api/src/main/java/module/demo/api/*.java  api/src/main/java/module-info.java

#### Running from classes 
java -p target/api/classes --module module.demo.api/module.demo.ModuleDemo

#### Creating JAR 
jar -cvf target/api/ModulesDemoApi.jar -C api/src/main/java/ .

#### Running from JAR
java -p target/api -m module.demo.api/module.demo.ModuleDemo