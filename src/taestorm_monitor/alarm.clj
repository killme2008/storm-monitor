;;
;;Storm monitor alarm
;;
(ns taestorm-monitor.alarm
  (:import (org.yaml.snakeyaml Yaml)
           (java.io InputStreamReader FileInputStream)))
(def MOBS "mobiles")
;;Send alert to user,you can modify it to fit your application
;;Now it just write alert to log
(defn alarm [config msg]
  (let [mobiles (config MOBS)]
    (dorun
     (map  #(println "Send alert to "  % " with message:"  msg) mobiles))))




