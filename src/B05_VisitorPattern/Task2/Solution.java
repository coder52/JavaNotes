package B05_VisitorPattern.Task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner input = new Scanner(System.in);
        int numberOfNodes = input.nextInt();
        input.nextLine();
        String[] nodeValues = input.nextLine().split(" ");
        String[] nodeColors = input.nextLine().split(" ");

        List<Integer> u_list = new ArrayList<>();
        List<Integer> v_list = new ArrayList<>();
        for (int i = 1; i < numberOfNodes; i++) {
            int u = input.nextInt();
            u_list.add(u);
            int v = input.nextInt();
            v_list.add(v);
        }
        HashSet<Integer> u_set = new HashSet<>(u_list);
        HashSet<Integer> v_set = new HashSet<>(v_list);
        HashSet<Integer> leaves = new HashSet<>(v_set);
        leaves.removeAll(u_set);
        HashSet<Integer> roots = new HashSet<>(u_set);
        roots.removeAll(v_set);

        int[] depths= new int[numberOfNodes+1];
        for (int num = 0; num < u_list.size(); num++) {
            if(roots.contains(u_list.get(num))){
                depths[v_list.get(num)] = 1;
            } else {
                depths[v_list.get(num)] = depths[u_list.get(num)]+1;
            }
        }

        TreeNode root = new TreeNode(Integer.valueOf(nodeValues[0]),Color.values()[Integer.valueOf(nodeColors[0])],0);
        for (int i = 1; i < numberOfNodes; i++) {
            int nodeValue = Integer.valueOf(nodeValues[i]);
            Color nodeColor = Color.values()[Integer.valueOf(nodeColors[i])];
            int depth = depths[i+1];

            Tree node;
            if(leaves.contains(i+1)){
                node = new TreeLeaf(nodeValue,nodeColor,depth);
            }
            else {
                node = new TreeNode(nodeValue,nodeColor,depth);
            }
            root.addChild(node);
        }
        return root;
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}