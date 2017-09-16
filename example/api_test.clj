(ns pixabay-clojure-api.example.api-test
  (:require [pixabay-clojure-api.api :as pixabay])
  (:gen-class))

;; Get Images
(pixabay/get-images {:key "your-api-key" :q "nature mountains"})

;; Get Videos
(pixabay/get-videos {:key "your-api-key" :q "nature"})
