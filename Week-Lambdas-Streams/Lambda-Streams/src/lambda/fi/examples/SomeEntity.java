package lambda.fi.examples;

@FunctionalInterface
public interface SomeEntity <I, O> {

	O someOperation(I input);
//	int add (int a, int b);
}
