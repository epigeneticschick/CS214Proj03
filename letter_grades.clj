;;; letter_grades.clj is a driver for function  lettergrades
;;;;
;;;; Input: Percent Grade
;;;;                                  j
;;;; Output: Letter Grade
;;;;
;;;; Usage: clojure -m letter_grades
;;;; Lorrayya willimas
;;;; Date:February 15, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns letter_grades)                    ; name the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; yearCode() returns the code for a given academic year.
;;; Receive: year, a string.
;;; Precondition: year is one of
;;;   {freshman, sophomore, junior or senior}.
;;; Return: the integer code corresponding to year.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn lettergrades [average]
      (cond 
      (>= average 90) 'A'
      (>= average 80) 'B'
      (>= average 70) 'C'
      (>= average 60) 'D'
      :else 'F'))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Function -main() test-drives our yearCode() function.
;;; Input: year: one of {freshman, sophomore, junior, or senior}.
;;; Output: the code corresponding to year.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn -main []
 (print "\nEnter your percent grade: ") (flush)

 (let
    [ average (read) ]                ; read year (a string)
    (println (lettergrades average) "\n")      ; display its code
 )
)
