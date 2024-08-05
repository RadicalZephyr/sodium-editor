(defproject sodium/editor "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :aliases {"fig" ["trampoline" "run" "-m" "figwheel.main"]}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot sodium-editor.core
  :target-path "target/%s"
  :source-paths ["src" "test"]
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}
             :dev {:dependencies [[org.clojure/clojurescript "1.11.132"]
                                  [com.bhauman/figwheel-main "0.2.18"]
                                  [com.bhauman/rebel-readline-cljs "0.1.4"]
                                  [org.slf4j/slf4j-nop "1.7.30"]]
                   :resource-paths ["target"]
                   :clean-targets ^{:protect false} ["target"]}})
