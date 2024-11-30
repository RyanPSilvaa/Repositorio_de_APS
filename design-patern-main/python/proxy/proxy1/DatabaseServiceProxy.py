from DatabaseService import DatabaseService
from RealDatabaseService import RealDatabaseService

# Proxy que controla o acesso ao serviço real
class DatabaseServiceProxy(DatabaseService):
    def __init__(self):
        self._real_database_service = None
        self._cache_valid = False

    def request_data(self):
        if self._cache_valid:
            print("Usando dados do cache...")
        else:
            if self._real_database_service is None:
                self._real_database_service = RealDatabaseService()
            self._real_database_service.request_data()
            self._cache_valid = True
            print("Dados armazenados no cache.")