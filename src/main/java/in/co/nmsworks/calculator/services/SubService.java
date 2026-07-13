package in.co.nmsworks.calculator.services;

import in.co.nmsworks.calculator.Computable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class SubService implements Computable {
    @Override
    public int compute(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
}
