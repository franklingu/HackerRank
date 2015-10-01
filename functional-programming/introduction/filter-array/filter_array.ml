(**
 * https://www.hackerrank.com/challenges/fp-filter-array
 *
 * Problem Statement
 * Filter a given array of integers and leave only that values which are less than
 * a specified value X. The integers in the output should be in the same sequence as
 * they were in the input. You need to write a function with the recommended method
 * signature for the languages mentioned below. For rest of language you have to write
 * complete code.
 * 
 * Input Format 
 * The first line contains the delimiter X. This is followed by a list of integers,
 * which represents the elements of list/array. You have to read input to the End-Of-File.
 * 
 * Output Format 
 * Print integers in separate line from the array which are less than an upper-limit X in
 * value. The sequence should be same as it was in the original array. 
 *
 * Note 
 * You have to write your own implementation of filter function. It is recommended to not use
 * inbuilt library function.
 *)


let rec read_lines () =
  try let line = read_line () in
    int_of_string (line) :: read_lines()
  with
    End_of_file -> []

let f n arr =
  List.fold_left (fun a b -> if (b < n) then a@[b] else a) [] arr;;

let () =
  let n::arr = read_lines() in
  let ans = f n arr in
  List.iter (fun x -> print_int x; print_newline ()) ans;;
