# CherokeeConjugationUtilities
Conjugation utilities for conjugating verbs and pronominals

If you don't have Gradle go to http://sdkman.io and follow the installation instructions.

You can then run any of the Gradle tasks to build the project\
*gradle build* : builds the project\
*gradle jar* : makes a cherokee-conjugation-utilities jar to use in other projects\
*gradle clean* : cleans the project\
*gradle install* : installs the built jar to the .gradle cache for use in other projects\
*gradle test* : runs the tests

To include this project in another project add this to your gradle dependencies

compile group: 'com.cobradoc', name: 'cherokee-conjugation-utilities', version: '0.1.0'

In order to compile this project you will need to pull https://bitbucket.org/cherokeedictionary/cherokee-transliteration build and install this project locally
  
