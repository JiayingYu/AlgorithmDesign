package sourceCode;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator {
  ArrayList<Integer> list;
  int index;

  public BSTIterator(TreeNode root) {
      list = new ArrayList<Integer>();
      index = 0;
      iterate(list, root);
  }
  
  public void iterate(List<Integer> list, TreeNode root) {
      if (root == null) return;
      iterate(list, root.left);
      list.add(root.val);
      iterate(list, root.right);
  }

  /** @return whether we have a next smallest number */
  public boolean hasNext() {
      if (index < list.size()) return true;
      else return false;
  }

  /** @return the next smallest number */
  public int next() {
      return list.get(index++);
  }
}

/**
* Your BSTIterator will be called like this:
* BSTIterator i = new BSTIterator(root);
* while (i.hasNext()) v[f()] = i.next();
*/