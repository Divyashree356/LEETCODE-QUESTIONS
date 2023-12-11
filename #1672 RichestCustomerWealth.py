class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        if len(flowerbed) ==1 and flowerbed[0] != 1:
          return True

        for i in range (0, len(flowerbed)):
          # print(i)
          if (i==0 and flowerbed[i]!=1 and flowerbed[i+1]!=1) or (i==len(flowerbed)-1 and flowerbed[i]!=1 and flowerbed[i-1]!=1):
            flowerbed[i]=1
            n-=1
          if flowerbed[i]!=1 and flowerbed[i-1]!=1 and flowerbed[i+1]!=1:
            flowerbed[i]=1
            n-=1

        if n > 0:
          return False 
        else: 
          return True 
