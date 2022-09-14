# Euclidian Rhythms

A micro Clojure library to generate euclidean rhythms.

It implements the paper _The Euclidean Algorithm Generates Traditional Musical Rhythms_ by _Godfried Toussaint_.
The paper can be read [here](https://web.archive.org/web/20210419033814/http://cgm.cs.mcgill.ca/~godfried/publications/banff.pdf)

## Usage

You can: 
- copy/paste the code in your project (it makes sense for this micro lib)
- depends upon it `{:deps {io.github.jprudent/euclidian-rhythms {:git/tag "laika"}}}`

```
(euclidean-rhythm 16 5)
=> (x . . x . . x . . x . . x . . .)
```

## Tests 

```
clojure -Mkaocha
```

## License

Do what you want.
