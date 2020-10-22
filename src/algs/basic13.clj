(ns algs.basic13)

(defn print1To255
  []
  (map #(println %) (range 1 255)))

; (print1To255)

(defn printIntsAndSum0To255
  []
  (loop [i 0
         sum 0]
    (when (>= 255 i)
      (println sum)
      (recur (inc i) (+ sum i)))))

; (printIntsAndSum0To255)

(defn printMaxOfVector
  [v]
  (apply max v))

; (printMaxOfVector [1 2 3])

(defn printMinOfVector
  [v]
  (apply min v))

; (printMinOfVector [1 2 3])

(defn printMaxOfVectorExplicit
  [v]
  (loop [i 0
         max (first v)]
    (if (= (- (count v) 1) i)
      max
      (when (> (count v) i)
        (if (> (nth v i) max)
          (def newMax (nth v i))
          (def newMax max))
        (recur (inc i) newMax)))))

; (printMaxOfVectorExplicit [4 1 2 3])

(defn returnOddsVector1To255
  []
  (into [] (filter odd? (range 256))))

; (returnOddsVector1To255)

(defn returnVectorCountGreaterThanY
  [v y]
  (count (filter #(> % y) v)))

; (returnVectorCountGreaterThanY [1 2 3] 1)


(defn printAverageOfVector
  [v]
  (/ (reduce + v) (count v)))

; (printAverageOfVector [1 2 3])

(defn printMaxMinAverageVectorVals
  [v]
  (println (str "max:" (printMaxOfVector v)))
  (println (str "min:" (printMinOfVector v)))
  (println (str "avg:" (printAverageOfVector v))))

; (printMaxMinAverageVectorVals [1 2 3])

(defn swapStringForVectorNegativeVals
  [v]
  (map #(if (< % 0)
          (conj (str %))
          (conj %))
       v))

; (swapStringForVectorNegativeVals [-1 2 -3])

(defn printOdds1To255
  []
  (filter odd? (range 256)))

; (printOdds1To255)

(defn printVectorVals
  [v]
  (map #(println %) v))

; (printVectorVals [1 2 3])

(defn squareVectorVals
  [v]
  (map #(* % %) v))

; (squareVectorVals [1 2 3])

(defn zeroOutVectorNegativeVals
  [v]
  (map #(if (< % 0)
          (conj 0)
          (conj %))
       v))

; (zeroOutVectorNegativeVals [-1 2 -3])

(defn shiftVectorValsLeft
  [v]
  (conj (into [] (rest v)) 0))

; (shiftVectorValsLeft [1 2 3])
