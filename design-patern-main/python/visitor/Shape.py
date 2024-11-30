from abc import ABC, abstractmethod

# Element interface
class Shape(ABC):
    @abstractmethod
    def accept(self, visitor):
        pass