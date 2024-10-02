(ns sodium-editor.devcards
  (:require
    [devcards.core]
    [sodium-editor.devcards.core]
    ))

(defn ^:export main []
  (devcards.core/start-devcard-ui!))
