package A05_String.Tasks;

import java.sql.SQLOutput;
import java.util.*;

public class Task7StacksInJava {
    public static void main(String[] args) {
        String str = "{}()\n({()})\n{}(\n[]\n";
//        String str = "({}[])\n" +
//                "(({()})))\n" +
//                "({(){}()})()({(){}()})(){()}\n" +
//                "{}()))(()()({}}{}\n" +
//                "}}}}\n" +
//                "))))\n" +
//                "{{{\n" +
//                "(((\n" +
//                "[]{}(){()}((())){{{}}}{()()}{{}{}}\n" +
//                "[[]][][]\n" +
//                "}{";
//        String str = "(((";
        Scanner sc = new Scanner(str);

        String stacks = "{[()]}";

        HashMap<String,String> stacksMap = new HashMap<>();
        stacksMap.put("{", "}");
        stacksMap.put("(", ")");
        stacksMap.put("[", "]");

        while (sc.hasNext()){
            String input = sc.nextLine();
            String[] charArray = input.split("");
            ArrayList<String> stacksListInText = new ArrayList<>();
            // Get stacks from the text
            for (String s:charArray) {
                if(stacks.contains(s)){
                    stacksListInText.add(s);
                }
            }
            // Check whether stacks are balanced
            if(input.length()<2){
                System.out.println(false);
                continue;
            }
            ArrayList<String> temporaryStacks=new ArrayList<>();
            boolean flag = true;
            for (String s:stacksListInText) {
                if(stacks.substring(0,3).contains(s)){
                    temporaryStacks.add(s);
                    continue;
                }
                if(temporaryStacks.isEmpty()){
                    flag = false;
                    break;
                } else {
                    if(stacksMap.get(temporaryStacks.get(temporaryStacks.size()-1)).equals(s)){
                        temporaryStacks.remove(temporaryStacks.size()-1);
                    } else {
                        flag=false;
                        break;
                    }
                }
            }
            if(temporaryStacks.isEmpty()){
                System.out.println(flag);
            } else {
                System.out.println("false");
            }
        }
        sc.close();

    }
}
