# AlgorithmByLeetcode
刷leetcode算法的记录
- 在计算机科学中，数据结构是计算机中存储、组织数据的方式
- 正确的数据结构选择可以提高算法的效率。
- 在计算机程序设计的过程中，选择适当的数据结构是一项重要工作。
- 许多大型系统的编写经验显示，程序设计的困难成都与最终成果的质量与表现，取决于是否选择了最适合的数据结构


## 数据结构入门
### 第一天
#### 217.[存在重复元素](https://leetcode-cn.com/problems/contains-duplicate/)
给定一个整数数组，判断是否存在重复元素。
如果存在一值在数组中出现至少两次，函数返回true。
如果数组中每个元素都不相同，则返回false。

【解题思路】：HashMap一次循环

#### 53.[最大子序和](https://leetcode-cn.com/problems/maximum-subarray/)
给定一个整数数组nums，
找到一个具有最大和的连续子数组（子数组最少包含一个元素），
返回其最大和。

【解题思路】：动态规划

### 第二天 数组
- [1.两数之和](https://leetcode-cn.com/problems/two-sum/) </br>
  【题目描述】给定一个整数数组nums和一个整数目标值target，请你在该数组中找出和为目标值target的那两个整数，并返回它们的数组下标。
  你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
  你可以按任意顺序返回答案。
- [88.合并两个有序数组](https://leetcode-cn.com/problems/merge-sorted-array/) </br>
  【题目描述】给你两个有序整数数组nums1和nums2，请你将nums2合并到nums1中，使nums1成为一个有序数组。
  初始化nums1和nums2的元素数量分别为m和n。你可以假设nums1的空间大小等于m+n，这样它就有足够的空间保存来自nums2的元素。


### 第三天 数组
- [350.两个数组的交集 II](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/)  </br>
  给定两个数组，编写一个函数来计算它们的交集。
- [121.买卖股票的最佳时机](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/) </br>
  给定一个数组prices，它的第i个元素prices[i]表示一支给定股票第i天的价格。
  你只能选择**某一天**买入这只股票，并选择在**未来的某一个不同的日子**卖出该股票。设计一个算法来计算你所能获取的最大利润。
  返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回0。


### 第四天 数组
- [566.重塑矩阵](https://leetcode-cn.com/problems/reshape-the-matrix/) </br>
  【题目描述】在MATLAB中，有一个非常有用的函数reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
  给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
  重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
  如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
- [118.杨辉三角](https://leetcode-cn.com/problems/pascals-triangle/) </br>
  【题目描述】给定一个非负整数numRows，生成杨辉三角的前numRows行。
  在杨辉三角中，每个数是它左上方和右上方的数的和。


### 第五天 数组
- [36.有效的数独](https://leetcode-cn.com/problems/valid-sudoku/) </br>
  请你判断一个9*9的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
    - 数字1-9在每一行只能出现一次。
    - 数字1-9在每一列只能出现一次。
    - 数字1-9在每一个以粗实线分隔的3*3宫内只能出现一次。

  数独部分空格内已填入数字，空白格用'.'表示


- [73.矩阵置零](https://leetcode-cn.com/problems/set-matrix-zeroes/) </br>
  给定一个m*n的矩阵，如果一个元素为0，则将其所在行和列的所有元素都设为0。请使用原地算法。</br>
  进阶：
    - 一个直观的解决方案是使用O(mn)的额外空间，但这并不是一个好的解决方案。
    - 一个简单的改进方案是使用O(m+n)的额外空间，但这仍然不是最好的解决方案。
    - 你能想出一个仅使用常量空间的解决方案吗？


### 第六天 字符串
- [387.字符串中的第一个唯一字符](https://leetcode-cn.com/problems/first-unique-character-in-a-string/) </br>
  给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回-1。假定该字符串只包含小写字母。


- [383.赎金信](https://leetcode-cn.com/problems/ransom-note/) </br>
  给定一个赎金信(ransom)字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
  如果可以构成，返回true；否则，返回false。
  为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单次来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。


- [242.有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/) </br>
  给定两个字符串s和t，编写一个函数来判断t是否是s的字母异位词。
  若s和t中每个字符出现的次数都相同，则称s和t互为字母异位词。


### 第七天 链表
- [141.环形链表](https://leetcode-cn.com/problems/linked-list-cycle/) </br>
  给定一个链表，判断链表中是否有环。如果链表中有某个结点，可以通过连续跟踪next指针再次到达，则链表中存在环。
  为了表示给定链表中的环，我们使用整数pos来表示链表尾连接到链表中的位置（索引从0开始）。
  如果pos是-1，则在该链表中没有环。
  【注意】pos不作为参数传递，仅仅是为了标识链表的实际情况。
  如果链表中存在环，则返回false。否则，返回false。
  【进阶】你能用O(1)内存解决此问题吗？


- [21.合并两个有序链表](https://leetcode-cn.com/problems/merge-two-sorted-lists/) </br>
  将两个升序链表合并成为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有结点组成的。


- [203.移除链表元素](https://leetcode-cn.com/problems/remove-linked-list-elements/) </br>
  给你一个链表的头结点head和一个整数val，请你删除表中所有满足 Node.val == val 的结点，并返回新的头结点。


### 第八天 链表
- [206.反转链表](https://leetcode-cn.com/problems/reverse-linked-list/) </br>
  给你单链表的头结点head，请你反转链表，并返回反转后的链表。


- [83.删除排序链表中的重复元素](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/) </br>
  存在一个按升序排列的链表，给你这个链表的头结点head，请你删除所有重复的元素，
  使得元素只出现一次。返回同样按升序排列的结果链表。
  
