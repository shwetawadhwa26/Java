import java.util.LinkedList;
import java.util.Queue;
public class basics {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{

                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            } 
        }
    }

    public static int CountOfNodes(Node root){
            if(root==null){
                return 0;
            }
        int leftNodes = CountOfNodes(root.left);
        int rightNodes = CountOfNodes(root.right);
        return leftNodes+rightNodes+1;
        }
    public static int HeightOfTree(Node root){
        if(root==null){
            return 0;
        }
    int leftheight = HeightOfTree(root.left);
    int rightheight = HeightOfTree(root.right);
    if (leftheight+1 > rightheight+1){
        return leftheight+1;
    }
    else{
        return rightheight+1;
    }
    }
    //height logic two 
    public static int Height(Node root){
        if(root==null){
            return 0;
        }
    int leftheight = Height(root.left);
    int rightheight = Height(root.right);
    int myHeight = Math.max(leftheight,rightheight)+1;
    return myHeight;
    }

    public static int SumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int sumleft = SumOfNodes(root.left);
        int sumright = SumOfNodes(root.right);
        return sumleft+sumright+root.data;
    }

    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }
        int diameter1 = Diameter(root.left);
        int diameter2= Diameter(root.right);
        int diameter3=Height(root.left)+Height(root.right)+1;
        return Math.max(diameter1, Math.max(diameter2,diameter3));
    }


    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht, int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left =diameter2(root.left);
        TreeInfo right =diameter2(root.right);

        int myHeight = Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2= right.diam;
        int diam3=left.ht+right.ht+1;

        int mydiam = Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myInfo = new TreeInfo(myHeight,mydiam);
        return myInfo;

    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // preorder(root);
        // inorder(root);
        // postorder(root);
        // levelOrder(root);
        int nodecount = CountOfNodes(root);
        System.out.println("count of nodes = " + nodecount);

        int sum = SumOfNodes(root);
        System.out.println("sum = " + sum);

        int height = HeightOfTree(root);
        System.out.println("height = " +height);

        int heightoftree = Height(root);
        System.out.println("height by shorter logic = "+heightoftree);

        int diameteroftree=Diameter(root);
        System.out.println("diameter of tree = "+ diameteroftree);

        System.out.println("info = "+ diameter2(root).diam);

    }
    
}
