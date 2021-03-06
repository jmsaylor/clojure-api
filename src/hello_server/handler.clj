(ns hello-server.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.middleware.json :as middleware]))

(defroutes app-routes
  (GET "/" [] {:body {:foo 'bar}})
  (POST "/" {body :body} {:body body})
  (route/not-found "Not Found"))

(def app
  ( -> (handler/api app-routes)
   (middleware/wrap-json-body)
   (middleware/wrap-json-response)))
