# Java多线程的小总结

## Thread

> 一个Thread对象代表一个线程。
> 
> 使用多线程可充分利用CPU资源，也可以防止主线程阻塞。
>
> 可以继承Thread来创建一个自定义线程类，重写run方法来表示线程执行的函数体。

## Runnable

> 它是一个函数式接口，该实现该接口的run方法的类可以传入Thread的构造方法的参数，当作线程执行体来执行。
> 
> 如果使用直接继承Thread类的方式创建线程，缺乏类继承的灵活性。因此，可以使用Runnable接口来代替直接继承Thread类方法创建线程。

## Callable

> 它是一个函数式接口，较之Runnable，它有**返回值**，并且可以**抛出异**常，是Runnable的增强版。
>
> 当线程执行体需要返回值和抛出异常时，可以使用Callable。
>
> Callable接口实现类传入FutureTask类构造方法，然后再把FutureTask对象传入Thread类构造器三者配合使用。

## FutureTask

> 它是Future的实现类，用来包装Callable或Runnable的接口实现类。
> 
> 使用Callable接口实现类时，需要用到FutureTask包装后，才能放入Thread构造器里面运行；使用Runnable接口实现类时，也可以使用FutureTask包装，再放入Thread。

一般使用Runnable、Callable接口的方式创建多线程。

## thread.join()
> 它是Thread实例方法，它可以让一个线程等待另一个线程完成后再继续。
> 
> 可以将大问题划分成许多小问题，每个小问题分配一个线程，等所有小问题得到解决后再调回主线程。
> 
> 直接调用或传入指定毫秒数使用

## thread.setDaemon()
> 它是Thread的实例方法，设置该线程为后台线程。（前台线程执行完成后，后台线程会随之停止执行）
> 
> 当某个可有可无的任务，伴随着前台线程执行，当所有前台线程执行完毕后可以终止的任务，则可以设置为后台线程。例如JVM内置的垃圾回收线程就是后台线程。
> 
> 传入boolean值指定

## thread.sleep()
> 它是Thread的实例方法，调用该方法来暂停线程一段时间，进入阻塞状态。
> 
> 等待、模拟暂停、逐字打印等应用场景会用到该方法
> 
> 传入指定毫秒数使用

## thread.yield()
> 它是Thread的实例方法，调用该方法来暂停线程一段时间，但不会进入阻塞状态。
> 
> 当某个任务不重要的时候，可以调用该方法，让优先级高的任务先执行完成，之后再回来继续执行。
> 
> 直接调用

## thread.setPriority()
> 它是Thread的实例方法，调用该方法来设置当前Thread的优先级，优先级越高，得到执行的机会越高。
> 
> 可以传入3个优先级常量来设置优先级

## 同步代码块synchronized(Object) {...}
> synchronized(Object) {...}是同步监视器语句防止线程竞争某Object
> 
> 防止线程竞争某Object的时候，可以使用synchronized来锁定该Object

## synchronized同步方法
> 使用synchronized声明某个对象方法（非static方法）
> 
> synchronized声明的方法体里面的方法可以防止线程竞争

## ReentrantLock
> 它是同步锁Lock的子类，可以显式地加锁、释放锁。
> 
> Lock简化了synchronized同步代码块和方法的繁琐操作。
> 
> 通常在类里面建立一个private的ReentrantLock对象，然后在需要同步的方法里面调用ReentrantLock对象的lock()和unlock()方法。（建议lock()...try{ } finally { unlock() }这样使用，保证锁的释放）

## object.wait()
> 它是Object对象的方法，任何类都具有该方法。导致当前线程等待，直到其他线程notify()或notifyAll()唤醒该线程。
> 
> 简单方便，同步监视器对象就是this本身。
> 
> 调用方法：this.wait()。或传入指定毫秒数，在指定时间后自动唤醒。

## object.notify()
> 它是Object对象的方法，任何类都具有该方法。唤醒在此对象等待的线程，如果有多个等待的线程，则随机唤醒一个。
> 
> 和wait()配合使用
> 
> 直接调用

## object.notifyAll()
> 它是Object对象的方法，任何类都具有该方法。唤醒在此对象等待的所有线程。
> 
> 和wait()配合使用
> 
> 直接调用

## condition.await()
> 它是Condition对象的方法，功能同Object对象的wait()方法类似。
> 
> 使用Lock类的时候需要用到Condition的该方法来实现Object的wait()方法类似的功能。
> 
> 和Lock配合使用。通常先设置private成员变量Condition，则:先通过lock.getCondition()获得Condition对象，再在lock()方法后面调用condition.await()来执行。

