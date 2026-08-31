@echo off
Title Project Insanity Client - Building...
if not exist bin mkdir bin
Javac -Xlint:deprecation -Xlint:unchecked -classpath . -d bin src\*.java sign\*.java
pause