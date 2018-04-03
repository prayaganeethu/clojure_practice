(ns tutorials-point.functions
	(:gen-class))

(defn anonymous-fn []
	((fn [x] (* x 2)) 2))

(defn variadic-fn [arg1 & others]
	(println (str arg1 (clojure.string/join " " others))))

(defn higher-order-fn []
	(filter even? (range 0 10)))
