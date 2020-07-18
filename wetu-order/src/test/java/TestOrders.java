import com.wetu.Application;
import com.wetu.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestOrders {

    @Autowired
    OrderMapper orderMapper;

    @Test
    public void   aaa (){
        System.out.println(orderMapper.selectAll());
    }
}
