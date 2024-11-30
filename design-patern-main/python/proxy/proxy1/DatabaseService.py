from abc import ABC, abstractmethod

# Interface do serviço
class DatabaseService(ABC):
    @abstractmethod
    def request_data(self):
        pass