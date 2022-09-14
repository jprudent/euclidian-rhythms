(ns euclidean-rhythms.core-test
  (:require [clojure.test :refer :all]
            [euclidean-rhythms.core :as sut]))

(deftest euclidean-rhythm-test
  (are [measure-length nb-beats pattern]
    (= pattern (sut/euclidean-rhythm measure-length nb-beats))
    4 0 '(. . . .)
    4 4 '(x x x x)
    4 5 '(x x x x)
    4 1 '(x . . .)
    0 3 '()))
