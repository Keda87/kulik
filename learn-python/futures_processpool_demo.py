from __future__ import print_function
from concurrent.futures import ProcessPoolExecutor
from time import sleep


def run_after_5_secs(message):
    sleep(5)
    return message

pool = ProcessPoolExecutor(3)
future = pool.submit(run_after_5_secs, ("hello"))
print(future.done())
sleep(5)
print(future.done())
print('Result: ' + future.result())
