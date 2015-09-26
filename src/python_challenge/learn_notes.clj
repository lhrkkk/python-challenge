(ns python-challenge.learn-notes
  (:require [python-challenge.util :refer [ns-clean]]))

;http://jafingerhut.github.io/cheatsheet/grimoire/cheatsheet-tiptip-cdocs-summary.html

;; 列表分片
(def a (vec (range 1 (inc 10))))
(->> a  (drop 3) (take 3))
;=> [4 5 6 7]
(subvec a 3 (- (count a) 3))
;=> [4 5 6 7]
(ns-clean)
