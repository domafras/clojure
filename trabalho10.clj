;; Leonardo Mafra Salin

;; 1. Na  aula  disponível  em:  https://replit.com/@frankalcantara/ClojureAula2?v=1  foram destacadas diversas funções (expressões), como funções de primeira ordem, disponíveis em Clojure.  Sua  primeira  tarefa  será  descrever  cada  uma  destas  funções  e  apresentar  dois exemplos  de  uso  de  cada  uma  delas.  Lembre-se  os  exemplos  precisam  ser  utilizados  de forma que o resutado da função possa ser visto no terminal.

;; ASSOC
;; Função: associar um valor a uma chave em um mapa.
(println "\nASSOC: " )
(println "\nExemplo 1: " (assoc {:a 1 :b 2} :c 3))
(println "Exemplo 2: " (assoc {:f 4 :v 5} :c 6))

;; DISSOC
;; Função: remove uma chave de um mapa.
(println "\nDISSOC: " )
(println "\nExemplo 1: " (dissoc {:a 1 :b 2} :a))
(println "Exemplo 2: " (dissoc {:f 3 :v 4} :v))

;; RANGE
;; Função: gera uma sequência de números inteiros.
(println "\nRANGE: " )
(println "\nExemplo 1: " (range 1))
(println "Exemplo 2: " (range 5))

;; MAP
;; Função: aplica uma função a cada elemento de uma coleção.
(println "\nMAP: " )
(println "\nExemplo 1: " (map (fn [x] (* x x)) [1 2 3 4 5]))
(println "Exemplo 2: " (map (fn [x] (* x 10)) [1 2 3 4 5]))

;; FILTER
;; Função: aplica uma função a cada elemento de uma coleção e retorna uma nova coleção com os elementos que satisfazem a função.
(println "\nFILTER: " )
(println "\nExemplo 1: " (filter (fn [x] (> x 3)) [1 2 3 4 5]))
(println "fExemplo 2: " (filter (fn [x] (even? x)) [1 2 3 4 5]))

;; ODD
;; Função: retorna true se o número for ímpar.
(println "\nODD: " )
(println "\nExemplo 1: " (odd? 1))
(println "Exemplo 2: " (odd? 2))

;; INTO
;; Função: insere os elementos de uma coleção em outra coleção.
(println "\nINTO: " )
(println "\nExemplo 1: " (into [1 2 3] [ 4 5 6 7 8 9]))
(println "Exemplo 2: " (into [11 22] [ 33 44 55 66 77 88 99]))

;; INC
;; Função: incrementa um número.
(println "\nINC: " )
(println "\nExemplo 1: " (inc 4))
(println "Exemplo 2: " (inc 9))

;; NTH
;; Função: retorna o elemento de uma coleção na posição especificada.
(println "\nNTH: " )
(println "\nExemplo 1: " (nth [1 2 3 4 5] 2))
(println "Exemplo 2: " (nth [1 2 3 4 5] 0))

;; CONJ
;; Função: adiciona um elemento a uma coleção.
(println "\nCONJ: " )
(println "\nExemplo 1: " (conj [1 2 3 4 5] 0))
(println "Exemplo 2: " (conj [1 2 3 4 5] 6))

;; SORT
;; Função: ordena uma coleção.
(println "\nSORT: " )
(println "\nExemplo 1: " (sort [1 2 3 4 6 5]))
(println "Exemplo 2: " (sort [6 5 4 3 2 1]))

;; PARTITION-BY
;; Função: divide uma coleção em subcoleções baseadas em uma função.
(println "\nPARTITION-BY: " )
(println "\nExemplo 1: " (partition-by (fn [x] (odd? x)) [1 2 3 4 5]))
(println "Exemplo 2: " (partition-by (fn [x] (> x 3)) [1 2 3 4 5]))

;; EMPTY
;; Função: retorna true se a coleção estiver vazia.
(println "\nEMPTY: " )
(println "\nExemplo 1: " (empty? []))
(println "Exemplo 2: " (empty? [0]))

;; COUNT
;; Função: retorna o número de elementos de uma coleção.
(println "\nCOUNT: " )
(println "\nExemplo 1: " (count []))
(println "Exemplo 2: " (count [1 2 3 4 5]))

;; CHAR
;; Função: retorna o caractere correspondente a um número.
(println "\nCHAR: " )
(println "\nExemplo 1: " (char 65))
(println "Exemplo 2: " (char 97))