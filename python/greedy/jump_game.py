class Solution:
    # @param A, a list of integers
    # @return a boolean
    def canJump(self, A):
        max_can_jump = 0
        for i, a in enumerate(A):
            if(max_can_jump < i):
                return False
            # update max_can_jump
            max_can_jump = max(max_can_jump, i + a)
        return True
