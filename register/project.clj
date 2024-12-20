(defproject register "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.datomic/peer "1.0.7260"]
                 [io.pedestal/pedestal.service "0.7.1"]
                 [io.pedestal/pedestal.route "0.7.1"]
                 [io.pedestal/pedestal.jetty "0.7.1"]
                 [org.slf4j/slf4j-simple "1.7.28"]
                 [org.clojure/data.json "2.5.0"]
                 [clj-http "3.12.3"]]
  :repl-options {:init-ns register.core})
