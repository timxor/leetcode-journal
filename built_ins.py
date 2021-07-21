# built_ins.py
#
# https://www.educative.io/module/lesson/advanced-concepts-in-python/qZ4ZVVDN6kp



# map

"""
The map built-in also takes a function and an iterable and return an iterator that applies the function to each item in the iterable
"""

def doubler(x):
    return x * 2

my_list = [1, 2, 3, 4, 5]
for item in map(doubler, my_list):
    print(item)
