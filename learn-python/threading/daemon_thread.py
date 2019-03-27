
import logging
import threading
import time


def thread_function(name):
    logging.info(f'Thread {name}: starting')
    time.sleep(2)
    logging.info(f'Thread {name}: finishing')

if __name__ == '__main__':
    format = "%(asctime)s: %(message)s"
    logging.basicConfig(format=format, level=logging.INFO,
                        datefmt="%H:%M:%S")

    logging.info('Main    : before creating thread.')
    x = threading.Thread(target=thread_function, args=[1], daemon=True)
    logging.info('Main    : before running thread.')
    x.start()
    logging.info('Main    : wait the thread to finish.')

    # It will wait all the thread finished.
    # Otherwise without this, it will only run the main thread
    # and if main thread is finished, all the thread will killed
    # in daemon=True.
    x.join()

    logging.info('Main    : all done.')
