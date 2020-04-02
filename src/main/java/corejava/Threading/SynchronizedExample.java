package corejava.Threading;
// LOCK concpet is implemented based on object not on method
// synchronized is keyowrd for methods and block not for classes and variables
// If multiple threads are trying to operate symultaneously on same java object then there may be chance of data inconsitency problem
//If method and block declared as synchronized then at a time only 1 thread is allowed to execute on given object
//so that data inconsistency problem will be resolved

// Every object in java has unique lock whenever we are using synchronized keyword then only LOCK concept come to picture
// If a thread wants to execute synchronized method on given object frist it has to get lock of that object
// Once thread got lock then allowed to execute any synchoronized method on that object
//Once method execution completes automatically thread releases lock
// Acquring and releasing lock internally takes care by JVM .
// while thread executing synch method on given object remaining threads are not allowed to exexute any sync method on same object
// but remaining threads are allowed to execute non syncronized methods symultaneously
// where update operation where state of object changing  need to be taken under sync area
// non sync method  where object state wontt be changed like read operation is under non sync



// CLASS LEVEL Locking
// if a thread want to execute static synchronized method it requires Class level lock
// While a thread executing static sync method remaining threads are not allowed to execute static sync methods of that class symultaneously.
// But remaining threads are allowed to execute following methods symultaneously
// 1. normal static methods
// 2. sync instance methods
// 3. normal instance methods
public class SynchronizedExample {
}
