package carTest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Car {
    String make;
    int year;
    int topSpeed;

//    @Override
//    public String toString() {
//        return "Car{" +
//                "make='" + make + '\'' +
//                ", year=" + year +
//                ", topSpeed=" + topSpeed +
//                '}';
//    }
}
