package helper;

import beans.Node;

public class NodeGenerator {

    public static Node generateNode(Integer id) {
        Node node = new Node();
        node.setId(id);
        node.setInfection(false);
        return node;
    }
}
