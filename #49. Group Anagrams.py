class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
            sorted_strs = dict()
            for str in strs: 
                sorted_word = ''.join(sorted(str))
                if sorted_word not in sorted_strs:
                    sorted_strs[sorted_word] = []

                sorted_strs[sorted_word].append(str)
        
            return list(sorted_strs.values())
