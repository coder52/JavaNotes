package B05_VisitorPattern.Task2;

public class SumInLeavesVisitor extends TreeVis {
    int total=0;
    public int getResult() {
        //implement this
        return total;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        total+=leaf.getValue();
    }
}
