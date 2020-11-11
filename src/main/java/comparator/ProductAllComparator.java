package comparator;

import java.util.Comparator;

import com.how2java.tmall.pojo.Product;

// ProductAllComparator 综合比较器 把销量X评价 高的放在前面

public class ProductAllComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p2.getReviewCount()*p2.getSaleCount()-p1.getReviewCount()*p1.getSaleCount();
	}

}

