(ns python-challenge.pc2
  (:require [python-challenge.util :only ns-clean]))

(require '[clojure.java.io :as io])


(def cumms (atom ""))

(with-open [r (io/reader "case")]
  (doseq [line (line-seq r)]
    (if-let [[s] (re-find #"([a-z])" line)]
      (swap! cumms str s)
      )))

(println @cumms)

(ns-clean)

