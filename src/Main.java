//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
            public static void main(String argu[]) {
                String str = "Hello";
                char[] carray = str.toCharArray();
                System.out.println("The string is:" + str);
                System.out.print("Duplicate Characters in above string are: ");
                for (int i = 0; i < str.length(); i++) {
                    for (int j = i + 1; j < str.length(); j++) {
                        if (carray[i] == carray[j]) {
                            System.out.print(carray[j] + " ");
                            break;
                        }
                    }
                }
            }
        }
