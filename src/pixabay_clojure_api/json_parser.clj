(ns pixabay-clojure-api.json-parser
  (:require [cheshire.core :refer [parse-string]])
  (:gen-class))

(defn parse [results]
  (parse-string results true))
