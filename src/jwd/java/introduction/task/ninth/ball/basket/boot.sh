#!/bin/sh

FILES=$(find . -type f -name "*.java")
javac -d target $FILES
java -classpath target jwd.java.introduction.task.ninth.ball.basket.Main
rm -rf target