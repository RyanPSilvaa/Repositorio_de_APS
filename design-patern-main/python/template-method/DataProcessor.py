from abc import ABC, abstractmethod

# Classe abstrata definindo o template
class DataProcessor(ABC):
    # Template method
    def process_data(self):
        self.read_data()
        self.process_data_implementation()
        self.save_data()

    # Passos concretos
    def read_data(self):
        print("Lendo dados...")

    def save_data(self):
        print("Salvando dados...")

    # Passo abstrato que será implementado pelas subclasses
    @abstractmethod
    def process_data_implementation(self):
        pass
