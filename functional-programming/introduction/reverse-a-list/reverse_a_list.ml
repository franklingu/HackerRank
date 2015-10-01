(**
 * https://www.hackerrank.com/challenges/fp-reverse-a-list
 * 
 * Problem Statement
 * Reverse a list without using reverse function. The input and output portions
 * will be handled automatically. You need to write a function with the recommended
 * method signature.
 * 
 * Input and Output Format 
 * Each element of the list is displayed on a new line. 
 * The output list is the reverse of the input list.
 *)

let rec read_lines () =
  try let line = read_line () in
    int_of_string (line) :: read_lines()
  with
    End_of_file -> [];;

let f arr =
  List.fold_left (fun a b -> b::a) [] arr;;

let () =
  let arr = read_lines() in
  let ans = f arr in
  List.iter (fun x -> print_int x; print_newline ()) ans;;
