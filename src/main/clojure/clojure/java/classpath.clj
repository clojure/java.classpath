;;; classpath.clj: utilities for working with the Java class path

;; by Stuart Sierra, http://stuartsierra.com/
;; April 19, 2009

;; Copyright (c) Stuart Sierra, 2009. All rights reserved.  The use
;; and distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this
;; distribution.  By using this software in any fashion, you are
;; agreeing to be bound by the terms of this license.  You must not
;; remove this notice, or any other, from this software.


(ns 
  ^{:author "Stuart Sierra",
     :doc "Utilities for dealing with the JVM's classpath"}
  clojure.java.classpath
  (:import (java.io File)
           (java.util.jar JarFile)))

(defn jar-file?
  "Returns true if file is a normal file with a .jar or .JAR extension."
  [^File file]
  (and (.isFile file)
       (or (.endsWith (.getName file) ".jar")
           (.endsWith (.getName file) ".JAR"))))

(defn filenames-in-jar
  "Returns a sequence of Strings naming the non-directory entries in
  the JAR file."
  [^JarFile jar-file]
  (map #(.getName %)
       (filter #(not (.isDirectory %))
               (enumeration-seq (.entries jar-file)))))

(defn classpath
  "Returns a sequence of File objects of the elements on CLASSPATH."
  []
  (map #(File. %)
       (.split (System/getProperty "java.class.path")
               (System/getProperty "path.separator"))))

(defn classpath-directories
  "Returns a sequence of File objects for the directories on classpath."
  []
  (filter #(.isDirectory %) (classpath)))

(defn classpath-jarfiles
  "Returns a sequence of JarFile objects for the JAR files on classpath."
  []
  (map #(JarFile. %) (filter jar-file? (classpath))))