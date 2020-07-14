package String;

import java.util.*;

public class StringTest {
    public static void main(String[] args) {
//        String a="abc";
//        String b="abc";
//        System.out.println(a==b);
//        System.out.println(b);

//        String a="abc";
//        a="b";
//        System.out.println(a);

//        String a=new String("abc");
//        a.intern();
//        String b=new String("abc");
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
//        System.out.println(a.toString());
//        System.out.println(b.toString());
//        char ch = '0';
//        ch *= 1.1;
//        System.out.println(ch);

//        List<String> a=new ArrayList<String>();
//        a.add("a");
//        a.add("b");
//        System.out.println(a);
//        a.add(1,"c");
//        System.out.println(a);

//        LinkedList<String> ls=new LinkedList<String>();
//        ls.addFirst("1");
//        ls.addFirst("2");
//        ls.addFirst("3");
//        System.out.println(ls);
//
//        System.out.println(ls.getFirst());
//        System.out.println(ls.getLast());
//
//        System.out.println(ls.removeFirst());
//        System.out.println(ls.removeLast());
//
//        while (!ls.isEmpty()){
//            System.out.println(ls.pop());
//        }
//
//        System.out.println(ls.size());


//        Set<String> set = new LinkedHashSet<String>();
//        set.add("bbb");
//        set.add("aaa");
//        set.add("abc");
//        set.add("bbc");
//        Iterator<String> it = set.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        for(String set1:set){
//            System.out.println(set1);

//        创建Map集合对象
//        HashMap<String, String> map = new HashMap<String, String>();
//        // 添加元素到集合
//        map.put("胡歌", "霍建华");
//        map.put("郭德纲", "于谦");
//        map.put("薛之谦", "大张伟");
//
//        String s = map.get("胡歌");
//        System.out.println(s);
//
//        String put = map.put("胡歌", "chan");
//        System.out.println(put);
//         s = map.get("胡歌");
//        System.out.println(s);

//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + ":" + value);
//        }


//        List<String> list = new ArrayList<String>();
//
//        // 往 尾部添加 指定元素
//        list.add("图图");
//        list.add("小美");
//        list.add("不高兴");
//
//        System.out.println(list);
//        // add(int index,String s) 往指定位置添加
//        list.add(1,"没头脑");
//
//        System.out.println(list);
//        list.set(0,"陈");
//        System.out.println(list);


        int[][] a = {{1, 2, 3}, {2, 3}};
        System.out.println(a.length);
        // 第一行的列数
        System.out.println(a[0].length);
        System.out.println(a[1].length);

        List<String> list = new ArrayList<String>();
        System.out.println(list);
        list.set(0,"陈");
        System.out.println(list);
    }

}
