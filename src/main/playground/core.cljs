(ns playground.core
  (:require ["react-syntax-highlighter" :rename {PrismLight SyntaxHighlighter}]
            ["react-syntax-highlighter/dist/esm/languages/prism/clojure$default" :as clojure-prism]
            ["react-syntax-highlighter/dist/esm/styles/prism/one-light$default" :as light-theme]
            [goog.dom :as gdom]
            [reagent.dom]))

;; Register your languages here
(.registerLanguage SyntaxHighlighter "clojure" clojure-prism)

(defn- main []
  [:main.container.mx-auto.pt-5
   [:h1 "Welcome to your app"]
   [:> SyntaxHighlighter {:language "clojure" :style light-theme}
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
