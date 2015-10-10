(ns leiningen.new.kata
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "kata"))

(defn kata
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data
	     [".gitignore" (render "gitignore")]
             ["README.md" (render "README.md")]
             ["project.clj" (render "project.clj" data)]
             ["test/{{sanitized}}/core_test.clj" (render "core_test.clj" data)]
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
)))
