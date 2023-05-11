import com.beans.Compartment;
import com.beans.Library;
import com.beans.TransactionProcessor;
import com.model.Book;
import com.model.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args)throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Library library = applicationContext.getBean("library", Library.class);
        System.out.println(library);
        library.addBook(new Book("1234-1-12-12345-6", ".NET book 1",".NET"));
        library.addBook(new Book("1234-1-12-12345-6", ".NET book 2",".NET")); // should not be added as same isbn and equal obj
        library.addBook(new Book("1234-1-12-12345-1", "Head First Java", "Java"));
        library.addBook(new Book("1234-1-12-12345-2", "Core Java", "Java"));
        library.addBook(new Book("1234-1-12-12345-3", "Automatic the Boring Stuff with Python", "Python"));
        library.addBook(new Book("1234-1-12-12345-4", "Python Crash Course", "Python"));
        Compartment compartment = applicationContext.getBean(".NETCompartment", Compartment.class);
        System.out.println(compartment); // note compartment used in library is the same bean that was returned
        System.out.println(library); // books added into the library
        Library library1 = applicationContext.getBean("library", Library.class);
        System.out.println(library1); // note its the same library
        System.exit(0);
    }
}
