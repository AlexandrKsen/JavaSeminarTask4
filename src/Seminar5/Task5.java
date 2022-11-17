package Seminar5;

public class Task5 {
    public static void main(String[] args) {
            Node root = new Node(1);

            Node n2 = new Node(2);
            Node n3 = new Node(3);

            Node n4 = new Node(4);
            Node n5 = new Node(5);
            Node n6 = new Node(6);

            Node n7 = new Node(7);
            Node n9 = new Node(9);
            Node n11 = new Node(11);
            Node n20 = new Node(20);
            Node n25 = new Node( 25);

            Node n30 = new Node( 30);
            Node n34 = new Node(34);
            Node n40 = new Node(40);
            Node n50 = new Node(50);

            root.left = n2;
            root.right = n3;

            n2.right = n4;
            n3.left = n5;
            n3.right = n6;

            n4.left = n7;
            n4.right = n9;

            n5.left = n11;
            n5.right = n20;

            n6.right = n25;

            n9.left = n30;
            n9.right = n34;

            n25.left = n40;
            n25.right = n50;

            preOrder(root, "");
        }

        static void preOrder(Node tree, String space) {
            if (tree != null)
                System.out.println(space + tree.value);
            else {
                System.out.println(space + "zero");
                return;
            }
            if (tree.left != null || tree.right != null) {
                preOrder(tree.left, space + " - ");
                preOrder(tree.right, space + " - ");
            }
        }

    }

    // zero
    class Node {
        int value;

        public Node(int value) {
            this.value = value;
        }

        Node left;
        Node right;
    }


