package nosql-dataaccess.config;

public class config {
    /*

    https://www.tutorialspoint.com/hibernate/hibernate_examples.html

    @Configuration
@EnableMongoRepositories("com.xypro.xs1.nosql.repositories")
@Profile("dev")
public class MongoDBConfig extends AbstractMongoConfiguration {
    @Value("${nosql.database.host}")
    private String hostname;
    @Value("${nosql.database.port}")
    private Integer port;
    @Value("${nosql.database.username}")
    private String username;
    @Value("${nosql.database.password}")
    private String passwordEnc;
    @Value("${nosql.database.database}")
    private String database;
    @Value("${database.pem.filename}")
    private String dbPemFileName;

    @Autowired
    private PasswordPlaceHolder passwordPlaceHolder;

    @Override
    protected String getDatabaseName() {
        return database;
    }

    @Override
    public Mongo mongo() throws Exception{
        ServerAddress serverAddress = new ServerAddress(hostname,port);
        MongoClient mongoClient =  new MongoClient(serverAddress,mongoCredentialsList(),mongoClientOptions());
        return mongoClient;
    }

    public @Bean MongoTemplate mongoTemplate() throws Exception{
        MongoTemplate mongoTemplate = new MongoTemplate(mongo(),database);
        return mongoTemplate;
    }

    private List<MongoCredential> mongoCredentialsList(){
        String password = passwordPlaceHolder.decrypt(dbPemFileName, passwordEnc);

        MongoCredential mongoCredential = MongoCredential.createCredential(username,database,password.toCharArray());
        return Arrays.asList(mongoCredential);
    }

    private MongoClientOptions mongoClientOptions(){
        //Default values should work fine. We can override the values as needed.
        MongoClientOptions.Builder optionsBuilder = new MongoClientOptions.Builder();
        return optionsBuilder.build();
    }
}

    */
}
