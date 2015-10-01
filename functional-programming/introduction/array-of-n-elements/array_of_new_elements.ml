(** 
 * https://www.hackerrank.com/challenges/fp-array-of-n-elements
 * 
 * Problem Statement
 * 
 * Create an array of N integers, where N is specified as input. This can be any array with
 * N integers. For example, for N=4 you could return [1,1,1,1] or [1,2,3,4] 
 *)

(* returns an array of n elements *)
let make_array n =
  Array.make n 0;;

let () =
  let len = read_int () in
  let arr = make_array len in
  Printf.printf "%d\n" (Array.length arr)
