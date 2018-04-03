(ns tutorials-point.hello
   (:gen-class))

(defn hello-world [username]
   (println (format "Hello, %s" username)))

(hello-world "world")