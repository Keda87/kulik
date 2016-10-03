class Node(object):

    def __init__(self, data=None):
        self.left = None
        self.right = None
        self.data = data

def inorder_tree_walk(x):
    if x is not None:
        inorder_tree_walk(x.left)
        print x.data,
        inorder_tree_walk(x.right)

if __name__ == '__main__':
    """
    Example:
            6
           / \
          5   7
         / \   \
        2   5   8
    """
    bt = Node(6)

    bt.left = Node(5)
    bt.left.left = Node(2)
    bt.left.right = Node(5)

    bt.right = Node(7)
    bt.right.right = Node(8)

    inorder_tree_walk(bt)
