(ns euclidean-rhythms.core)


(defn- zip-mapcat-with-overflow
  [c1 c2]
  ;; implementation is highly inspired from `interleave` function
  (lazy-seq
   (let [[f1 & r1 :as s1] (seq c1)
         [f2 & r2 :as s2] (seq c2)]
     (if (and s1 s2)
       (cons (into f1 f2) (zip-mapcat-with-overflow r1 r2))
       (or s1 s2)))))

(defn- euclidean-rhythm*
  [pattern]
  (let [[beats silences] (partition-by identity pattern)]
    (if (<= (count silences) 1)
      (flatten pattern)
      (recur (zip-mapcat-with-overflow beats silences)))))

(defn euclidean-rhythm
  "returns a sequence of desired number of beats as equidistant as possible
   in the given measure length"
  [measure-length nb-beats]
  (euclidean-rhythm* (take measure-length (concat (repeat nb-beats ['x])
                                                  (repeat ['.])))))

(defn vary-pattern
  "Given a pattern, returns a variation of it"
  ([pattern] (vary-pattern pattern (rand-int (count pattern))))
  ([pattern seed]
   (->> (cycle pattern)
        (drop (mod seed (count pattern)))
        (take (count pattern)))))