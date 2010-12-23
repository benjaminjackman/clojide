(ns main-tmpl (:use hiccup.core))

(def editor
  (html 
    [:html 
      [:head
        [:title "Clojide"]]
      [:body 
        [:h2#title "Clojide"]
;        [:iframe#editor {:width 600, :height 400} []]
        [:textarea#repl {:cols 80, :rows 30}]
        [:textarea#repl {:cols 80, :rows 15}]]]))
