Gradle ASCIIDoc Documentation Template
--------------------------------------

You've just created a quickstart for creating ASCIIDoc based documentation

The project's structure is laid out as follows

    <proj>
      |
      +- src
          |
          +- docs
              |
              +- fonts
              |
                 // fonts used in the theme
              |
              +- images
              |
                 // image resources
              |
              +- theme
              |
                 // the custom them that is used. Please adjust accordingly.

Execute the following command to create the documentation:

    ./gradlew asciidoctor

Execute the following command to create the documentation on the fly as yoou change the sources:

    ./gradlew --continuous asciidoctor
    
    or
    
    ./gradlew -t asciidoctor 

Don't forget to update the `Header.png` image.

If you add additional source files, add a include in the `build.gradle` file to 
    
    asciidoctor {
        sources {
            include 'Main.adoc'
        }
    }