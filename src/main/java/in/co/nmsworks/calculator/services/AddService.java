package in.co.nmsworks.calculator.services;

import in.co.nmsworks.calculator.Computable;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class AddService implements Computable {
    @Override
    public int compute(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
