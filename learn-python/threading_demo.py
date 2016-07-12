import time
from threading import Thread


def myfunc(i):
    print 'Sleeping 5 sec from thread %d' % i
    time.sleep(5)
    print 'Finished sleeping form thread %d' % i

for i in range(10):
    t = Thread(target=myfunc, args=[i])
    t.start()
