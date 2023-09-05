# Builder 

**builder is a creationa design pattern, which allows constructing complex objects step by step** 

Unlike other creational patterns, builder doesn't require products to hava a common interface. That makes it possible to produce different product using the same construction process.

## builder is widley used in java 

* java.lang.StringBuilder#append()
* java.lang.StringBuffer#append()
* java.nio.ByteBuffer#put()
* javax.swing.GroupLayout.Group#addComponent()
* All implementations of java.lang.Appendable

## Identification 
The builder pattern can be recognized in class, which have a single creation method and several methods to configure the resulting object. Builder methods often supoort chaining (for example, somebuilder.setvalueA(1).setValueB(2).create())

## Example By Refactoring Guru

In this example, the builder pattern allows step by step construction of different car models.

The director controls the order of the construction. It knows which building steps to call to produce this or that car model. It works with builders only via their common interface. this allows passing different types of builders to the director.

