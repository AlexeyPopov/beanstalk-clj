(defproject alexeypopov/beanstalk-clj "0.1.4"
  :description "A simple beanstalkd client library for Clojure."
  :url "http://github.com/AlexeyPopov/beanstalk-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [clj-yaml "0.4.0"]
                 [slingshot "0.12.2"]]
  :repl-options {:init-ns beanstalk-clj.core}
 )
