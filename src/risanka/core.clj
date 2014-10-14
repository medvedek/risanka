(ns risanka.core
	(:gen-class)
	(:use [loom.graph :only [graph fly-graph neighbors]]
        	[loom.attr :only [hilite-path add-attrs-to-all]]
        	[loom.io :only [view]])
	(:require [loom.io.ubigraph :as ubi]))

;; todo

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(defn -main []
	(foo "Jello")

	(def g (graph [1 2] [2 3] {3 [4] 5 [6 7]} 7 8 9))
	(def dg (digraph g))
	(def wg (weighted-graph {:a {:b 10 :c 20} :c {:d 30} :e {:b 5 :d 5}}))
	(def wdg (weighted-digraph [:a :b 10] [:a :c 20] [:c :d 30] [:d :b 10]))
	(def rwg (gen-rand (weighted-graph) 10 20 :max-weight 100))
	(def fg (fly-graph :successors range :weight (constantly 77)))

	(view wdf)

)
