from Circle import Circle
from Rectangle import Rectangle
from AreaCalculator import AreaCalculator

if __name__ == "__main__":
    shapes = [Circle(), Rectangle()]
    area_calculator = AreaCalculator()

    for shape in shapes:
        shape.accept(area_calculator)