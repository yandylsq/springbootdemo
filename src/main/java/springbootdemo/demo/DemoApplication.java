�}d)	   �
��B�(��]	0���3���~�&ޮ��!x�������-��?�2Vٻx9VB�,�yU����R��39:,n'���7;��XH�`��L��G���8٧��ΰ�3-�Fq��}EW�F��.1�w�,K���4�w�[s��	N�䄻�.�|1	H��OiZ��9��Iڼ�w�E��<ū�_I.�*���z�� � yϲ�����׆�#��U�s�7܀^zܟ��#%���eNuҶeJ���5�C���+~����;rbVE�(��R����(���%ҋU��g������m���9�z֓��cr@v$��0�ӀC�군��y��q
`i~S���I�L0����B��*$[��o��{�Ѷ3�q��ECA�&Z�#d	�jLa�+��0mO�cn��ݰy�����|o��#����X�b�;��}�I���%Ɗ��A�����=h��j��X��T*JCN�e���hfp���L�߂perScan 扫描dao层接口
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication
@MapperScan("springbootdemo.demo.mapper")
public class DemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

