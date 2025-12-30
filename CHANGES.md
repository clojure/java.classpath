# java.classpath Change Log

## 1.1.x series

### Release [1.1.1] on 2025-Dec-30

* Update parent pom

## 1.0.x series

### Release [1.0.0] on 2020-Feb-18

* No changes from previous

## 0.3.x series

### Release [0.3.0] on 2018-May-06

* Fix [CLASSPATH-8]: empty classpath returned on Java 9.

Starting with Java 9, the default class loader is no longer an
instance of URLClassLoader, so `classpath` returned an empty sequence.
The strategy of using URLClassLoader started with release [0.2.0] to
accommodate Java application containers (see [CLASSPATH-1] and
[CLASSPATH-2]). After this change, application containers based on
URLClassLoader should still work as expected.

On Java 9 without an application container, it appears that the
`java.class.path` system property is the only way to get the
classpath. While this is essentially a bugfix for Java 9
compatibility, it is a change in behavior, hence the version change
from 0.2 to 0.3.


## 0.2.x series

### Release [0.2.3] on 2015-Nov-06

* Fix [CLASSPATH-7]: ignore classloaders which do not implement URLClasspath

### Release [0.2.2] on 2014-Jan-10

* Enhancement [CLASSPATH-5]: extensible protocol to other classloaders

### Release [0.2.1] on 2013-Jan-18

* Fix [CLASSPATH-4]: Use io/as-file instead of treating URL as file path

* Fix [CLASSPATH-3]: Eliminate reflection

### Release [0.2.0] on 2011-Sep-15

* Fix [CLASSPATH-1] & [CLASSPATH-2]: return classpath from all parent classloaders



## 0.1.x series

### Release [0.1.2] on 2011-Sep-06

* Use both java.class.path and Clojure's ClassLoader

### Release [0.1.1] on 2011-Apr-28

* Eliminate relection

### Release [0.1.0] on 2011-Apr-22

* Migrated from `clojure.contrib.classpath` and `clojure.contrib.jar`
  in legacy [clojure-contrib](https://github.com/clojure/clojure-contrib)



[CLASSPATH-8]: https://clojure.atlassian.net/browse/CLASSPATH-8
[CLASSPATH-7]: https://clojure.atlassian.net/browse/CLASSPATH-7
[CLASSPATH-6]: https://clojure.atlassian.net/browse/CLASSPATH-6
[CLASSPATH-5]: https://clojure.atlassian.net/browse/CLASSPATH-5
[CLASSPATH-4]: https://clojure.atlassian.net/browse/CLASSPATH-4
[CLASSPATH-3]: https://clojure.atlassian.net/browse/CLASSPATH-3
[CLASSPATH-2]: https://clojure.atlassian.net/browse/CLASSPATH-2
[CLASSPATH-1]: https://clojure.atlassian.net/browse/CLASSPATH-1

[1.1.1]: https://github.com/clojure/java.classpath/tree/java.classpath-1.1.1
[1.0.0]: https://github.com/clojure/java.classpath/tree/java.classpath-1.0.0
[0.3.0]: https://github.com/clojure/java.classpath/tree/java.classpath-0.3.0
[0.2.3]: https://github.com/clojure/java.classpath/tree/java.classpath-0.2.3
[0.2.2]: https://github.com/clojure/java.classpath/tree/java.classpath-0.2.2
[0.2.1]: https://github.com/clojure/java.classpath/tree/java.classpath-0.2.1
[0.2.0]: https://github.com/clojure/java.classpath/tree/java.classpath-0.2.0
[0.1.2]: https://github.com/clojure/java.classpath/tree/java.classpath-0.1.2
[0.1.1]: https://github.com/clojure/java.classpath/tree/java.classpath-0.1.1
[0.1.0]: https://github.com/clojure/java.classpath/tree/java.classpath-0.1.0

