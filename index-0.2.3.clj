{:namespaces
 ({:source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
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
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L71",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/classpath",
   :doc
   "Returns a sequence of File objects of the elements on the classpath.",
   :var-type "function",
   :line 71,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([]),
   :name "classpath-directories",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L82",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/classpath-directories",
   :doc
   "Returns a sequence of File objects for the directories on classpath.",
   :var-type "function",
   :line 82,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([]),
   :name "classpath-jarfiles",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L87",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/classpath-jarfiles",
   :doc
   "Returns a sequence of JarFile objects for the JAR files on classpath.",
   :var-type "function",
   :line 87,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([jar-file]),
   :name "filenames-in-jar",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L50",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/filenames-in-jar",
   :doc
   "Returns a sequence of Strings naming the non-directory entries in\nthe JAR file.",
   :var-type "function",
   :line 50,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([loader]),
   :name "get-urls",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L34",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/get-urls",
   :doc
   "Returns a sequence of java.net.URL objects used by this\nclassloader, or nil if the classloader does not sastify the\nURLClasspath protocol.",
   :var-type "function",
   :line 34,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([f]),
   :name "jar-file?",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L42",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/jar-file?",
   :doc
   "Returns true if file is a normal file with a .jar or .JAR extension.",
   :var-type "function",
   :line 42,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([loader]),
   :name "loader-classpath",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L66",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/loader-classpath",
   :doc "Returns a sequence of File paths from a classloader.",
   :var-type "function",
   :line 66,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([]),
   :name "system-classpath",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L58",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/system-classpath",
   :doc
   "Returns a sequence of File paths from the 'java.class.path' system\nproperty.",
   :var-type "function",
   :line 58,
   :file "src/main/clojure/clojure/java/classpath.clj"}
  {:file "src/main/clojure/clojure/java/classpath.clj",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L25",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/URLClasspath",
   :namespace "clojure.java.classpath",
   :line 25,
   :var-type "protocol",
   :doc nil,
   :name "URLClasspath"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/urls",
   :namespace "clojure.java.classpath",
   :var-type "function",
   :arglists ([loader]),
   :doc
   "Returns a sequence of java.net.URL objects representing locations\nwhich this classloader will search for classes and resources.",
   :name "urls"})}
