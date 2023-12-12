class Solution:
    def hasGroupsSizeX(self, deck: List[int]) -> bool:
        if len(deck) == 1: 
            return False

        temp = [0]*len(deck)
        for i in deck:
            temp[i] += 1
            
        import math

        g = 0 
        for j in range(0,len(temp)):
            if g == 0  and temp[j] != 0:  
                g= temp[j]
            elif temp[j] != 0: 
                g= gcd(g,temp[j])

        return g!=1
