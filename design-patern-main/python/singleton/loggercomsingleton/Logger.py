class Logger():
    # Atributo de classe que armazenará a instância única
    _instance = None

    # Método especial __new__ para controlar a criação da instância
    def __new__(cls):
        if cls._instance is None:
            # Cria a instância caso ainda não exista
            cls._instance = super(Logger, cls).__new__(cls)
            print("Inst\u00e2ncia \u00fanica do Logger criada!")
        return cls._instance
    
    

    # Exemplo de método que pode ser acessado pela instância Singleton
    def log(self, mesage):
        print(f"Log: {mesage}")