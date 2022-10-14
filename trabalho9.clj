; Leonardo Mafra Salin

; 1. Utilizando  a  linguagem  Clojure,  crie  uma  função  chamada  ultimo  que  receba  uma  lista  e devolva o último elemento desta lista sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn ultimo [lista]
  (if (= (count lista) 1)
    (first lista)
    (ultimo (rest lista))))

; 2. Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma lista e  devolva  o  penúltimo  elemento  desta  lista  usar as  funções  já  prontas  e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn penultimo [lista]
  (if (= (count lista) 2)
    (first lista)
    (penultimo (rest lista))))

; 3. Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba uma lista e um inteiro N e devolva o  elemento que  está na  posição N desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure

(defn elementoN [lista n]
  (if (= n 0)
    (first lista)
    (elementoN (rest lista) (- n 1))))

; 4. Utilizando  a  linguagem Clojure,  crie  uma função  chamada  inverso  que  receba uma  lista  e devolva esta lista com as posições dos elementos invertidas. Por exemplo recebe [1,2,3] e devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn inverso [lista]
  (if (= (count lista) 0)
    []
    (conj (inverso (rest lista)) (first lista))))

; 5. Utilizando a  linguagem Clojure, crie uma função chamada  mdc que receba  dois inteiros e devolve o mínimo divisor comum entre eles.  Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn resto [x y]
  (if (>= x y)
    (resto (- x y) y)
    x))

(defn mdc [x y]
  (if (= y 0)
    x
    (mdc y (resto x y))))

; Testes

(println "\nTrabalho 9 - Introdução Clojure")
(println "Escrito por Leonardo Mafra Salin")

(println "\nExercício 1")
(println "Último da lista [5 4 3 2 1]: " (ultimo '(5 4 3 2 1)))

(println "\nExercício 2")
(println "Penúltimo da lista [5 4 3 2 1]: " (penultimo '(5 4 3 2 1)))

(println "\nExercício 3")
(println "Posição N=2 da lista [5 4 3 2 1]: " (elementoN '(5 4 3 2 1) 2))

(println "\nExercício 4")
(println "Inverso da lista [5 4 3 2 1]: " (inverso '(5 4 3 2 1)))

(println "\nExercício 5")
(println "MDC entre 20 e 24:" (mdc 20 24))