## condition.signal()
> 它是Condition对象的方法，功能同Object对象的signal()方法类似。
> 
> 使用Lock类的时候需要用到Condition的该方法来实现Object的notify()方法类似的功能。
> 
> 和Lock配合使用。通常先设置private成员变量Condition，则:先通过lock.getCondition()获得Condition对象，再在lock()方法后面调用condition.signal()来执行。

## condition.signalAll()
> 它是Condition对象的方法，功能同Object对象的notifyAll()方法类似。
> 
> 使用Lock类的时候需要用到Condition的该方法来实现Object的notifyAll()方法类似的功能。
> 
> 和Lock配合使用。通常先设置private成员变量Condition，则:先通过lock.getCondition()获得Condition对象，再在lock()方法后面调用condition.signalAll()来执行。

## BlockingQueue
> 它是Queue的子接口，实现类有ArrayBlockingQueue、LinkedBlockingQueue、SynchronousQueue等.是线程同步的工具，当生产者线程向BlockingQueue放入元素，如果满了，阻塞线程；如果消费者线程向BlockingQueue取出元素，如果空了，阻塞线程。
> 
> 可以当作线程同步工具使用，或者实现内存消息队列时，可以使用BlockingQueue。
> 
> 使用BlockingQueue的put(),take()方法来压入和取出元素。

### SynchronousQueue
> 它是BlockingQueue的实现类，对该类的存取必须要交替进行，是典型的生产者消费者模式实现。

## ThreadGroup
> 它表示线程组，可以对一大批线程进行统一管理，包括中断线程组内所有线程的执行、返回正在活动线程数等功能。
> 
> 当某些线程具有相同目的的时候，共同存在或共同消亡的关系时，可以使用ThreadGroup
> 
> 使用ThreadGroup构造器构建ThreadGroup对象，然后在构建Thread的时候，传入ThreadGroup对象。

## Thread.UncaughtExceptionHandler
> Thread的内部定义的接口，用来处理线程运行过程中的异常情况。
> 
> Java5对线程异常处理的加强
> 
> 实现Thread.UncaughtExceptionHandler接口并把那对线为Thread对象设置setUncaughtExceptionHandler()或者为Thread类全部设置默认的异常处理器setDefaultUncaughtExceptionHandler()

## Executors
> 它是线程池产生工厂类，内置大量静态构造方法。
> 
> 线程池在系统启动时创建大量的空闲线程，用来执行Runnable或Callable对象，有利于充分、节省系统资源，有效控制系统线程并发数。
> 
> 1、调用Executors的静态方法new...来创建ExecutorService接口实现类的对象，该对象就是线程池。
> 2、创建Runnable或Callable接口实现对象。
> 3、调用ExecutorService的submit()方法来提交创建的Runnable或Callable接口实现对象。
> 4、调用ExecutorService的shutdown()关闭线程池，完成提交。

## ForkJoinPool
> 为了充分利用多核CPU时代而加入的线程池类，始于Java7，加强于Java8.
> ForkJoinPool是ExecutorService接口的实现类，用于把一个任务并行分成小任务，再合并最后结果。
> 
> 创建ForkJoinPool后可调用submit()或invoke()来执行指定任务（**ForkJoinTask**）。再调用shutdown()关闭线程池。

### ForkJoinTask
> 用于表示一个并行、合并的任务，它是一个实现了Future的抽象类。还有两个它的抽象子类：
> 1、RecursiveAction代表没有返回值的任务
> 2、RecursiveTask代表有返回值的任务
> 
> 调用forkJoinTask.fork()执行任务；如果是RecursiveTask，可以调用forkJoinTask.join()返回执行后的结果。

## ThreadLocal
> 使用这个类能够隔离多个线程的竞争资源。非同步机制，而是每个线程复制一份的方式。
> 
> 为了达到某资源在各个线程拥有各自的副本，可以使用ThreadLocal
> 
> 通常在类里面声明private成员变量，然后创建ThreadLocal对象，在需要副本对象的setter和getter方法里面方便调用ThreadLocal对象的set()和get方法来代替默认的存取方法。（即包装）

## Collections
> 集合的工具类，里面包含了各种集合转线程安全的方法。
> 
> ArrayList、LinkedList、HashSet、TreeSet、HashMap、TreeMap等集合类都是线程不安全的，所以可以使用Collections的转线程安全的方法来支持同步。
> 
> 调用Collections.synchronized...

