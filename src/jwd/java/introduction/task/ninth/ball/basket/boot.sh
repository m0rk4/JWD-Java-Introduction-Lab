#!/bin/sh

javac -d target $(find . -type f -name "*.java")
java -classpath target jwd.java.introduction.task.ninth.ball.basket.Main
rm -rf target
