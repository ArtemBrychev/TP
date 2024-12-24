package lab5.Proxy;

// Прокси-класс, контролирующий доступ к реальному объекту
public class Proxy implements Subject {
    private RealSubject realSubject;
    private Boolean Access;

    public Proxy(Boolean HaveAccess){
        Access = HaveAccess;
    }

    public void request() {
        if (Access == true) {
            if (realSubject == null) {
                realSubject = new RealSubject(); // Ленивая инициализация
            }
            System.out.println("Access given");
            realSubject.request();
        } else {
            System.out.println("Proxy: Access denied.");
        }
    }
}