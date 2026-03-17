public class HelloApp {

    public static void main(String[] args) {

        StringBuilder nameBuilder = new StringBuilder();

        if (args.length == 0) {
            nameBuilder.append("World");
        } else {

            boolean first = true;

            for (String name : args) {

                if (!first) {
                    nameBuilder.append(", ");
                }

                nameBuilder.append(name);
                first = false;
            }
        }

        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}