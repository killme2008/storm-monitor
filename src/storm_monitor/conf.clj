;;Monitor settings
(ns storm-monitor.conf
  (:import (org.yaml.snakeyaml Yaml)
           (java.util Map List)
           (java.io InputStreamReader FileInputStream))
  (:use [clojure.walk :only [prewalk]]))

(def FILENAME "monitor.yaml")

(defn resource [path]
  (.getResourceAsStream (clojure.lang.RT/baseLoader) path))

(defn clojurify-structure [s]
  (prewalk (fn [x]
             (cond (instance? Map x) (into {} x)
                   (instance? List x) (vec x)
                   true x))
           s))
;;read monitor.yaml
(defn read-config []
  (let [yaml (Yaml. )]
    (let [rt (.load yaml  (resource FILENAME))]
      (if (nil? rt)
        (hash-map)
        (clojurify-structure rt)))))
