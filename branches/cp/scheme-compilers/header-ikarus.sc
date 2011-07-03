(import
 (rnrs)
 ;;for AD fun comment these in and (rnrs) out:
 ;;(except (rnrs) real? negative? positive? zero? >= <= > < = atan cos sin expt log exp sqrt / * - +)
 ;;(church utils AD)
 
 (rnrs mutable-pairs) ;;because the header uses set-car! when note storethreading.
 (_srfi :1) ;;provides some list functions that are used.
 (_srfi :19) ;;date+time for inference timing
 (rename (church external math-env) (sample-discrete discrete-sampler)) ;;this provides the gsl sampling/scoring functions.
 (rename (only (ikarus)
               gensym ;;this is needed.
               pretty-print
               parameterize ;; interventions
               make-parameter ;; interventions
               exact->inexact) ;;this isn't really needed.
         (gensym scheme-gensym))

 (church trie)

 (church compiler)
 (rnrs eval)

 (except (_srfi :69) string-ci-hash string-hash) ;;used for CGIS, can comment out otherwise...

 )
