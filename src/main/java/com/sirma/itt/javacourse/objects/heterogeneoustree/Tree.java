package main.java.com.sirma.itt.javacourse.objects.heterogeneoustree;

/**
 * A tree class which hold a list for every element with same type.Those
 * elements are from a list with root elements.
 * 
 * @author radoslav
 */
public class Tree {

	private Node root;

	/**
	 * Initializing variables in the constructor.
	 */
	public Tree() {
		root = null;
	}

	/**
	 * Predefined insert method, which add a new element to the root list only
	 * if the element's type has not been added before or add the element to the
	 * child list if such type was previously inserted.
	 * 
	 * @param current
	 *            points to the current element
	 * @param data
	 *            the element
	 * @param parent
	 *            points to the previous element
	 * @return
	 */
	private Node insert(Node current, Element<?, ?> data, Node parent) {
		if (current == null) {
			current = new Node();
			current.setChild(null);
			current.setData(data);
			current.setNext(null);
			current.setParent(parent);
		} else {

			if (current.getData().getType().equals(data.getType())) {
				current.setChild(insert(current.getChild(), data, current));
			} else {
				current.setNext(insert(current.getNext(), data, current));
			}

		}
		return current;
	}

	/**
	 * Add element to the tree
	 * 
	 * @param data
	 */
	public void insert(Element<?, ?> data) {
		root = insert(root, data, null);
	}

	/**
	 * Predefining searching method to work with the nodes. Searching for an
	 * element in the right sublist.
	 * 
	 * @param current
	 * @param data
	 */
	private Node search(Node current, Element<?, ?> data) {
		Node cur = new Node();
		cur = root;
		//System.out.println(root);
		while(cur!=null){
			//System.out.println("vlizam v while-a");
			if (cur.getData().getType().equals(data.getType())) {	
				if(cur.getData()==data)
				{
				//	System.out.println("ravni sa");
					break;
				}
				cur = cur.getChild();
				//System.out.println("sas");
			}else{
				//System.out.println(cur.getData().toString());
				if(cur.getData().equals(data))
				{
					//System.out.println("asaasf");
					break;
				}
				cur = cur.getNext();
			}
		}
			
		return cur;

	}

	/**
	 * Public search method for using it outside the clas.
	 * 
	 * @param data
	 */
	public Node search(Element<?, ?> data) {
		return search(root, data);
	}

}