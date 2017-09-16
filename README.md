# pixabay-clojure-api

A Clojure library that allows you to communicate with Pixabay's API.

## Installation

Install the latest version as a dependency in your project

[![Clojars Project](https://clojars.org/pixabay-clojure-api/latest-version.svg)](https://clojars.org/pixabay-clojure-api)

## Usage

```clojure
(ns my-app.core
  (:require [pixabay-clojure-api.api :as pixabay]))
```

```clojure
;; Get Images
(pixabay/get-images {:key "your-api-key" :q "nature"})
```

```clojure
;; Get Videos
(pixabay/get-videos {:key "your-api-key" :q "phones"})
```

## License

Copyright © 2017 Evtimiy Mihaylov (evo@vaupe.com)

Distributed under the Eclipse Public License, the same as Clojure.
