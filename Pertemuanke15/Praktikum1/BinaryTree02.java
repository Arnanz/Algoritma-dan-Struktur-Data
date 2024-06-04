public class BinaryTree02 {
    Node02 root;
    public BinaryTree02() {
        root = null;
}
boolean isEmpty() {
    return root == null;
}
void add(int data) {
    if (isEmpty()) { 
        root = new Node02(null, data, null);
    } else {
        tambahRekursif(root, data);
    }
}

boolean find(int data) {
    boolean result = false;
    Node02 current = root;
    while (current != null) {
        if (current.data == data) { 
            result = true;
            break;
        } else if (data < current.data) { 
            current = current.left;
        } else {
            current = current.right; 
        }
    }
    return result;
}

void traversePreOrder(Node02 node) {
    if (node != null) {
        System.out.print(" " + node.data);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}

void traversePostOrder(Node02 node) {
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(" " + node.data);
    }
}

void traverseInOrder(Node02 node) {
    if (node != null) {
        traverseInOrder(node.left);
        System.out.print(" " + node.data);
        traverseInOrder(node.right);
    }
}

Node02 getSuccessor(Node02 del) {
    Node02 successor = del.right;
    Node02 successorParent = del;
    while (successor.left != null) {
        successorParent = successor;
        successor = successor.left;
    }
    if (successor != del.right) {
        successorParent.left = successor.right;
        successor.right = del.right;
    }
    return successor;
}

void delete(int data) {
    if (isEmpty()) {
        System.out.println("Tree is empty");
        return;
    }

    Node02 parent = root;
    Node02 current = root;
    boolean isLeftChild = false;
    while (current != null) {
        if (current.data == data) {
            break;
        } else if (data < current.data) {
            parent = current;
            current = current.left;
            isLeftChild = true;
        } else if (data > current.data) {
            parent = current;
            current = current.right;
            isLeftChild = false;
        }
    }

    if (current == null) {
        System.out.println("Could not find data!");
        return;
    } else {
       
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (current.left == null) { 
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.right == null) { 
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else { 
            Node02 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }
}

void tambahRekursif(Node02 current, int data) { 
    if (current == null) {
        current = new Node02(null, data, null);
    } else {
        if (data < current.data) {
            if (current.left != null) {
                tambahRekursif(current.left, data);
            } else {
                current.left = new Node02(null, data, null);
            }
        } else if (data > current.data) {
            if (current.right != null) {
                tambahRekursif(current.right, data);
            } else {
                current.right = new Node02(null, data, null);
            }
        }
    }
}

int findMin() {
    Node02 current = root;
    while (current.left != null) {
        current = current.left;
    }
    return current.data;
}

int findMax() {
    Node02 current = root;
    while (current.right != null) {
        current = current.right;
    }
    return current.data;
}

void tampilLeaf(Node02 node) {
    if (node != null) {
        if (node.left == null && node.right == null) {
            System.out.print(" " + node.data);
        } else {
            tampilLeaf(node.left);
            tampilLeaf(node.right);
        }
    }
}

int tampilJumlahLeaf(Node02 node) {
    if (node == null) {
        return 0;
    } else if (node.left == null && node.right == null) {
        System.out.println(" " + node.data);
        return 1;
    } else {
        return tampilJumlahLeaf(node.left) + tampilJumlahLeaf(node.right);
    }
}
}