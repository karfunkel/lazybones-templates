Gradle Project template for multi builds using groovy and spock
---------------------------------------------------------------

You've just created a basic Gradle project

The project's structure is laid out as follows

    <proj>
      |
      +- src
          |
          +- main
              |
              +- groovy
              |
                 // application sources in groovy
              +- java
              |
                 // application sources in java
              |
              +- resources
              |
                 // application resources

Execute the following command to compile and package the project

    ./gradlew build

Don't forget to update the pom configuration section found at
`gradle/publishing.gradle`.
