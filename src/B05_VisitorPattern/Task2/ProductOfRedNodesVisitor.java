package B05_VisitorPattern.Task2;

public class ProductOfRedNodesVisitor extends TreeVis {
    long total=1L;
    public int getResult() {
        //implement this
        int t = (int) (total%(Math.pow(10,9)+7));
        return t;
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
