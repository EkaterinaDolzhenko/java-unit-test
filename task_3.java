@RunWith(Parameterized.class) 
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this.result = result;  
  }

  @Parameterized.Parameters  // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
		{17, false},
        {18, true},
        {21, true},
        {22, true},
        
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про 
сообщение об ошибке
    assertEquals("Совершеннолетие пользователя расчитано не верно", 
result, isAdult);
	}
}
