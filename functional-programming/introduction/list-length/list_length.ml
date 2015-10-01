(**
 * https://www.hackerrank.com/challenges/fp-list-length
 *
 * Problem Statement
 * Count the number of elements in an array without using count, size or length operators (or their equivalents). The input and output portions will be handled automatically by the grader. You only need to write a function with the recommended method signature.
 * 
 * Input Format
 * A list with Integers; each integer is on a new line.

 * Output Format
 * A single integer N which is the length of the list which was provided as input.
 *)

let rec read_lines () =
  try let line = read_line () in
    int_of_string (line) :: read_lines()
  with
    End_of_file -> [];;

let f arr =
  let len =
    let rec aux arr n =
      match arr with
      | [] -> n
      | y::ys -> aux ys (n + 1) in
    aux arr 0 in
  [len];;

let () =
  let arr = read_lines() in
  let ans = f arr in
  List.iter (fun x -> print_int x; print_newline ()) ans;;
