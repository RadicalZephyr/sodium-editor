(ns sodium-editor.devcards.core
  (:require [devcards.core :as dc]
            [reagent.core :as reagent]
            [spade.core   :refer [defglobal defclass defattrs]]
            [garden.units :refer [deg px]]
            [garden.color :refer [rgba]])
  (:require-macros
   [devcards.core :as dc :refer [defcard defcard-rg]]))

(defcard
  "# Sodium Editor

   The Sodium editor is a visual editor for both viewing and editing
   Sodium programs as visual graphs. This is the most natural form to
   view Sodium programs in, as cycles can be easily seen at a glance
   simply by following arrows. This editor is
   capable (*aspirationally) of producing the boilerplate code for
   creating the Sodium components for a system and wiring it up
   according to the graph defined in this editor.")

(defattrs box-attrs []
  {:background "#999"
   :border "medium solid #111"
   :border-radius "5px"})

(defcard-rg reagent-test
  (reagent/as-element
   [:div (box-attrs)
    [:div.box [:h1 "Hello Heading"]]]))
