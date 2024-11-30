from DatabaseServiceProxy import DatabaseServiceProxy

# Testando o padrão Proxy
if __name__ == "__main__":
    db_service = DatabaseServiceProxy()
    db_service.request_data()  # Primeira chamada, vai para o banco de dados real
    db_service.request_data()  # Segunda chamada, usa o cache