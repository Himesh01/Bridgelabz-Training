package lambdaExpression.smartHomeLightingAutomation;

public class SmartHomeLighting {
	public static void main(String [] args) {
		SmartLightController controller = new SmartLightController();
		
		LightAction motionTrigger = () ->
			System.out.println("Light ON full brightness (Motion detected");
		
		LightAction eveningTrigger =() ->
			System.out.println("Warm lights ON at 40% brightness");
		
		LightAction voiceTrigger = () ->
			System.out.println("Voice command: Party mode activated");
			
			controller.execute(motionTrigger);
			controller.execute(eveningTrigger);
			controller.execute(voiceTrigger);
	}
}
