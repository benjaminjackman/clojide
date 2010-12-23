(ns clojide.hello
    (:use compojure.core, ring.adapter.jetty)
    (:require [compojure.route :as route])
    (:use hiccup.core)
)


;(def hello
;    (html
;        [:html
;            [:body
;                [:h1 "Hello World"]
;            ]
;        ]
;    )
;)

;(defroutes main-routes
;    (GET "/" [] hello)
    ;;(GET "/" [] "<h1>Hello World</h1>")
;    (route/not-found "<h1>Page not found</h1>")
;)

;(defn start (run-jetty main-routes {:port 8080}))



(defroutes example
  (GET "/" [] "<h1>Hello World Wide Web!</h1>")
  (route/not-found "Page not found"))

(defn start-server [port]
  (run-jetty example {:port port}))

(defn -main [& [port]]
  (if port
    (start-server (Integer/parseInt port))
    (start-server 8080)))
