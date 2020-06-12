package service;

import beans.Node;
import helper.NodeGenerator;

import java.util.ArrayList;
import java.util.List;

public class PushService {

    private List<Node> graph;

    public Integer simulate(Integer nodesCount) {
        generateGraph(nodesCount);

        int randomCall = (int) (Math.random() * nodesCount);

        graph.get(randomCall).setInfection(true);
        int roundCounter = 0;

        while (graph.stream().anyMatch(node -> !node.getInfection())) {
            roundCounter++;
            graph.forEach(node -> callOtherNode(node, nodesCount));
        }
        return roundCounter;
    }

    private void callOtherNode(Node node, Integer nodesCount) {
        int randomCall = (int) (Math.random() * nodesCount);
        Node callNode = graph.get(randomCall);
        if (node.getInfection()) {
            callNode.setInfection(true);
        }
    }

    public void generateGraph(Integer nodesCount) {
        graph = new ArrayList<>();
        for (int i = 0; i < nodesCount; i++) {
            graph.add(NodeGenerator.generateNode(i));
        }
    }
}