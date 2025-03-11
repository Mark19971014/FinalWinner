class ListNode(object):
    def __init__(self,val = 0,next = None):
        self.val = val
        self.next = next

class E03(object):
    def reverseList(self,head):
        prev = null
        cur = head 
        while cur:
            next = cur.next
            cur.next = prev
            prev = cur
            cur = next
        
        return prev
        