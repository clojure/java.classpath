# java.classpath

Examine the Java classpath from Clojure programs.


## Releases and Dependency Information

Latest stable release is [0.2.2]

[Leiningen] dependency information:

    [org.clojure/java.classpath "0.2.2"]

[Maven] dependency information:

    <dependency>
      <groupId>org.clojure</groupId>
      <artifactId>java.classpath</artifactId>
      <version>0.2.2</version>
    </dependency>

[Gradle] dependency information:

    compile "org.clojure:java.classpath:0.2.2"

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


## Change Log

* Development version 0.2.3-SNAPSHOT, current Git `master` branch
* Release [0.2.2] on 2014-Jan-10
  * Enhancement [CLASSPATH-5]: extensible protocol to other classloaders
* Release [0.2.1] on 2013-Jan-18
  * Fix [CLASSPATH-4]: Use io/as-file instead of treating URL as file path
  * Fix [CLASSPATH-3]: Eliminate reflection
* Release [0.2.0] on 2011-Sep-15
  * Fix [CLASSPATH-1] & [CLASSPATH-2]: return classpath from all parent classloaders
* Release [0.1.2] on 2011-Sep-06
  * Use both java.class.path and Clojure's ClassLoader
* Release [0.1.1] on 2011-Apr-28
  * Eliminate relection
* Release [0.1.0] on 2011-Apr-22
  * Migrated from `clojure.contrib.classpath` and `clojure.contrib.jar`
    in legacy [clojure-contrib](https://github.com/clojure/clojure-contrib)

[CLASSPATH-5]: http://dev.clojure.org/jira/browse/CLASSPATH-5
[CLASSPATH-4]: http://dev.clojure.org/jira/browse/CLASSPATH-4
[CLASSPATH-3]: http://dev.clojure.org/jira/browse/CLASSPATH-3
[CLASSPATH-2]: http://dev.clojure.org/jira/browse/CLASSPATH-2
[CLASSPATH-1]: http://dev.clojure.org/jira/browse/CLASSPATH-1

[0.2.2]: https://github.com/clojure/java.classpath/tree/java.classpath-0.2.2
[0.2.1]: https://github.com/clojure/java.classpath/tree/java.classpath-0.2.1
[0.2.0]: https://github.com/clojure/java.classpath/tree/java.classpath-0.2.0
[0.1.2]: https://github.com/clojure/java.classpath/tree/java.classpath-0.1.2
[0.1.1]: https://github.com/clojure/java.classpath/tree/java.classpath-0.1.1
[0.1.0]: https://github.com/clojure/java.classpath/tree/java.classpath-0.1.0


## Developer Information

* [GitHub project](https://github.com/clojure/java.classpath)

* [How to contribute](http://dev.clojure.org/display/community/Contributing)

* [Bug Tracker](http://dev.clojure.org/jira/browse/CLASSPATH)

* [Continuous Integration](http://build.clojure.org/job/java.classpath/)

* [Compatibility Test Matrix](http://build.clojure.org/job/java.classpath-test-matrix/)



## Copyright and License

Copyright (c) 2013 Rich Hickey, Stuart Sierra, and contributors. All
rights reserved. The use and distribution terms for this software are
covered by the Eclipse Public License 1.0
(http://opensource.org/licenses/eclipse-1.0.php) which can be found in
the file epl.html at the root of this distribution. By using this
software in any fashion, you are agreeing to be bound by the terms of
this license. You must not remove this notice, or any other, from this
software.
