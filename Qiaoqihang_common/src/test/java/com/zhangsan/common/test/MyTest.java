package com.zhangsan.common.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.qiaoqihang.common.utils.AssertUtil;

public class MyTest {
	/**
	 * 方法1：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 */
	@Test
	public void test01_01(){
		AssertUtil.isTrue(true,"传入的类型为False");
	}
	@Test
	public void test01_02(){
		AssertUtil.isTrue(false,"传入的类型为False");
	}
	/**
	 * 方法2：断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 */
	@Test
	public void test02_01(){
		AssertUtil.isFalse(false,"传入的类型为true");
	}
	@Test
	public void test02_02(){
		AssertUtil.isFalse(true,"传入的类型为true");
	}
	/**
	 * 方法3：断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。
	 */
	@Test
	public void test03_01(){
		AssertUtil.notNull("","传入的类型为空值");
	}
	@Test
	public void test03_02(){
		AssertUtil.notNull("1","传入的类型为空值");
	}
	/**
	 * 方法4：断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 */
	@Test
	public void test04_01(){
		AssertUtil.isNull("1","传入的类型不为空值");
	}
	@Test
	public void test04_02(){
		AssertUtil.isNull("","传入的类型不为空值");
	}
	/**
	 * 方法5：断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。
	 */
	@Test
	public void test05_01(){
		List<Integer> list= new ArrayList<>();
		
		AssertUtil.notEmpty(list,"传入的集合为空值");
	}
	@Test
	public void test05_02(){
		List<Integer> list= new ArrayList<>();
		list.add(1);
		AssertUtil.notEmpty(list,"传入的集合为空值");
	}
	/**
	 * 方法6：断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。
	 */
	@Test
	public void test06_01(){
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		AssertUtil.notEmpty(map,"传入的集合为空值");
	}
	@Test
	public void test06_02(){
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(1, 1);
		AssertUtil.notEmpty(map,"传入的集合为空值");
	}
	/**
	 * 方法7：断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。
	 */
	@Test
	public void test07_01(){
		AssertUtil.hasText("   ","传入的值去掉空格为空");
	}
	@Test
	public void test07_02(){
		
		AssertUtil.hasText("  1","传入的值去掉空格为空");
	}
	/**
	 * 方法8：断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。
	 */
	@Test
	public void test08_01(){
		BigDecimal bigDecimal = new BigDecimal(5);
		AssertUtil. greaterThanZero(bigDecimal,"传入的数值为负数");
	}
	@Test
	public void test08_02(){
		BigDecimal bigDecimal = new BigDecimal(-10);
		AssertUtil. greaterThanZero(bigDecimal,"传入的数值为负数");
	}
}
