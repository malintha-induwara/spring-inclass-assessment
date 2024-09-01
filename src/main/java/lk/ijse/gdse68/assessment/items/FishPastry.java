package lk.ijse.gdse68.assessment.items;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry implements BakeryItems{
    @Override
    public void preference() {
        System.out.println("Fish Pastry");
    }
}

