(**
 * https://www.hackerrank.com/challenges/fp-update-list
 *
 * Problem Statement
 * Update the values of a list with their absolute values. The input and output portions
 * will be handled automatically during grading. You only need to write a function with
 * the recommended method signature.
 *
 * Input Format 
 * There are N integers, each on a new line. These are the N elements of the input array.
 * 
 * Output Format 
 * N integers each on a new line; these are the absolute values of the input list, in that order. 
 *)

let f arr =
  List.map (fun x -> if (x < 0) then (0 - x) else x) arr;;

let rec read_lines () = 
  try let line = read_line () in
    line :: read_lines()
  with
    End_of_file -> [];;

let () =
  let inp = read_lines () in
  let arr = List.map int_of_string inp in
  let result = f arr in
  let output = List.map string_of_int result in
  print_string (String.concat "\n" output);;
