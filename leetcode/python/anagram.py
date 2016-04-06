'''
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.
'''

# solution 1 - 928 ms

class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        
        if len(s) != len(t):
            return False
        
        for letter in s:
            if letter not in t:
                return False
            else:
                t = t.replace(letter, "", 1)
        return True


# solution 2 - 104 ms

class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        
        if ''.join(sorted(s)) == ''.join(sorted(t)): 
            return True
        else:
            return False
