(ns playground.core
  (:require ["react-syntax-highlighter" :rename {Light SyntaxHighlighter}]
            ["react-syntax-highlighter/dist/esm/languages/hljs/clojure$default" :as clojure-js]
            ["react-syntax-highlighter/dist/esm/styles/hljs" :refer [github]]
            [goog.dom :as gdom]
            [reagent.dom]))

(.registerLanguage SyntaxHighlighter "clojure", clojure-js)

(defn- main []
  [:main.container.mx-auto.pt-5
   [:h1 "Welcome to your app"]
   [:> SyntaxHighlighter {:language "clojure" :style github}
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
