Reproduces a problem with gradle 2.3 and some ivy dependencies. See question on gradle forums here http://forums.gradle.org/gradle/topics/gradle-2-3-ivy-configuration-mapping-makes-dependencies-resolution-to-fail-test

The problem seems to come from the particular confmapping defined in dependency ivy.xml.

```console
$ git clone https://github.com/Starch/test-ivy
$ cd test-ivy/project/
$ ./gradlew test
:compileJava

FAILURE: Build failed with an exception.

* What went wrong:
Could not resolve all dependencies for configuration ':compile'.
> Module version xxx:yyy:5.63.0, configuration 'default' declares a dependency on configuration '*!test' which is not declared in the module descriptor for net.sourceforge.cobertura:cobertura:1.9

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

BUILD FAILED

Total time: 4.521 secs
```
