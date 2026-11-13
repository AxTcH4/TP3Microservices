package com.example.dao;

import com.example.config.AppConfig;
import com.example.metier.IMetier;
import junit.framework.TestCase;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OcpSelectionTest extends TestCase {
        @Test
        public void testDaoImplParDefaut() {
            AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(AppConfig.class);
            IMetier metier = context.getBean(IMetier.class);

            // Si dao.target=dao, le résultat doit être 200.0
            assertEquals(200.0, metier.calcul(), 0.001);

            context.close();
        }
    }