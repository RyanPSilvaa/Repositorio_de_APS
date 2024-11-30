from Logger import Logger

# Exemplo de uso
logger1 = Logger()
logger1.log("Mensagem 1")

logger2 = Logger()
logger2.log("Mensagem 2")

logger3 = Logger()
logger3.log("Mensagem 3")

print(logger1 is logger2)  # Isso retornará True