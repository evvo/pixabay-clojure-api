(ns pixabay-clojure-api.api
  (:require [pixabay-clojure-api.core :as api-core]
            [pixabay-clojure-api.json-parser :as parser :refer [parse]])
  (:gen-class))

(defn get-resource [resource-type request-params]
  (parser/parse
    (api-core/get-results
      (api-core/get-resource-url resource-type)
      request-params)))

(defn get-images [request-params]
  (get-resource "images" request-params))

(defn get-videos [request-params]
  (get-resource "videos" request-params))
