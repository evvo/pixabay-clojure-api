(defproject pixabay-clojure-api "0.1.0-SNAPSHOT"
  :description "Pixabay Clojure API"
  :url "https://github.com/evvo/pixabay-clojure-api"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [lein-light-nrepl "0.3.3"]
                 [clj-http "3.7.0"]
                 [cheshire "5.8.0"]]
  :repl-options {:nrepl-middleware [lighttable.nrepl.handler/lighttable-ops]})

