(ns tutorials-point.hello-world
	(:gen-class))

(defn hello-world []
	(println "Hello World"))

(defn example []
	(println (str "Hello" "World"))
	(println (+ 1 2)))