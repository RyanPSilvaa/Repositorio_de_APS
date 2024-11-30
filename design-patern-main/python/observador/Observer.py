# Observer class
class Observer:
    def update(self, message):
        raise NotImplementedError("Subclass must implement abstract method")