public class Main {
    #include <SoftwareSerial.h>
SoftwareSerial gsm(7, 8); // RX, TX

void setup() {
  gsm.begin(9600);
  Serial.begin(9600);
  delay(1000);

  // Initialize GSM
  gsm.println("AT");
  delay(1000);
  gsm.println("AT+CMGF=1"); // SMS mode
  delay(1000);

  // Send SMS
  gsm.println("AT+CMGS=\"+919876543210\""); // Replace with phone number
  delay(1000);
  gsm.println("Emergency Alert! Need Assistance.");
  delay(100);
  gsm.write(26); // Ctrl+Z to send
}

void loop() {
  // Can be triggered by button or sensor
}

}
