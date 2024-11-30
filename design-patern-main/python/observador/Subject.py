# Subject class
class Subject:
    def __init__(self):
        self._observers = []  # List to store observers

    def attach(self, observer):
        self._observers.append(observer)

    def detach(self, observer):
        self._observers.remove(observer)

    def notify(self, message):
        for observer in self._observers:
            observer.update(message)