(ns dr)

(defrecord Position [line col])

#?(:cljs (.log js/console #dr/pos {:line 1 :col 5}))
