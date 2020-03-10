

public class BstGwTest {

  private static Bst<Integer> bst;
  private static int val;
  
  public static void setUpFixture()
  {
    bst = new Bst<Integer>();
    val = 42;
  }


  public void e_Add()
  {
    System.out.println( "e_Add" );
    bst.add(val);
    boolean expected = true;
    boolean result = bst.containValue(val);
    assert result == expected:" Not faound after add";
  }


  public void e_DispalyTree()
  {
    System.out.println( "e_DispalyTree" );
    // throw new RuntimeException( "e_DispalyTree is not implemented yet!" );
  }


  public void e_DisplayTree()
  {
    System.out.println( "e_DisplayTree" );
    // throw new RuntimeException( "e_DisplayTree is not implemented yet!" );
  }


  public void e_FindValue()
  {
    System.out.println( "e_FindValue" );
    // throw new RuntimeException( "e_FindValue is not implemented yet!" );
  }


  public void v_Added()
  {
    System.out.println( "v_Added" );
    System.out.println( "val = " + val );
    boolean expected = true;
    boolean result = bst.containValue(val);
    System.out.println(result == expected);
    assert result == expected:" Not faound after add";
  }


  public void v_DisplayedTree()
  {
    System.out.println( "v_DisplayedTree" );
    // throw new RuntimeException( "v_DisplayedTree is not implemented yet!" );
  }


  public void v_Found()
  {
    System.out.println( "v_Found" );
    // throw new RuntimeException( "v_Found is not implemented yet!" );
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
    bstGwTest.e_Add();
    bstGwTest.v_Added();
 }

}

