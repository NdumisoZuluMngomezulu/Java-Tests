import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartHomeTest {

    @Test
    void testEncapsulation_DeviceState() {
        Device device = new Device("Generic Device");

        assertFalse(device.isOn());

        device.turnOn();
        assertTrue(device.isOn());

        device.turnOff();
        assertFalse(device.isOn());
    }

    @Test
    void testInheritance_Light() {
        Light light = new Light("Living Room Light");

        light.setBrightness(75);
        assertEquals(75, light.getBrightness());

        light.turnOn();
        assertTrue(light.isOn());
    }

    @Test
    void testInheritance_Thermostat() {
        Thermostat thermostat = new Thermostat("Main Thermostat");

        thermostat.setTemperature(25.5);
        assertEquals(25.5, thermostat.getTemperature());

        thermostat.turnOn();
        assertTrue(thermostat.isOn());
    }

    @Test
    void testPolymorphism_StatusOverride() {
        Device light = new Light("Bedroom Light");
        light.turnOn();

        Device thermostat = new Thermostat("Hall Thermostat");
        thermostat.turnOn();

        String lightStatus = light.getStatus();
        String thermoStatus = thermostat.getStatus();

        assertTrue(lightStatus.contains("Light"));
        assertTrue(thermoStatus.contains("Thermostat"));
    }

    @Test
    void testComposition_SmartHome() {
        SmartHome home = new SmartHome();

        Light light = new Light("Kitchen Light");
        Thermostat thermostat = new Thermostat("Kitchen Thermostat");

        home.addDevice(light);
        home.addDevice(thermostat);

        assertEquals(2, home.getDevices().size());
    }

    @Test
    void testSmartHome_StatusAggregation() {
        SmartHome home = new SmartHome();

        Light light = new Light("Office Light");
        Thermostat thermostat = new Thermostat("Office Thermostat");

        light.turnOn();
        thermostat.turnOn();

        home.addDevice(light);
        home.addDevice(thermostat);

        String statuses = home.getAllStatuses();

        assertTrue(statuses.contains("Office Light"));
        assertTrue(statuses.contains("Office Thermostat"));
    }
}
