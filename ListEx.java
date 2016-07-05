import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class ListEx
{
    public static void main(String arg){
         List lst=new ArrayList();
         lst.add(10);
         lst.add(12.6f);
         lst.add("Hai");
         lst.add(10);
         lst.add('c');
         //System.out.println(lst);

         Iterator itr=lst.iterator();
         while(itr.hasNext()){
              System.out.println(itr.next());
          }
    }
}