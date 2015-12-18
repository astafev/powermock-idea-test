# powermock-idea-test
Simple project to test IDEA debug with mockStatic.

To reproduce problem:
0. Run the test and verify that everything works fine.
1. Put breakpoint at Class2TestTest.java#L16 against **when(ClassWithStatic.someString()).thenReturn("asdf");**
2. Run with debugger.
3. Step inside function invocation **ClassWithStatic.someString()** |=> original function will be invoked.
