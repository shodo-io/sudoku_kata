# Sudoku kata

This project is a kata and the objective is to create a Sudoku resolver

**The objectives are :**

* **TDD**
* **Clean code**
* **Stateless Code** 
* **Produce well-crafted code that express the domain**

The application 
===========================

Sudoku is a number puzzle that is popular in some of the world's
press. The rules of the game are simple: You simply fill in all the
squares in the grid so that each row, column and each of the 3x3
squares contains all the digits from 1 to 9 without repeats or
omissions.

Given a board:

 <table>
   <tr>
     <th>
         0 0 6<br/>
         0 0 0<br/>
         0 0 0<br/>
     </th>
     <th>
         2 9 0<br/>
         0 8 6<br/>
         0 7 0<br/>
     </th>
     <th>
         3 4 0<br/>
         0 9 2<br/>
         0 0 1<br/>
     </th>
   </tr>
   <tr>
     <td>
         1 0 0<br/>
         0 0 8<br/>
         0 9 0<br/>
     </td>
     <td>
         0 0 8<br/>
         0 2 0<br/>
         1 0 0<br/>
     </td>
     <td>
         0 7 0<br/>
         1 0 0<br/>
         0 0 8<br/>
     </td>
   </tr>
   <tr>
     <td>
         7 0 0<br/>
         5 1 0<br/>
         0 6 4<br/>
     </td>
     <td>
         0 3 0<br/>
         8 4 0<br/>
         0 0 0<br/>
     <td>
         0 0 0<br/>
         0 0 0<br/>
         0 0 0<br/>
     </td>
   </tr>
 </table>

This input is present in a file and must be injected in your code. 


Giving a result of:

 <table>
   <tr>
     <th>
         8 5 6<br/>
         3 7 1<br/>
         2 4 9<br/>
     </th>
     <th>
         2 9 1<br/>
         4 8 6<br/>
         5 7 3<br/>
     </th>
     <th>
         3 4 7<br/>
         5 9 2<br/>
         6 8 1<br/>
     </th>
   </tr>
   <tr>
     <td>
         1 2 5<br/>
         4 3 8<br/>
         6 9 7<br/>
     </td>
     <td>
         3 6 8<br/>
         9 2 7<br/>
         1 5 4<br/>
     </td>
     <td>
         4 7 9<br/>
         1 6 5<br/>
         2 3 8<br/>
     </td>
   </tr>
   <tr>
     <td>
         7 8 2<br/>
         5 1 3<br/>
         9 6 4<br/>
     </td>
     <td>
         6 3 5<br/>
         8 4 9<br/>
         7 1 2<br/>
     <td>
         9 1 4<br/>
         7 2 6<br/>
         8 5 3<br/>
     </td>
   </tr>
 </table>

Create a tested application (TDD) to obtain this result. 


