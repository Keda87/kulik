class Node(object):

    def __init__(self, data=None):
        self.left = None
        self.right = None
        self.data = data


class BinaryTreeDemo(object):

    def __init__(self, node=None):
        self.root = node

    def inorder_tree_walk(self, node=None):
        if node is not None:
            self.inorder_tree_walk(node.left)
            print node.data,
            self.inorder_tree_walk(node.right)

    def search(self, current_node=None, data=None):
        if current_node is None:
            current_node = self.root
        while current_node is not None and current_node.data != data:
            if data < current_node.data:
                current_node = current_node.left
            else:
                current_node = current_node.right
        return current_node

    def min(self):
        node = self.root
        while node.left is not None:
            node = node.left
        return node

    def max(self):
        node = self.root
        while node.right is not None:
            node = node.right
        return node


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

    bin_tree = BinaryTreeDemo(bt)
    bin_tree.inorder_tree_walk(bin_tree.root)
    print
    print bin_tree.search(data=7)
    print 'Max: {}'.format(bin_tree.max().data)
    print 'Min: {}'.format(bin_tree.min().data)
