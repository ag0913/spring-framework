package org.springframework;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {

	/**
	 *
	 * @param context 能用的上下文
	 * @param metadata 注解所在位置的注解信息
	 * @return
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		ClassLoader classLoader = context.getClassLoader();
		BeanDefinitionRegistry registry = context.getRegistry();

		Environment environment = context.getEnvironment();

		String property = environment.getProperty("os.name");

		if (property.equals("Windows")) {
			return true;
		}

		return false;
	}
}
