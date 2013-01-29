{:namespaces
 ({:source-url
   "https://github.com/clojure/java.classpath/blob/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath/clojure.java.classpath-api.html",
   :name "clojure.java.classpath",
   :author "Stuart Sierra",
   :doc "Utilities for dealing with the JVM's classpath"}),
 :vars
 ({:arglists ([classloader] []),
   :name "classpath",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj#L55",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/classpath",
   :doc
   "Returns a sequence of File objects of the elements on the classpath.",
   :var-type "function",
   :line 55,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([]),
   :name "classpath-directories",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj#L66",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/classpath-directories",
   :doc
   "Returns a sequence of File objects for the directories on classpath.",
   :var-type "function",
   :line 66,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([]),
   :name "classpath-jarfiles",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj#L71",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/classpath-jarfiles",
   :doc
   "Returns a sequence of JarFile objects for the JAR files on classpath.",
   :var-type "function",
   :line 71,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([jar-file]),
   :name "filenames-in-jar",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj#L33",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/filenames-in-jar",
   :doc
   "Returns a sequence of Strings naming the non-directory entries in\nthe JAR file.",
   :var-type "function",
   :line 33,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([f]),
   :name "jar-file?",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj#L25",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/jar-file?",
   :doc
   "Returns true if file is a normal file with a .jar or .JAR extension.",
   :var-type "function",
   :line 25,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([loader]),
   :name "loader-classpath",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj#L49",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/loader-classpath",
   :doc "Returns a sequence of File paths from a classloader.",
   :var-type "function",
   :line 49,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([]),
   :name "system-classpath",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj#L41",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/5b6a17a268d6e3eb34cf9e690ba0bbb61e9fceb8/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/system-classpath",
   :doc
   "Returns a sequence of File paths from the 'java.class.path' system\nproperty.",
   :var-type "function",
   :line 41,
   :file "src/main/clojure/clojure/java/classpath.clj"})}
