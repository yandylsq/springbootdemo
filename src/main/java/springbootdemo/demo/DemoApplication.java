�}�)	 o �J�s~��
�]	0���3���~�&���� ������-�~�<p�`��J�Y�U�D`��.֛с]���h,�˧�Z�e7;��S��`��L��G��跚S�Fr�ɹ�`e���ϓ|EѸP��.9h��[��}�s��AeҒ��6P��DQѭ;�)��������|�SO�aП��쫎\��&�G������9p�尌K_��es�h�Mg0��s�7܀^zܟ��#%���eNuҶeJ���5�C���+~����;rbVE�(��R����(���%ҋU��g������m���9�z֓��cr@v$��0�ӀC�군��y��q
`i~S���I�L0����B��*$[��o��{�Ѷ3�q��ECA�&Z�#d	�jLa�+��0mO�cn��ݰy�����|o��#����X�b�;��}�I���%Ɗ��A�����=h��j��X��T*JCN�e���hfp���L�߂rScan 扫描dao层接口
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan("springbootdemo.demo.mapper")
public class DemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

