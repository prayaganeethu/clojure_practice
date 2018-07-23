(ns tutorials-point.fileIO)

(require '[clojure.java.io :as io])

(defn readfile []
	(slurp "/Users/neethumohandas/Learn/clojure/tutorials_point/src/tutorials_point/hello.clj"))

(defn readline []
	(with-open [rdr (io/reader "/Users/neethumohandas/Learn/clojure/tutorials_point/src/tutorials_point/hello.clj")]
	(reduce conj [] (line-seq rdr))))

(defn writetofile []
	(spit "/Users/neethumohandas/Learn/clojure/tutorials_point/src/tutorials_point/test" "Sample string"))

(defn filexist []
	(.exists (io/file "/Users/neethumohandas/Learn/clojure/tutorials_point/src/tutorials_point/test")))

(defn readconsole []
	(println "Enter Something>")
	(def strg (read-line))
	(println (str "You typed> " strg)))