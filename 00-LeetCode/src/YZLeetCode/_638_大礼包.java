package YZLeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _638_大礼包 {
	 private List<Integer> global_needs;
	    private List<List<Integer>> global_special;
	    private List<Integer> global_price;
	    private int sum = 0;
	    private int res = Integer.MAX_VALUE;

	    
	    
	    
	    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
	    	Map<List<Integer>, Integer> map = new HashMap<>();
	    	
	    	return shopping(price, special, needs, map);
	    	
	    }
	    
	    public int  shopping(List<Integer> price, List<List<Integer>> special, List<Integer> needs,Map<List<Integer>, Integer> map) {
			if (map.containsKey(needs)) {
				return map.get(needs);
			}
			
			
	    	
	    	return 1;
		}
	    
	    public int dot(List<Integer> a,List<Integer>b) {
			int sum = 0;
			for (int i = 0; i < a.size(); i++) {
				sum+= a.get(i) * b.get(i);
			}
			return sum;
		}
	    
	    
	    
	    
	    
	    public int shoppingOffers2(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
	        //给全局变量赋值(引用传递)
	        global_needs = needs;
	        global_special = special;
	        global_price = price;
	        find(0);
	        return res;
	    }

	    private void find(int begin) {
	        // 没有显式的递归终止

	        //备份sum值
	        int temp_sum = sum;
	        // 把global_needs中的物品依次用 单价购买 的形式 补齐
	        for (int i = 0; i < global_needs.size(); ++i)
	            sum += global_needs.get(i) * global_price.get(i);
	        //res取最小值
	        res = Math.min(res, sum);
	        //从备份中恢复sum值
	        sum = temp_sum;
	        //以入参begin为起点，遍历global_special
	        for (int i = begin; i < global_special.size(); ++i) {
	            //给当前大礼包 取的变量名，不然看的费劲
	            List<Integer> cur_special = global_special.get(i);
	            //global_needs中的物品 最多需要几个当前的大礼包
	            int special_num = cal_special_num(cur_special);
	            //所需要的大礼包 数量不为0时
	            if (special_num != 0) {
	                //根据 当前大礼包所需的数量，for循环 + 递归调用
	                for (int j = 1; j <= special_num; ++j) {
	                    //备份当前global_needs
	                    List<Integer> temp_needs = new ArrayList<>(global_needs);
	                    //修改global_needs的所需物品个数
	                    for (int k = 0; k < global_needs.size(); ++k)
	                        global_needs.set(k, global_needs.get(k) - cur_special.get(k) * j);
	                    //算账(+ 大礼包单价 × 大礼包数量)
	                    sum += cur_special.get(global_needs.size()) * j;
	                    //递归调用
	                    find(i + 1);
	                    //从备份中恢复global_needs
	                    global_needs = temp_needs;
	                    //从备份中恢复sum
	                    sum = temp_sum;
	                }
	            }
	        }
	    }

	    //入参item：指大礼包
	    //计算global_needs中的物品，最多需要几个 当前大礼包
	    private int cal_special_num(List<Integer> item) {
	        //max初始化为 Integer的最大值
	        int max = Integer.MAX_VALUE;
	        for (int i = 0; i < global_needs.size(); ++i) {
	            //global_needs中 当前下标的所需物品个数 < 大礼包中当前下标的物品个数，直接return 0
	            //不能超出待购清单的物品个数
	            if (global_needs.get(i) < item.get(i))
	                return 0;
	            //防止除数为0，抛出异常
	            if (item.get(i) != 0)
	                max = Math.min(global_needs.get(i) / item.get(i), max);
	        }
	        return max;
	    }


}
