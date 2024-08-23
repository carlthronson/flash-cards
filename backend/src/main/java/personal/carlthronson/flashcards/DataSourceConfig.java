package personal.carlthronson.flashcards;

import java.util.logging.Logger;

import javax.sql.DataSource;

// hello

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

  Logger logger = Logger.getLogger(DataSourceConfig.class.getName());

  @Bean
  public DataSource getDataSource() {
    logger.info("getDataSource");
    String url = "jdbc:postgresql://localhost:5432/postgres";
    DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
    dataSourceBuilder.driverClassName("org.postgresql.Driver");
    dataSourceBuilder.url(url);
    logger.info("url: " + url);
    var dataSource = dataSourceBuilder.build();
    logger.info(dataSource.toString());
    return dataSource;
  }
}
