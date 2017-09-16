(ns pixabay-clojure-api.core
  (:require [clj-http.client :as client])
  (:gen-class))

(def api-url-images "https://pixabay.com/api/")
(def api-url-videos "https://pixabay.com/api/videos/")
(def default-conn-timeout 8000)

(defn resolve-resource-path [resource-path]
  (ns-resolve 'pixabay-clojure-api.core
    (symbol (str "api-url-" resource-path))))

(defn get-resource-url [resource-path]
  (var-get (resolve-resource-path resource-path)))

(defn get-conn-timeout [request-params]
  (if-let [timeout (get request-params :conn-timeout)]
    timeout
    default-conn-timeout))

(defn get-request-params [request-params]
  (dissoc request-params :conn-timeout))

(defn get-api-response [request-url request-params]
  (client/get
    request-url
    {:query-params (get-request-params request-params)
     :conn-timeout (get-conn-timeout request-params)
     :accept :json
     :content-type :json}))

(defn get-results [request-url request-params]
  (try
    (:body (get-api-response request-url request-params))
  (catch Exception e
    (str
      (if (empty? (ex-data e))
        (throw (Exception. (.getMessage e)))
        (throw (Exception. (get (ex-data e) :body))))))))
