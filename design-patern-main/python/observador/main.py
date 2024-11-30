from Subject import Subject
from ConcreteObserver import ConcreteObserver

# Main code to demonstrate
if __name__ == "__main__":
    subject = Subject()

    observer1 = ConcreteObserver("Observer 1")
    observer2 = ConcreteObserver("Observer 2")

    subject.attach(observer1)
    subject.attach(observer2)

    subject.notify("First message")

    subject.detach(observer1)

    subject.notify("Second message")