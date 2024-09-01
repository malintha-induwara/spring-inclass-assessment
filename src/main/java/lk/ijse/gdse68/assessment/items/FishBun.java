package lk.ijse.gdse68.assessment.items;

import org.springframework.stereotype.Component;

@Component
public class FishBun implements BakeryItems{
    @Override
    public void preference() {
        System.out.println("Fish Bun");
    }
}

