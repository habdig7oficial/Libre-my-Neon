(ns libre-my-neon.routes.home
  (:require
   [libre-my-neon.layout :as layout]
   [clojure.java.io :as io]
   [libre-my-neon.middleware :as middleware]
   [ring.util.response]
   [ring.util.http-response :as response]))

(defn index-page [request]
  (layout/render request "index.html" )
)

(defn about-page [request]
  (layout/render request "about.html"))

(defn home-routes []
  [ "" 
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats]}
   ["/" {:get index-page}]
   ["/about" {:get about-page}]])

