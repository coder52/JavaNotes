package B05_VisitorPattern.Task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    public int getResult() {
        //implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    int total=1;
    public int getResult() {
        //implement this
        return total;
    }

    public void visitNode(TreeNode node) {
        //implement this
        if(node.getColor().equals(Color.RED)){
            total*=node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if(leaf.getColor().equals(Color.RED)){
            total*=leaf.getValue();
        }
    }
}

class FancyVisitor extends TreeVis {
    private int totalValuesOfGreenLeaf=0;
    private int totalValuesOfNonLeafNodes=0;
    public int getResult() {
        //implement this
        return Math.abs(totalValuesOfGreenLeaf-totalValuesOfNonLeafNodes);
    }

    public void visitNode(TreeNode node) {
        //implement this
        if(node.getDepth()==0){
            totalValuesOfNonLeafNodes+=node.getValue();
        }
//        System.out.println(node.getValue());
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if(leaf.getColor().equals(Color.GREEN)){
            totalValuesOfGreenLeaf+=leaf.getValue();
        }
        System.out.println(leaf.getValue());
    }
}

public class Solution {

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner input = new Scanner(System.in);
        int numberOfNodes = input.nextInt();
        input.nextLine();
        String[] nodeValues = input.nextLine().split(" ");
        String[] nodeColors = input.nextLine().split(" ");

        List<Integer> u_list = new ArrayList<>();
        u_list.add(1);
        List<Integer> v_list = new ArrayList<>();
        v_list.add(1);
        int[] depths= new int[numberOfNodes];
        depths[0]=0;
        for (int i = 1; i < numberOfNodes; i++) {
            int u = input.nextInt();
            u_list.add(u);
            int v = input.nextInt();
            v_list.add(v);
            if(u==1){
                depths[v-1] = 1;
            } else {
                depths[v-1] = depths[u-1]+1;
            }
        }
        HashSet<Integer> u_set = new HashSet<>(u_list);
        System.out.println(u_set);
        HashSet<Integer> v_set = new HashSet<>(v_list);
        System.out.println(v_set);
        v_set.removeAll(u_set);
        System.out.println(v_set);


        TreeNode root = new TreeNode(Integer.valueOf(nodeValues[0]),Color.values()[Integer.valueOf(nodeColors[0])],0);
        for (int i = 1; i < numberOfNodes; i++) {
            int nodeValue = Integer.valueOf(nodeValues[i]);
            Color nodeColor = Color.values()[Integer.valueOf(nodeColors[i])];
            Tree node;
            if(u_set.contains(i)){
                node = new TreeLeaf(nodeValue,nodeColor,depths[i]);
            }
            else {
                node = new TreeNode(nodeValue,nodeColor,depths[i]);
            }
            root.addChild(node);
        }
        return root;
    }


    public static void main(String[] args) {
        Tree root = solve();
//        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

//        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

//        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

//        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}