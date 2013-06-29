public class Test_StringBuilder {

	public static void main(String... strings) {

		StringBuilder builder = new StringBuilder("asdfg");
		builder.insert(3, "qwert");
		builder.reverse();
		builder.append(123);
		builder.delete(6, 9);
		System.out.println(builder);

	}

}
