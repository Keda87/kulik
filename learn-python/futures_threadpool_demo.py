from __future__ import print_function
from concurrent.futures import ThreadPoolExecutor
from time import sleep


def return_after_5_seconds(message):
    sleep(5)
    return message

pool = ThreadPoolExecutor(3)
future = pool.submit(return_after_5_seconds, ("hello"))
print(future.done())
sleep(5)
print(future.done())
print(future.result())
