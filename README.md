[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/beryx-gist/badass-jlink-example-hello-db-multi-project/blob/main/LICENSE)
[![Build Status](https://img.shields.io/github/workflow/status/beryx-gist/badass-jlink-example-hello-db-multi-project/jlink)](https://github.com/beryx-gist/badass-jlink-example-hello-db-multi-project/actions?query=workflow%3A%22jlink%22)


## Badass JLink Plugin Example: hello-db-multi-project ##

See [issue #179](https://github.com/beryx/badass-jlink-plugin/issues/179)

A small JavaFX application that shows how to use the [Badass JLink Plugin](https://github.com/beryx/badass-jlink-plugin) to create two jlink images of the same application, but each with a different runtime classpath.

This is a multi-project solution, which creates separate subprojects for each desired image.
The application code is in `app-main`, while `app-h2` and `app-hsqldb` are only tiny wrappers around it.

NOTE: For a single-project solution see [hello-db-single-project](https://github.com/beryx-gist/badass-jlink-example-hello-db-single-project).

### Usage
**Creating the custom runtime images:**
```
./gradlew jlink
```

The images will be created in the directories `app-h2/build/image` and `app-hsqldb/build/image`.
