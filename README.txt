
https://learntocodetogether.com/binary-search-tree-java/
https://github.com/namvdo/data-structures-and-algorithms-in-java/blob/master/binary-search-tree/Bst.java

https://github.com/microsoft/vscode-java-test/issues/851

generate offline testcase
=========================
java -jar graphwalker-cli-4.2.0.jar offline -m C:\workspace\bst\bin\resources\model.json --unvisited --verbose "random(edge_coverage(100))"

# To get the element names only, and also using seed:
java -jar C:\workspace\bst\lib\graphwalker-cli-4.2.0.jar offline --seed 147945811993279 -m C:\workspace\bst\bin\resources\model.json "random(edge_coverage(100))" | jq '.currentElementName'

# Generate junit source code for the model:
java -jar C:\workspace\bst\lib\graphwalker-cli-4.2.0.jar source -i C:\workspace\bst\bin\resources\model.json C:\workspace\bst\src\resources\junit.template > C:\workspace\bst\src\test\BstGwTest.java

# Generate a java test souce code:
java -jar C:\workspace\bst\lib\graphwalker-cli-4.2.0.jar source -i C:\workspace\bst\bin\resources\model.json C:\workspace\bst\src\resources\java.template > C:\workspace\bst\src\test\BstGwTest.java

Run the graphwalker test file from the commandline with enabling assertion:
PS C:\workspace\bst\bin\test> java -ea BstGwTest