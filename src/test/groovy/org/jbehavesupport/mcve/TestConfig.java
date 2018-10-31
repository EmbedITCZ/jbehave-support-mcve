package org.jbehavesupport.mcve;

import org.jbehavesupport.core.report.XmlReporterFactory;
import org.jbehavesupport.core.report.extension.TestContextXmlReporterExtension;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Bean
    public XmlReporterFactory xmlReporterFactory() {
        return new XmlReporterFactory();
    }

    @Bean
    public TestContextXmlReporterExtension testContextXmlReporterExtension () {
        return new TestContextXmlReporterExtension();
    }
}
