# kata/lein-template
A Leiningen template for Clojure katas.

It creates the bare minimum artifacts needed for a clojure kata.

Latest version:
[![Clojars Project](http://clojars.org/kata/lein-template/latest-version.svg)](http://clojars.org/kata/lein-template)

# How to install it
Add a plugin dependency on [kata/lein-template "0.1.0"] to your ~/.lein/profiles.clj:

```clj
{:user {:plugins [[kata/lein-template "0.1.0"]]}}
```

# How to use it
Run
```sh
lein new kata your.kata.name
```
For example:
```sh
lein new kata roman-numerals
```
will produce the following artifacts:
```
roman-numerals/
├── .gitignore
├── project.clj
├── README.md
├── src
│   └── roman_numerals
│       └── core.clj
└── test
    └── roman_numerals
        └── core_test.clj
```

The produced ```core_test.clj``` contains no tests but is ready to run by executing:

```sh
cd roman-numerals
lein test
```
It will produce the following result:
```
lein test roman-numerals.core-test

Ran 1 tests containing 0 assertions.
0 failures, 0 errors.
```
Now you are all set to start working on your kata!
