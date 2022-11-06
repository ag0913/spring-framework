package org.springframework.selftag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String id = element.getAttribute("id");
		String username = element.getAttribute("username");
		String age = element.getAttribute("age");
		String level = element.getAttribute("level");

		// StringUtils.hasText():如果字符序列不为 null 值,并且字符序列的长度大于 0 ,
		// 并且不含有空白字符序列,则返回 true
		if (StringUtils.hasText(id)) {
			builder.addPropertyValue("id", id);
		}
		if (StringUtils.hasText(username)) {
			builder.addPropertyValue("username", username);
		}
		if (StringUtils.hasText(age)) {
			builder.addPropertyValue("age", age);
		}
		if (StringUtils.hasText(level)) {
			builder.addPropertyValue("level", level);
		}
	}
}
