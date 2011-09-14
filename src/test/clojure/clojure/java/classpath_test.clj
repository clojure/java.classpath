(ns clojure.java.classpath-test
  (:require
   [clojure.java.classpath :as classpath]
   [clojure.test :as test]))

(test/deftest classpath-test
  (test/is (every? #(instance? java.io.File %) (classpath/classpath))
   "returns File objects")
  (test/is (seq (classpath/classpath))
   "returns a non empty sequence"))
