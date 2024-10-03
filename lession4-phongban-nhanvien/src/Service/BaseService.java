package Service;

public interface BaseService {
    Object inputOne();

    void displayByName( String name);
    int findById( String id);

    void add( Object object);
    void editById( String id);

    void deleteById( String id);
    void displayAll();
}
