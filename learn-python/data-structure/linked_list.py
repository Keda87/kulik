

class Node(object):

	def __init__(self, data=None, next=None):
		self.data = data
		self.next = next


class LinkedList(object):

	def __init__(self):
		self.head = None

	def insert(self, data):
		new_node = Node(data=data, next=self.head)
		self.head = new_node

	def delete(self, data):
		is_found = False
		current = self.head
		previous = None

		while not is_found and current is not None:
			if current.data == data:
				is_found = True
			else:
				previous = current
				current = current.next

		if current is None:
			print '%s not found in the list.' % data
			return

		if previous is None:
			self.head = current.next
		else:
			previous.next = current.next


	def search(self, data):
		is_found = False
		current = self.head

		while not is_found and current is not None:
			if current.data == data:
				is_found = True
			else:
				current = current.next

		if current is None:
			print '%s not found in the list.' % data
			return
		print '%s founded!' % current.data

	def display(self):
		current = self.head
		while current is not None:
			print current.data,
			current = current.next
		print

	def size(self):
		current = self.head
		total = 0
		while current is not None:
			total += 1
			current = current.next
		return total


if __name__ == '__main__':
	linked_list = LinkedList()

	linked_list.insert('john')
	linked_list.insert('alex')
	linked_list.insert('sams')
	linked_list.insert('graham')

	linked_list.search('adit')
	linked_list.display()
	linked_list.delete('sams')
	linked_list.display()
