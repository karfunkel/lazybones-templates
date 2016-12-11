Gradle GroovyFX Project template
-----------------------

You've just created a basic GroovyFX project using Gradle

The project's structure is laid out as follows

    <proj>
      |
      +- src
          |
          +- main
              |
              +- groovy
              |
                 // application sources
              |
              +- resources
              |
                 // application resources

Execute the following command to compile and package the project

    ./gradlew build

Don't forget to update the pom configuration section found at
`gradle/publishing.gradle`.
