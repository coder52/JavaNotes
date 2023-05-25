package B05_VisitorPattern.Task2;

import java.util.ArrayList;

public class TreeNode extends Tree {
    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);
        System.out.println("########################");
        for (Tree child : children) {
            System.out.println("%%%%%%%");
            System.out.println(child.getColor()+" "+ child.getValue()+ " " +child.getDepth());
            child.accept(visitor);
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}
