from CSVDataProcessor import CSVDataProcessor
from JSONDataProcessor import JSONDataProcessor

# Teste
if __name__ == "__main__":
    csv_processor = CSVDataProcessor()
    csv_processor.process_data()

    print()

    json_processor = JSONDataProcessor()
    json_processor.process_data()