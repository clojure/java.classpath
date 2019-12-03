{:namespaces
 ({:doc "Utilities for dealing with the JVM's classpath",
   :author "Stuart Sierra",
   :name "clojure.java.classpath",
   :wiki-url "https://clojure.github.io/java.classpath/index.html",
   :source-url
   "https://github.com/clojure/java.classpath/blob/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/java.classpath/raw/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj",
   :name "classpath",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj#L71",
   :line 71,
   :var-type "function",
   :arglists ([classloader] []),
   :doc
   "Returns a sequence of File objects of the elements on the\nclasspath. Defaults to searching for instances of\njava.net.URLClassLoader in the classloader hierarchy above\nclojure.lang.RT/baseLoader or the given classloader. If no\nURLClassloader can be found, as on Java 9, falls back to the\n'java.class'path' system property.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "https://clojure.github.io/java.classpath//index.html#clojure.java.classpath/classpath"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj",
   :name "classpath-directories",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj#L89",
   :line 89,
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns a sequence of File objects for the directories on classpath.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "https://clojure.github.io/java.classpath//index.html#clojure.java.classpath/classpath-directories"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj",
   :name "classpath-jarfiles",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj#L94",
   :line 94,
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns a sequence of JarFile objects for the JAR files on classpath.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "https://clojure.github.io/java.classpath//index.html#clojure.java.classpath/classpath-jarfiles"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj",
   :name "filenames-in-jar",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj#L50",
   :line 50,
   :var-type "function",
   :arglists ([jar-file]),
   :doc
   "Returns a sequence of Strings naming the non-directory entries in\nthe JAR file.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "https://clojure.github.io/java.classpath//index.html#clojure.java.classpath/filenames-in-jar"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj",
   :name "get-urls",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj#L34",
   :line 34,
   :var-type "function",
   :arglists ([loader]),
   :doc
   "Returns a sequence of java.net.URL objects used by this\nclassloader, or nil if the classloader does not sastify the\nURLClasspath protocol.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "https://clojure.github.io/java.classpath//index.html#clojure.java.classpath/get-urls"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj",
   :name "jar-file?",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj#L42",
   :line 42,
   :var-type "function",
   :arglists ([f]),
   :doc
   "Returns true if file is a normal file with a .jar or .JAR extension.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "https://clojure.github.io/java.classpath//index.html#clojure.java.classpath/jar-file?"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj",
   :name "loader-classpath",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj#L66",
   :line 66,
   :var-type "function",
   :arglists ([loader]),
   :doc "Returns a sequence of File paths from a classloader.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "https://clojure.github.io/java.classpath//index.html#clojure.java.classpath/loader-classpath"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj",
   :name "system-classpath",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj#L58",
   :line 58,
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns a sequence of File paths from the 'java.class.path' system\nproperty.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "https://clojure.github.io/java.classpath//index.html#clojure.java.classpath/system-classpath"}
  {:raw-source-url
   "https://github.com/clojure/java.classpath/raw/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj",
   :name "URLClasspath",
   :file "src/main/clojure/clojure/java/classpath.clj",
   :source-url
   "https://github.com/clojure/java.classpath/blob/c10fc96a8ff98db4eb925a13ef0f5135ad8dacc6/src/main/clojure/clojure/java/classpath.clj#L25",
   :line 25,
   :var-type "protocol",
   :arglists nil,
   :doc nil,
   :namespace "clojure.java.classpath",
   :wiki-url
   "https://clojure.github.io/java.classpath//index.html#clojure.java.classpath/URLClasspath"}
  {:raw-source-url nil,
   :name "urls",
   :file nil,
   :source-url nil,
   :var-type "function",
   :arglists ([loader]),
   :doc
   "Returns a sequence of java.net.URL objects representing locations\nwhich this classloader will search for classes and resources.",
   :namespace "clojure.java.classpath",
   :wiki-url
   "https://clojure.github.io/java.classpath//index.html#clojure.java.classpath/urls"})}
