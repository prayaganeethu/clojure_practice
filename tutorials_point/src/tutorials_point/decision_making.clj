(ns tutorials-point.decision-making
	(:gen-class))

(defn if-dm []
	(if (< 1 2)
		(println "1 < 2")
		(println "Blah!! 1 > 2?!")))

(defn if-do-dm []
	(if (< 1 2)
		(do (println "1 < 2")
			(println "True"))
		(do (println "1 > 2?!")
			(println "Something's wrong here"))))

(defn if-and-dm []
	(if (and (= 1 1) (= 2 2))
		(println "Equal")
		(println "Not equal")))

(defn case-dm [x]
	(case x 
		5 (println "It is Five")
		10 (println "It is Ten")
		(println "I just know it is neither 5 nor 10!")))

(defn cond-dm [x]
	(cond 
		(= x 5) (println "It is Five")
		(= x 10) (println "It is Ten")
		:else (println "It is neither Five nor Ten!!")))

