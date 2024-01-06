class MyHashMap:

    def __init__(self):
        arrSize = 10**6 + 1 
        self.hashMap = [-1]* arrSize

    def put(self, key: int, value: int) -> None:
        self.hashMap[key] = value

    def get(self, key: int) -> int:
        return self.hashMap[key]

    def remove(self, key: int) -> None:
        # p object will be instantiated and called as such:
        self.hashMap[key] = -1
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)



# Your MyHashMa# obj.remove(key)
