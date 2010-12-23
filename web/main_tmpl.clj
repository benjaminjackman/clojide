(ns main-tmpl (:use hiccup.core))

(def editor
  (html 
    [:html 
      [:body 
        [:h1 "Whatever"]
        [:p ]
        [:textarea {:cols 80, :rows 30}]
        [:textarea {:cols 120, :rows 15}]]]))
