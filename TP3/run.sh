#!/bin/bash
# 1. On nettoie et on recrée le dossier de sortie 'bin'
rm -rf bin
mkdir bin

# 2. On compile le code (traduction en langage machine) vers le dossier bin
# On inclut les librairies du dossier lib
javac -d bin -cp "lib/*" src/Main.java

# 3. Si la compilation réussit, on lance le programme
if [ $? -eq 0 ]; then
    echo "----------------------------------"
    echo "Compilation réussie. Lancement..."
    echo "----------------------------------"
    # On lance en disant à Java : regarde dans 'bin' ET dans 'lib'
    java -cp "bin:lib/*" Main
else
    echo "Erreur de compilation."
fi