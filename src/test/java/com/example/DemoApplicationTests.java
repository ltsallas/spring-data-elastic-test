package com.example;


import com.example.repositories.ChildRepository;
import com.example.repositories.ParentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/parent-child-entity.xml")
public class DemoApplicationTests {


	@Autowired
	ApplicationContext context;

	@Autowired
	ParentRepository parentRepository;

	@Autowired
	ChildRepository childRepository;

	@Test
	public void contextLoads() {
		int a = 1;
	}

}
