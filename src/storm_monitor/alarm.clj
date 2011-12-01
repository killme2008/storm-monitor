;;
;;Storm monitor alarm
;;
(ns storm-monitor.alarm
  (:import (org.yaml.snakeyaml Yaml)
           (java.io InputStreamReader FileInputStream)))
(def MOBS "mobiles")
;;Send alerts to users,you can modify it to fit your application,for example,send alerts to your mobile phone by gateway.
;;Now it just write alerts to log
(defn alarm [config msg]
  (let [mobiles (config MOBS)]
    (dorun
     (map  #(println "Send alert to "  % " with message:"  msg) mobiles))))




