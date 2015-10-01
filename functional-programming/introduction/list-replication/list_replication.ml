(**
 * https://www.hackerrank.com/challenges/fp-list-replication
 *
 * Problem Statement
 * Given a list repeat each element of the list n times. The input and output portions will
 * be handled automatically by the grader. You need to write a function with the recommended
 * method signature.
 * 
 * Input Format 
 * First line has integer S where S is the number of times you need to repeat elements. After
 * this there are X lines, each containing an integer. These are the X elements of the array.
 * 
 * Output Format 
 * Repeat each element of the original list S times. So you have to return list/vector/array
 * of S*X integers. The relative positions of the values should be same as the original list
 * provided as input.
 *)

let rec read_lines () =
  try let line = read_line () in
    int_of_string (line) :: read_lines()
  with
    End_of_file -> [];;

let f n arr =
  let rec aux a n ls =
    if (n <= 0) then ls
    else aux a (n - 1) (a::ls) in
  let rec aux1 remaining sofar =
    match remaining with
    | [] -> sofar
    | y::ys -> aux1 ys (sofar@(aux y n [])) in
  aux1 arr [];;

let () =
  let n::arr = read_lines() in
  let ans = f n arr in
  List.iter (fun x -> print_int x; print_newline ()) ans;;

