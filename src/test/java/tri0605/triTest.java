package tri0605;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class triTest {
	 triCheck tri = null;
	@Before
	public void Before() {
		tri = new triCheck();
	}
	@Test
	public void fullTri() {
		String ans = "";
		try{
			ans = tri.triangleCheck(4, 4, 4);
		}catch(Exception e) {
			System.out.println(e.getMessage().toString());
		}
		assertEquals("正三角形",ans);
	}
	@Test
	public void RightTri() {
		String ans = "";
		try{
			ans = tri.triangleCheck(3, 4, 5);
		}catch(Exception e) {
			System.out.println(e.getMessage().toString());
		}
		assertEquals("直角三角形",ans);
	}
	@Test
	public void IsoTri() {
		String ans = "";
		try{
			ans = tri.triangleCheck(3, 3, 4);
		}catch(Exception e) {
			System.out.println(e.getMessage().toString());
		}
		assertEquals("等腰三角形",ans);
	}
	@Test
	public void Tri() {
		String ans = "";
		try{
			ans = tri.triangleCheck(3, 2, 4);
		}catch(Exception e) {
			System.out.println(e.getMessage().toString());
		}
		assertEquals("三角形",ans);
	}
	@Test(expected = Exception.class)
		public void triExceptionTest() throws Exception {
		tri.triangleCheck(1, 2, 3);
	}
	@After
	public void After() {
		tri = null;
	}
}
