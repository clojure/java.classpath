{:namespaces
 ({:doc "Utilities for dealing with the JVM's classpath",
   :author "Stuart Sierra",
   :name "clojure.java.classpath",
   :wiki-url
   "http://clojure.github.com/java.classpath/clojure.java.classpath-api.html",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :name "classpath",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L71",
   :line 71,
   :var-type "function",
   :arglists ([classloader] []),
   :doc
   "Returns a sequence of File objects of the elements on the classpath.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/classpath"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :name "classpath-directories",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L82",
   :line 82,
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns a sequence of File objects for the directories on classpath.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/classpath-directories"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :name "classpath-jarfiles",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L87",
   :line 87,
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns a sequence of JarFile objects for the JAR files on classpath.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/classpath-jarfiles"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :name "filenames-in-jar",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L50",
   :line 50,
   :var-type "function",
   :arglists ([jar-file]),
   :doc
   "Returns a sequence of Strings naming the non-directory entries in\nthe JAR file.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/filenames-in-jar"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :name "get-urls",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L34",
   :line 34,
   :var-type "function",
   :arglists ([loader]),
   :doc
   "Returns a sequence of java.net.URL objects used by this\nclassloader, or nil if the classloader does not sastify the\nURLClasspath protocol.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/get-urls"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :name "jar-file?",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L42",
   :line 42,
   :var-type "function",
   :arglists ([f]),
   :doc
   "Returns true if file is a normal file with a .jar or .JAR extension.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/jar-file?"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :name "loader-classpath",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L66",
   :line 66,
   :var-type "function",
   :arglists ([loader]),
   :doc "Returns a sequence of File paths from a classloader.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/loader-classpath"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :name "system-classpath",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L58",
   :line 58,
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns a sequence of File paths from the 'java.class.path' system\nproperty.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/system-classpath"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj",
   :name "URLClasspath",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/39854b7f9751f99b49a0644aa611d18f0c07dfe6/src/main/clojure/clojure/java/classpath.clj#L25",
   :line 25,
   :var-type "protocol",
   :arglists nil,
   :doc nil,
   :namespace "clojure.java.classpath",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/URLClasspath"}
  {:name "urls",
   :doc
   "Returns a sequence of java.net.URL objects representing locations\nwhich this classloader will search for classes and resources.",
   :var-type "function",
   :namespace "clojure.java.classpath",
   :arglists ([loader]),
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/urls",
   :source-url nil,
   :raw-source-url nil,
   :file nil})}
