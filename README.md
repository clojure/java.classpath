# java.classpath

Examine the Java classpath from Clojure programs.


## Releases and Dependency Information

This project follows the version scheme MAJOR.MINOR.PATCH where each component provides some relative indication of the size of the change, but does not follow semantic versioning. In general, all changes endeavor to be non-breaking (by moving to new names rather than by breaking existing names).

Latest stable release is 1.0.0

[CLI/`deps.edn`](https://clojure.org/reference/deps_and_cli) dependency information:
```clojure
org.clojure/java.classpath {:mvn/version "1.0.0"}
```

[Leiningen] dependency information:

    [org.clojure/java.classpath "1.0.0"]

[Maven] dependency information:

    <dependency>
      <groupId>org.clojure</groupId>
      <artifactId>java.classpath</artifactId>
      <version>1.0.0</version>
    </dependency>

[Gradle] dependency information:

    compile "org.clojure:java.classpath:1.0.0"

[Leiningen]: http://leiningen.org/
[Maven]: http://maven.apache.org/
[Gradle]: http://www.gradle.org/

Other versions:

* [All Released Versions](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.clojure%22%20AND%20a%3A%22java.classpath%22)

* [Development SNAPSHOTs](https://oss.sonatype.org/index.html#nexus-search;gav~org.clojure~java.classpath~~~)

* [How to get Development SNAPSHOTs](http://dev.clojure.org/display/doc/Maven+Settings+and+Repositories)

Releases are published to the [Maven Central Repository](http://search.maven.org/)

Development SNAPSHOTs are published to the [Sonatype Open-Source Repository](https://oss.sonatype.org/)


## Usage

See the [API Documentation](http://clojure.github.com/java.classpath/)

Examples:

```clojure
(require '[clojure.java.classpath :as cp])

(cp/classpath)
;; (#<File /foo/test> #<File /foo/src> ...)
```

The `classpath` function returns a sequence of java.io.File objects
representing all JAR files and directories on the classpath. It
defaults to using the classpath of Clojure's base
[ClassLoader](http://docs.oracle.com/javase/7/docs/api/java/lang/ClassLoader.html).

`classpath` also takes a ClassLoader as an optional argument.

Alternatively, the `system-classpath` function returns a sequence of
java.io.File objects parsed from the `java.class.path` Java system
property.

If you are using an environment which provides its own ClassLoader
implementation, such as a Java application server, you can extend the
protocol `URLClasspath` to support it. Refer to the source for
details.

**Starting with version 0.3.0**, the `classpath` function will fall
back to the `java.class.path` system property if the parent
ClassLoader is not an instance of [URLClassLoader](https://docs.oracle.com/javase/9/docs/api/java/net/URLClassLoader.html),
which is true for Java 9 and later.


## Developer Information

* [Change log](CHANGES.md)

* [GitHub project](https://github.com/clojure/java.classpath)

* [How to contribute](http://dev.clojure.org/display/community/Contributing)

* [Bug Tracker](http://dev.clojure.org/jira/browse/CLASSPATH)

* [Continuous Integration](http://build.clojure.org/job/java.classpath/)

* [Compatibility Test Matrix](http://build.clojure.org/job/java.classpath-test-matrix/)



## Copyright and License

Copyright (c) 2013-2020 Rich Hickey, Stuart Sierra, and contributors. All
rights reserved. The use and distribution terms for this software are
covered by the Eclipse Public License 1.0
(http://opensource.org/licenses/eclipse-1.0.php) which can be found in
the file epl.html at the root of this distribution. By using this
software in any fashion, you are agreeing to be bound by the terms of
this license. You must not remove this notice, or any other, from this
software.
