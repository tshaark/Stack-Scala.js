### Stack-Implementation-Scala.js
[Reference Guide For Basic Setup](http://www.scala-js.org/doc/tutorial/basic/)

This is a basic webapp developed using scala.js.
It is a visual representation of a stack, a number can be pushed or poped.

##Installing SBT(scala build tool)
1- First, make sure you have the Java 8 JDK installed.
2- Download & install Node.js
3- Install SBT(scala build tool)

```bash
echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823
sudo apt-get update
sudo apt-get install sbt
```

##Adjusting the code to your pc
#You need to make changes to build.sbt, /project/build.properties, /project/plugins.sbt (/ is the webapp's root directory)
1- Check the sbt version installed

```bash
sbt sbtVersion
```

2- Check the scala version installed

```bash
scala -version
```

##Running the code
1-In the root directory run
```bash
sbt
```
2-run
```bash
fastOptJS
```

3- Open the html file in the root directory and ENJOY!!!

