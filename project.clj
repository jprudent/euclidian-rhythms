(defproject euclidean-rhythms "1-SNAPSHOT"
  :description "A micro Clojure library to generate euclidean rhythms"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :profiles {:dev {:dependencies [[org.clojure/test.check "1.1.0"]]}}
  :repl-options {:init-ns euclidean-rhythms.core})
