import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BstGwTest {

  private static Bst<Integer> bst;
  private static ArrayList<Integer> lstNodes;
  private static ArrayList<Integer> valArray;
  private static ArrayList<Integer> addedValsArray;
  private static int currentAddedValueIndex;
  private static int currentSearchedValueIndex;
  private static boolean bResult;
  
  public static void setUpFixture()
  {
    bst = new Bst<Integer>();
    lstNodes = new ArrayList<Integer>();
    addedValsArray = new ArrayList<Integer>();
    valArray = new ArrayList<Integer>(Arrays.asList(1, 4, 7, 12, 13, 28, 72));
    currentAddedValueIndex = 0;
    currentSearchedValueIndex = 0;
  }


  public void e_AddNode()
  {
    System.out.println( "e_AddNode" );
    currentAddedValueIndex = new Random().nextInt(valArray.size());
    System.out.println( "Adding value: " + valArray.get(currentAddedValueIndex) );
    bst.add(valArray.get(currentAddedValueIndex));
    addedValsArray.add(valArray.get(currentAddedValueIndex));
  }


    public void e_SetTreeNodesList()
  {
    System.out.println( "e_SetTreeNodesList" );
    lstNodes = bst.listTreeNodes();
    // throw new RuntimeException( "e_DisplayTree is not implemented yet!" );
  }


  public void e_FindValue()
  {
    System.out.println( "e_FindValue" );
    currentSearchedValueIndex = new Random().nextInt(addedValsArray.size());
    System.out.println( "Looking for value: " + addedValsArray.get(currentSearchedValueIndex) );
    bResult = bst.containValue(addedValsArray.get(currentSearchedValueIndex));
  }


  public void v_NodeAdded()
  {
    System.out.println( "v_NodeAdded" );
    boolean expected = true;
    boolean result = bst.containValue(valArray.get(currentAddedValueIndex));
    assert result == expected:" Value not faound after it was added";
  }


  public void v_TreeNodesList()
  {
    System.out.println( "v_TreeNodesList" );
    System.out.println(lstNodes);
    // throw new RuntimeException( "v_DisplayedTree is not implemented yet!" );
  }


  public void v_ValueFound()
  {
    System.out.println( "v_ValueFound" );
    boolean expected = true;
    assert bResult == expected:" Value: " + addedValsArray.get(currentSearchedValueIndex) + " not faound!";
  }


  public void v_Start()
  {
    System.out.println( "v_Start" );
    // throw new RuntimeException( "v_Start is not implemented yet!" );
  }


  public static void main(String args[]) 
  {
    BstGwTest bstGwTest = new BstGwTest();
    BstGwTest.setUpFixture();
    for(int i=0;i<50;i++){
      bstGwTest.e_AddNode();
      bstGwTest.v_NodeAdded();
      bstGwTest.e_FindValue();
      bstGwTest.v_ValueFound();
      bstGwTest.e_SetTreeNodesList();
      bstGwTest.v_TreeNodesList();
    }
 }

}

