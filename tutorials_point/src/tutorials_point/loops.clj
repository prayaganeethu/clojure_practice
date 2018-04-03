(ns tutorials-point.loops
	(:gen-class))

(defn while-loop []
	(def x (atom 1))
	; (println x)
   (while ( < @x 5 )
      (do
         (println @x)
         (swap! x inc))))

(defn doseq-loop []
	(doseq [n [0 1 2]]
		(println n)))

(defn dotimes-loop []
	(dotimes [n 5]
		(println n)))

(defn loop-loop []
	(loop [x 5]
		(when (< x 10)
			(println x)
			(recur (+ x 1)))))