(ns routes
  (:use compojure.core
        ring.adapter.jetty)
  (:require [compojure.route :as route])
  (:use hiccup.core))

(def project-dir (str (System/getProperty "user.dir") "/"))
(def web-dir (str project-dir "web/"))

(def main-tmpl-file (str web-dir "main_tmpl.clj"))
(defn load-main-tmpl [] (load-string (slurp main-tmpl-file)))
(defn editor-tmpl []
  (load-main-tmpl)
  (eval 'main-tmpl/editor))

(defroutes handler
  (GET "/" [] (editor-tmpl))
;  (GET "/reload" [] (str (reload)))
  (route/not-found "Page not found"))
