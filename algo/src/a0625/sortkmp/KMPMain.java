package a0625.sortkmp;

import java.util.*;

public class KMPMain {
	public static void main(String[] args) {
		String T="ABABABABCABABACA";
		String P= 		  "ABABACA";
		int[] F=new int[P.length()];// LPS(Longest Prefix which is also Suffix)
		for(int t=1, p=0; t<P.length(); t++) {
			while(p>0 && P.charAt(t)!=P.charAt(p)) p=F[p-1]; // 다시 맞춰 나간다.
			if(P.charAt(t)==P.charAt(p)) F[t]=++p;
		}
		System.out.println(Arrays.toString(F));
		
		List<Integer> ans=new ArrayList<>();
		for(int t=0, p=0; t<T.length(); t++) {
			while(p>0 && T.charAt(t)!=P.charAt(p)) p=F[p-1];
			if(T.charAt(t)==P.charAt(p)) {
				if(p==P.length()-1) { // 찾았을 때
					ans.add(t-p);
					p=F[p];
				} else {// 못 찾았을때
					++p;
				}
			}
		}
		System.out.println(ans.size()); // 패턴이 몇 개 맞는지를 체크
		System.out.println(ans);
	}
}
