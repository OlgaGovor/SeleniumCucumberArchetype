# Archetype for JUnit and BDD Tests

Maven archetype for test projects

## Getting Started

Deploy archetype to your maven repository

Deploy maven artefact (archetype)
mvn clean deploy -U -DskipTests

Create a project with your group and artifact Id's
Place Chromedriver file in src/test/resources/selenium

## Running the tests

to run by tag
``` 
mvn clean test -Dcucumber.options="--tags @first_test"
``` 
or to run all tests
``` 
mvn clean test
```

Tags can be combined, eg:
```
-Dtest.tags=@billing            # Runs all scenarios with tag
-Dtest.tags=~@important         # Runs the all scenarios without @important
-Dtest.tags="@billing --tags @important"    # Runs scenario with @important AND @billing)
-Dtest.tags="@billing,@important"           # Runs scenarios with @important OR @billing)
-Dtest.tags="@close-button --tags @mobile"
```
Will result in running all tests tagged with @close-button AND @mobile.

For more examples of joining tags please refer to:
[cucumber-jvm wiki](https://github.com/cucumber/cucumber/wiki/Tags#tag-inheritance)

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management


