(**
 * https://www.hackerrank.com/challenges/fp-sum-of-odd-elements
 * 
 * Problem Statement
 * Return sum of odd elements from an list. The input and output portions will be handled
 * automatically. You need to write a function with the recommended method signature.
 * 
 * Constraints 
 * The list will have 1-100 elements. Each element will be an integer X such that -100<=X<=100. 
 *)

let rec read_lines () =
  try let line = read_line () in
    int_of_string (line) :: read_lines()
  with
    End_of_file -> [];;

let f arr =
  let sum = List.fold_left (fun a b -> if (b mod 2 == 1 || b mod 2 == -1) then a + b else a) 0 arr in
  [sum];;

let () =
  let arr = read_lines() in
  let ans = f arr in
  List.iter (fun x -> print_int x; print_newline ()) ans;;
