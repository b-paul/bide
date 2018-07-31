(require
  '[cljs.repl :as repl]
  '[cljs.repl.browser :as browser])

(cljs.repl/repl
 (browser/repl-env)
 :output-dir "out"
 :cache-analysis true)
