Maven Archetype Template for FAST App
=====================================

Use mave-archetype-plugin to generate your FAST Application project.

Usage
-----

Install the archetype into your local maven repo:

    git clone https://github.com/snlab/fast-app-archetype.git
    cd fast-app-archetype
    mvn clean install

You can use interactive mode to generate FAST Application project like this:

    mvn archetype:generate \
        -DarchetypeGroupId=test.fast \
        -DarchetypeArtifactId=fast-app-archetype \
        -DarchetypeVersion=1.0.0-SNAPSHOT

Or use non-interactive mode to generate FAST Application project like this:

    mvn archetype:generate \
        -DarchetypeGroupId=test.fast \
        -DarchetypeArtifactId=fast-app-archetype \
        -DarchetypeVersion=1.0.0-SNAPSHOT \
        -DgroupId=fast.app \
        -DartifactId=simple-test \
        -Dversion=0.1.0-SNAPSHOT \
        -Dpackage=fast.simple.test \
        -DclassPrefix=FastSimpleTest \
        -Dcopyright=SNLab \
        -DcopyrightYear=2016 \
        -DinteractiveMode=false
