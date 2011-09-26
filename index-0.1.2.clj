{:namespaces
 ({:source-url
   "https://github.com/clojure/java.classpath/blob/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj",
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
   "https://github.com/clojure/java.classpath/blob/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj#L57",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/classpath",
   :doc
   "Returns a sequence of File objects of the elements on the classpath.",
   :var-type "function",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/java.classpath/src/src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([]),
   :name "classpath-directories",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj#L68",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/classpath-directories",
   :doc
   "Returns a sequence of File objects for the directories on classpath.",
   :var-type "function",
   :line 68,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/java.classpath/src/src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([]),
   :name "classpath-jarfiles",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj#L73",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/classpath-jarfiles",
   :doc
   "Returns a sequence of JarFile objects for the JAR files on classpath.",
   :var-type "function",
   :line 73,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/java.classpath/src/src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([jar-file]),
   :name "filenames-in-jar",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj#L33",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/filenames-in-jar",
   :doc
   "Returns a sequence of Strings naming the non-directory entries in\nthe JAR file.",
   :var-type "function",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/java.classpath/src/src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([f]),
   :name "jar-file?",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj#L25",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/jar-file?",
   :doc
   "Returns true if file is a normal file with a .jar or .JAR extension.",
   :var-type "function",
   :line 25,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/java.classpath/src/src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([loader]),
   :name "loader-classpath",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj#L49",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/loader-classpath",
   :doc "Returns a sequence of File paths from a classloader.",
   :var-type "function",
   :line 49,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/java.classpath/src/src/main/clojure/clojure/java/classpath.clj"}
  {:arglists ([]),
   :name "system-classpath",
   :namespace "clojure.java.classpath",
   :source-url
   "https://github.com/clojure/java.classpath/blob/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj#L41",
   :raw-source-url
   "https://github.com/clojure/java.classpath/raw/f1b9bfc800773a18e28082694f541e65af4f218d/src/main/clojure/clojure/java/classpath.clj",
   :wiki-url
   "http://clojure.github.com/java.classpath//clojure.java.classpath-api.html#clojure.java.classpath/system-classpath",
   :doc
   "Returns a sequence of File paths from the 'java.class.path' system\nproperty.",
   :var-type "function",
   :line 41,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/java.classpath/src/src/main/clojure/clojure/java/classpath.clj"})}
