# Java多线程的小总结

按照“是什么？为什么？怎么样？”来总结。

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

## join()
> 它是Thread实例方法，它可以让一个线程等待另一个线程完成后再继续。
> 
> 可以将大问题划分成许多小问题，每个小问题分配一个线程，等所有小问题得到解决后再调回主线程。
> 
> 直接调用或传入指定毫秒数使用

## setDaemon()
> 它是Thread的实例方法，设置该线程为后台线程。（前台线程执行完成后，后台线程会随之停止执行）
> 
> 当某个可有可无的任务，伴随着前台线程执行，当所有前台线程执行完毕后可以终止的任务，则可以设置为后台线程。例如JVM内置的垃圾回收线程就是后台线程。
> 
> 传入boolean值指定

## sleep()
> 它是Thread的实例方法，调用该方法来暂停线程一段时间，进入阻塞状态。
> 
> 等待、模拟暂停、逐字打印等应用场景会用到该方法
> 
> 传入指定毫秒数使用

## yield()
> 它是Thread的实例方法，调用该方法来暂停线程一段时间，但不会进入阻塞状态。
> 
> 当某个任务不重要的时候，可以调用该方法，让优先级高的任务先执行完成，之后再回来继续执行。
> 
> 直接调用

## setPriority()
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

## wait()
> 它是Object对象的方法，任何类都具有该方法。导致当前线程等待，直到其他线程notify()或notifyAll()唤醒该线程。
> 
> 简单方便，同步监视器对象就是this本身。
> 
> 调用方法：this.wait()。或传入指定毫秒数，在指定时间后自动唤醒。

## notify()
> 它是Object对象的方法，任何类都具有该方法。唤醒在此对象等待的线程，如果有多个等待的线程，则随机唤醒一个。
> 
> 和wait()配合使用
> 
> 直接调用

## notifyAll()
> 它是Object对象的方法，任何类都具有该方法。唤醒在此对象等待的所有线程。
> 
> 和wait()配合使用
> 
> 直接调用

## await()
> 它是Condition对象的方法，功能同Object对象的wait()方法类似。
> 
> 使用Lock类的时候需要用到Condition的该方法来实现Object的wait()方法类似的功能。
> 
> 和Lock配合使用。通常先设置private成员变量Condition，则:先通过lock.getCondition()获得Condition对象，再在lock()方法后面调用condition.await()来执行。

## signal()
> 它是Condition对象的方法，功能同Object对象的signal()方法类似。
> 
> 使用Lock类的时候需要用到Condition的该方法来实现Object的notify()方法类似的功能。
> 
> 和Lock配合使用。通常先设置private成员变量Condition，则:先通过lock.getCondition()获得Condition对象，再在lock()方法后面调用condition.signal()来执行。

## signalAll()
> 它是Condition对象的方法，功能同Object对象的notifyAll()方法类似。
> 
> 使用Lock类的时候需要用到Condition的该方法来实现Object的notifyAll()方法类似的功能。
> 
> 和Lock配合使用。通常先设置private成员变量Condition，则:先通过lock.getCondition()获得Condition对象，再在lock()方法后面调用condition.signalAll()来执行。

