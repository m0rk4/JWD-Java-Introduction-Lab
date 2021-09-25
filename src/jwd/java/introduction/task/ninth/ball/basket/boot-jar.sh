#!/bin/sh

javac -d . $(find . -type f -name "*.java")
jar cfe boot.jar jwd.java.introduction.task.ninth.ball.basket.Main \
  jwd/java/introduction/task/ninth/ball/basket/*.class \
  jwd/java/introduction/task/ninth/ball/basket/**/*.class \
  jwd/java/introduction/task/ninth/ball/basket/**/**/*.class
rm -rf jwd
java -jar boot.jar
