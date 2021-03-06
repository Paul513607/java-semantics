#!/bin/bash

export CLASSPATH=".:$PWD/antlr-4.7.1-complete.jar:$CLASSPATH"
alias antlr4="java -jar $PWD/antlr-4.7.1-complete.jar"
alias grun='java org.antlr.v4.gui.TestRig'
antlr4 $PWD/../src/main/java/grammar/parts/alk.g4 -no-listener -visitor -o $PWD/../src/main/java/grammar
javac $PWD/../src/main/java/grammar/alk*java
