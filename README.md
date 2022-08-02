<h1 align="center">Recursion and Backtracking</h1>

## Introduction and Useful Points

-   Any function which calls itself is called recursive.
-   A recursive method (recursive function) solves a problem by calling a copy of itself. When the call ends, the copy of that returning method is removed from that memory.
-   When a recursive call happens, all the previous function calls keep waiting in the stack memory.
-   Therefore, it's important to terminate a recursive method. Else, there will be a memory overflow.
-   A recursive function calls itself with a slightly better/solved/simpler version of the problem.
-   The smaller problems should terminate or converge on the base case. At the base case, the function encounters a subtask which it can solve without calling itself.
