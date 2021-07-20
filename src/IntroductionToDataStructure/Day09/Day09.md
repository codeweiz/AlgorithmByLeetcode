### 第九天 栈/队列
- [20.有效的括号](https://leetcode-cn.com/problems/valid-parentheses/) </br>
  给定一个只包括 '(', ')', '{', '}', '[', ']'的字符串s，判断字符串是否有效。
  有效字符串满足：
  - 1.左括号必须用相同类型的右括号闭合。
  - 2.左括号必须以正确的顺序闭合。


- [232.用栈实现队列](https://leetcode-cn.com/problems/implement-queue-using-stacks/) </br>
  请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：</br>
  实现 MyQueue 类：
    - void push(int x) 将元素 x 推到队列的末尾
    - int pop() 从队列的开头移除并返回元素
    - int peek() 返回队列开头的元素
    - boolean empty() 如果队列为空，返回 true；否则，返回 false </br>
  

  说明：
  - 你只能使用标准的栈操作——也就是只有 push to top，peek/pop from top，size和 is empty 操作是合法的
  - 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。


  进阶：
  - 你能否实现每个操作均摊时间复杂度为O(1)的队列？换句话说，执行n个操作的总时间复杂度是O(n)，即使其中一个操作可能花费较长时间。
  
