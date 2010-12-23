(defproject clojide "0.1.0-SNAPSHOT"
  :description "Clojide the collaborative web based clojure development environment."
  :url "http://github.com/benjaminjackman/clojide"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [compojure "0.5.3"]
                 [ring/ring-jetty-adapter "0.3.1"]
                 [hiccup "0.3.1"]]
  :dev-dependencies [[lein-run "1.0.0"]]
  :run-aliases {:server [clojide.core -main]})
