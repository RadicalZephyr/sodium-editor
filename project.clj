(defproject sodium/editor "lein-git-inject/version"
  :description "Visual editor for Sodium programs."
  :url "https://github.com/RadicalZephyr/sodium-editor"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :scm {:name "git"
        :url "https://github.com/RadicalZephyr/sodium-editor"}
  :plugins [[day8/lein-git-inject "0.0.15"]]

  :dependencies [[org.clojure/clojure "1.12.0"]
                 [cljsjs/react "18.2.0-0"]
                 [cljsjs/react-dom "18.2.0-0"]
                 [reagent "1.2.0"]
                 [re-frame "1.4.3"]
                 [re-com "2.13.2"]
                 [re-pressed "0.3.2"]
                 [garden "1.3.10"]
                 [net.dhleong/spade "1.1.0"]]
  :target-path "target/%s"
  :source-paths ["src" "test"]
  :profiles {:dev {:dependencies [[org.clojure/clojurescript "1.11.60"]
                                  [day8.re-frame/tracing "0.6.2"]
                                  [day8.re-frame/re-frame-10x "1.9.3"]
                                  [com.bhauman/figwheel-main "0.2.18"]
                                  [com.bhauman/rebel-readline-cljs "0.1.4"]
                                  [org.clojars.earthlingzephyr/devcards "0.3.0-SNAPSHOT"]
                                  [org.slf4j/slf4j-nop "1.7.30"]]
                   :resource-paths ["target"]
                   :clean-targets ^{:protect false} ["target"]}}
  :release-tasks [["vcs" "assert-committed"]
                  ["deploy"]]
  :aliases {"fig" ["trampoline" "run" "-m" "figwheel.main"]})
