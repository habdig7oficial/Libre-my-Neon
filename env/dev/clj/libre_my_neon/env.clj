(ns libre-my-neon.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [libre-my-neon.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[libre-my-neon started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[libre-my-neon has shut down successfully]=-"))
   :middleware wrap-dev})
