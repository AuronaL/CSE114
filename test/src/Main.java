import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class Main {
    /**
     * Iterate through each line of input.
     */
        public static void main (String[]args) throws IOException {
            InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader in = new BufferedReader(reader);
            String line;
            HashMap<String, Node> map = new HashMap<>();
            line = in.readLine();
            Set<String> mapNames;
            //first line
            String[] links = line.split(";");
            for (String link : links) {
                Node thisNode, nextNode;
                mapNames = map.keySet();
                String[] singleLink = link.split(",");
                if (!mapNames.contains(singleLink[0])) {
                    thisNode = new Node(singleLink[0]);
                    map.put(singleLink[0], thisNode);
                } else thisNode = map.get(singleLink[0]);
                if (!mapNames.contains(singleLink[1])) {
                    nextNode = new Node(singleLink[1]);
                    map.put(singleLink[1], nextNode);
                }
                thisNode.setRates(singleLink[1], Double.parseDouble((singleLink[2])));
            }
            line = in.readLine();
            //second line
            Node current = map.get(line);
            line = in.readLine();
            // third line
            Node target = map.get(line);
            double max = 0, rate = 1;
            Set<String> nextNode = current.getRates().keySet();
            List<String> nextNodes = new ArrayList<>();
            nextNodes.addAll(nextNode);
            for (int i = 0; i < nextNodes.size(); i++) {
                if (nextNodes.get(i) == target.name) {
                    rate = current.getRates(target.name);
                }
                if (map.get(nextNodes.get(i)).getRates().containsKey(target.name)) {
                    rate = current.getRates(nextNodes.get(i));
                    rate *= map.get(nextNodes.get(i)).getRates(target.name);
                }
                max = Math.max(rate, max);
            }
            if (max == 1) System.out.println(-1.0);
            else System.out.println(max);

        }

        static class Node {
            String name;
            HashMap<String, Double> rates = new HashMap<>();

            //constructor
            public Node(String name) {
                this.name = name;
            }

            public String toString() {
                return name;
            }

            public void setRates(String names, double rate) {
                this.rates.put(names, rate);
            }

            // return hashmap
            public HashMap<String, Double> getRates() {
                return rates;
            }

            // return rate
            public double getRates(String node) {
                return rates.get(node);
            }
        }
    }
