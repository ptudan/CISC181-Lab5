public class Tree{
	Node root;
	
	public void addNode(int key){
		Node newNode = new Node(key);
		if(root == null){
			root = newNode;
		}
		else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				if(key < focusNode.key){
					focusNode = focusNode.leftChild;
					if(focusNode == null){
						parent.leftChild = newNode;
						return;
					}
				}
				else if(key>focusNode.key){
					focusNode = focusNode.rightChild;
					if(focusNode==null){
						parent.rightChild = newNode;
						return;
					}
				}
				else{
					System.out.println(key + " is already in the tree.");
					if(focusNode.clone==null){
						focusNode.clone = newNode;
					}
					else{
						focusNode = focusNode.clone;
						focusNode.clone = newNode;
					}
					return;
				}
			}
		}
	}
	
	public void PrintTree(Node focusNode){
		if(focusNode != null){
			PrintTree(focusNode.leftChild);
			System.out.print(focusNode + " ");
			PrintTree(focusNode.rightChild);
		}
	}
	
	public Node findNode(int key){
		Node focusNode = root;
		while(focusNode.key !=key){
			if(key<focusNode.key){
				focusNode = focusNode.leftChild;
			}
			else{
				focusNode = focusNode.rightChild;
			}
			if(focusNode == null){
				System.out.println(key + " not in tree");
				return null;
			}
		}
		System.out.println("Found! "  + focusNode);
		return focusNode;
	}
	
	public void PrintTree2(Node focusNode){
		if(focusNode != null){
			PrintTree2(focusNode.leftChild);
			System.out.print(focusNode + " ");
			Node tempNode = focusNode;
			while(tempNode.clone !=null){
				System.out.print(tempNode.clone + " ");
				tempNode = tempNode.clone;
			}
			PrintTree2(focusNode.rightChild);
		}
	}
}