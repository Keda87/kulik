import logging
import time
from concurrent.futures import ThreadPoolExecutor


class FakeDB:

    def __init__(self):
        self.value = 0

    def update(self, name):
        logging.info(f'Thread {name}: starting update')
        local_copy = self.value
        local_copy += 1

        time.sleep(0.1)

        self.value = local_copy
        logging.info(f'Thread {name}: finishing update')


if __name__ == '__main__':
    format = "%(asctime)s: %(message)s"
    logging.basicConfig(format=format, level=logging.INFO,
                        datefmt="%H:%M:%S")

    db = FakeDB()
    logging.info(f'Testing update. Starting value is {db.value}')
    with ThreadPoolExecutor(max_workers=2) as executor:
        for i in range(2):
            executor.submit(db.update, i)
    logging.info(f'Testing update. Ending value is {db.value}')
