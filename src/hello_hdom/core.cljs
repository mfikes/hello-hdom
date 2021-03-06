(ns ^:figwheel-hooks hello-hdom.core
  (:require
   [goog.dom :as gdom]
   [hdom :refer [setAttribs]]))

(println 'hdom/clearDOM (exists? hdom/clearDOM))
(println 'setAttribs (exists? setAttribs))
(println "This text is printed from src/hello_hdom/core.cljs. Go ahead and edit it and see reloading in action.")

(defn multiply [a b] (* a b))


;; define your app data so that it doesn't get over-written on reload
(defonce app-state (atom {:text "Hello world!"}))

(defn get-app-element []
  (gdom/getElement "app"))

(js/console.log "from the code")

;; specify reload hook with ^;after-load metadata
(defn ^:after-load on-reload [])
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)

