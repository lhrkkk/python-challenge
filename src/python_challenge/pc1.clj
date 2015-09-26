(ns python-challenge.pc1)
(defn maketrans [origin-table trans-table] (zipmap origin-table trans-table))
(defn translate [text trans-rule]
  (let [i 0]
    (apply str (for [i text]
                 (get trans-rule i i)
                 )))
  )


(def origin-table
  (map char (range (int \a) (inc (int \z)))))


(def trans-table (concat (drop 2 origin-table) (take 2 origin-table)))
;(map #(+ 2 %) [1 2 ])
;(def trans-table (->> origin-table
;      (map int)
;      (map #(+ 2 %))
;      (map char)
;      ))

(def trans-rule (maketrans origin-table trans-table))

(def text "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.")




(println (translate text trans-rule))

(println (translate "map" trans-rule))



