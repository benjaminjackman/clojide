(ns clojide.core
  (:use compojure.core
        ring.adapter.jetty)
  (:require [compojure.route :as route])
  (:use hiccup.core))

;configuration details
(def project-dir (str (System/getProperty "user.dir") "/"))
(def web-dir (str project-dir "web/"))


(def routes-file (str web-dir "routes.clj"))
(defn load-routes [] (load-string(slurp routes-file)))
(defn request-handler [& args]
  (load-routes)
  (apply (eval 'routes/handler) args))

;maps this over to the handler file
(defn handler [request] (request-handler request))

;Start the jetty server on the port specified
(defn start-server [port]
  (run-jetty handler {:port port}))

;This is just a simple main that start the webapp
(defn -main [& [port]]
  (if port
    (start-server (Integer/parseInt port))
    (start-server 8080)))
    
;(defn load-all []
;  (load-routes))
;(defn reload [] (load-main-tmpl) (load-routes))

