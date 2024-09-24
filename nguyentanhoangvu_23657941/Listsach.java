package nguyentanhoangvu_23657941;
import java.util.ArrayList;
import java.util.List;
public class Listsach {
  List<Sach> ls;
  public Listsach() {
	 ls = new ArrayList<Sach>(2); 
  }
  public boolean themSach(Sach s) {
	  if(ls.contains(s)==true) {
		  return false;
	  }else return ls.add(s);
  }
  public void inKQ() {
	  for (Sach sach : ls) {
		  if(sach!=null) {
			  System.out.println(sach);
		  }
	  }
  }
}
