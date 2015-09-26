(ns python-challenge.util)

(defn ns-clean
  "Remove all internal mappings from a given name space or the current one if no parameter given."
  ([] (ns-clean *ns*))
  ([ns] (map #(ns-unmap ns %)
             (filter (complement #{'ns-clean}) (keys (ns-interns ns)))
             )))

;(ns-clean)
(defn vec-to-str [a] (reduce #(str %1 %2) a))
(defn maketrans [origin-table trans-table] (zipmap origin-table trans-table))
(defn translate [text trans-rule]
  (let [i 0]
    (apply str (for [i text]
                 (get trans-rule i i)
                 )))
  )

