package lab5.Proxy;

// Реальный объект, к которому прокси предоставляет доступ
public class RealSubject implements Subject {
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}

