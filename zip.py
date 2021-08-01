# zip.py
# The zip built-in takes a series of iterables and aggregates the elements from each of them. Let’s see what that means:
#
# https://www.educative.io/module/lesson/advanced-concepts-in-python/RL19MYNx0GO

keys = ['x', 'y', 'z']
values = [5, 6, 7]
print (zip(keys, values))
#<zip object at 0x7faaad4dd848>

print (list(zip(keys, values)))
#[('x', 5), ('y', 6), ('z', 7)]



"""
take two lists and turn them into a dictionary.
create_dict()
input: list1, list2
output: dict1
"""
keys = ['x', 'y', 'z']
values = [5, 6, 7]
my_dict = dict(zip(keys, values))
print (my_dict)
#{'x': 5, 'y': 6, 'z': 7}
