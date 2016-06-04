/**
 * 
 */


import java.lang.reflect.Field;

import com.iamVip.getJSON.logic.model.Clientele;

/**
 * @author Colin
 *
 */
public class Class_Invoke {

	/**
	 * 
	 */
	public Class_Invoke() {
	}

	public static void main(String[] args) {

		String line = "\r\n-----------------------------------------";

		Object obj = new Clientele();
		Class<?> cls = obj.getClass();
		Field[] fields = cls.getDeclaredFields();

		System.out.println(line);
		for (Field field : fields) {
			String f = field.getName();
			System.out.print(f + ", ");
		}

		System.out.println(line);
		for (Field field : fields) {
			String f = field.getName();
			System.out.print("#{" + f + "}, ");
		}

		System.out.println(line);
		for (Field field : fields) {
			String f = field.getName();
			System.out.print("#{item." + f + "}, ");
		}

		System.out.println(line);
		for (Field field : fields) {
			String f = field.getName();
			System.out.println("\t\t\t<if test=\"" + f + " != null and " + f + " != ''\"> AND " + f + " = #{" + f + "} </if>");
		}

	}

}
