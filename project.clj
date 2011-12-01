(defproject storm-monitor "1.0.0-SNAPSHOT"
  :description "Storm monitor"
  :extra-classpath-dirs ["conf"]
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [storm/storm "0.5.4"]
                 [org.yaml/snakeyaml "1.9"]
                 [tron   "0.5.2"]])
