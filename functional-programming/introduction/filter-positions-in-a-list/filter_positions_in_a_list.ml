(**
 * https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/
 * 
 * Problem Statement
 * For a given list with N integers, return a new list removing the elements at odd
 * positions. The input and output portions will be handled automatically. You need
 * to write a function with the recommended method signature.
 * 
 * Input Format 
 * N integers contained in the list, each on a new line.
 * 
 * Output Format 
 * List of integers, with integers at odd positions removed (so the first element, the
 * third element and so on will be removed). The relative positions of the remaining
 * (even-position) elements should be the same as they were in the original array. Each
 * integer will be on a new line.
 *
 * Note
 * Indexes are zero-based. Index 0 is the first element.
 *)

(* Enter your code here. Read input from STDIN. Print output to STDOUT *)
let rec read_lines () =
  try let line = read_line () in
    int_of_string (line) :: read_lines()
  with
    End_of_file -> []

let f arr =
  let rec aux idx elem remaining sofar =
    match remaining with
    | [] -> if (idx mod 2 == 0) then sofar else (sofar@[elem])
    | y::ys -> if (idx mod 2 == 0) then aux (idx + 1) y ys sofar else aux (idx + 1) y ys (sofar@[elem]) in
  match arr with
  | [] -> []
  | y::ys -> aux 0 y ys [];;

let () =
  let arr = read_lines() in
  let ans = f arr in
  List.iter (fun x -> print_int x; print_newline ()) ans;;
