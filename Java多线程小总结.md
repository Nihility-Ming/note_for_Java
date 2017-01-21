# Java多线程小总结

## Thread

> 一个Thread对象代表一个线程。
> 
> 使用多线程可充分利用CPU资源，也可以防止主线程阻塞。
>
> 可以继承Thread来创建一个自定义线程类，重写run方法来表示线程执行的函数体。

## Runable

> 它是一个函数式接口，该实现该接口的run方法的类可以传入Thread的构造方法的参数，当作线程执行体来执行。
> 
> 如果使用直接继承Thread类的方式创建线程，缺乏类继承的灵活性。因此，可以使用Runable接口来代替直接继承Thread类方法创建线程。

## Callable

> 它是一个函数式接口，较之Runable，它可以返回值，并且可以抛出异常，是Runable的增强版。
>
> 当线程执行体需要返回值和抛出异常时，可以使用Callable。
>
> Callable接口实现类传入FutureTask类构造方法，然后再把FutruTask对象传入Thread类构造器三者配合使用。

## FutureTask

> 它是Future的实现类，用来包装Callable或Runable的类。
> 
> 使用Callable接口实现类时，需要用到FutureTask包装后，才能放入Thread构造器里面运行；使用Runable接口实现类时，也可以使用FutureTask包装，再放入Thread。


一般使用Runable、Callable接口的方式创建多线程。

