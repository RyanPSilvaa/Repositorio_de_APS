class Singleton:
    # Atributo de classe que armazenará a instância única
    _instance = None

    # Método especial __new__ para controlar a criação da instância
    def __new__(cls):
        if cls._instance is None:
            # Cria a instância caso ainda não exista
            cls._instance = super(Singleton, cls).__new__(cls)
        return cls._instance

    # Exemplo de método que pode ser acessado pela instância Singleton
    def show_message(self, mesage):
        print(mesage)