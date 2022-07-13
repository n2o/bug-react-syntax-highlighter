(ns playground.core
  (:require ["react-syntax-highlighter" :refer [Prism]]
            ["react-syntax-highlighter/dist/esm/styles/prism" :refer [github]]
            [goog.dom :as gdom]
            [reagent.dom]))

(defn- main []
  [:main.container.mx-auto.pt-5
   [:h1 "Welcome to your app"]
   [:> Prism {:language "clojure" :style github}
    "(welcome! :you)"]])

;; -----------------------------------------------------------------------------

(defn- render []
  (reagent.dom/render [main] (gdom/getElement "app")))

(defn init
  []
  (render))

(defn- ^:dev/after-load re-render
  "The `:dev/after-load` metadata causes this function to be called after
  shadow-cljs hot-reloads code. This function is called implicitly by its
  annotation."
  []
  (init))
