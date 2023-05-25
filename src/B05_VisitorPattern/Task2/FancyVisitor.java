package B05_VisitorPattern.Task2;

public class FancyVisitor extends TreeVis {
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
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if(leaf.getColor().equals(Color.GREEN)){
            totalValuesOfGreenLeaf+=leaf.getValue();
        }
    }
}
