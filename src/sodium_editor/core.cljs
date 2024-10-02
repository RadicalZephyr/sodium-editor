(ns ^:figwheel-hooks sodium-editor.core
  (:require
   [goog.dom :as gdom]
   [reagent.dom :as rdom]
   [re-frame.core :as re-frame]
   [re-pressed.core :as rp]
   [sodium-editor.events :as events]
   [sodium-editor.views :as views]
   ))

(defn get-app-element []
  (gdom/getElement "app"))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (when-let [root-el (get-app-element)]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [views/main-panel] root-el)))

;; specify reload hook with ^:after-load metadata
(defn ^:after-load on-reload []
  (mount-root))

(defn init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (re-frame/dispatch-sync [::rp/add-keyboard-event-listener "keydown"])
  (mount-root))
