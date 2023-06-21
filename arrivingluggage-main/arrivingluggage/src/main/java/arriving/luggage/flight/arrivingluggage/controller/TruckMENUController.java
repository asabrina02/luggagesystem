package arriving.luggage.flight.arrivingluggage.controller;

import java.util.List;
import java.util.Arrays;
import java.util.Map;


import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;


import arriving.luggage.flight.arrivingluggage.model.Truck;

@Controller
public class TruckMENUController
{
private String defaultURI = "http://localhost:8080/arriving/api/trucks";
	
	@GetMapping("/truck/list")
	public String getTruck(Model model)
	{
		//the URI to GET luggage
		String uri = "http://localhost:8080/arriving/api/trucks";
		
		// GEt a list order types fro, the web services
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Truck[]> response = restTemplate.getForEntity(uri, Truck[].class);
		
		//parse JSON data to array of object
		Truck trucks[] = response.getBody();
		
		// parse an array to a list object
		List<Truck> truckList = Arrays.asList(trucks);
		
		// Attach a list to model as attribute
		
		model.addAttribute("trucks", truckList);
		
		return "truck";
		
	}
	
	/**
	 * This method will update or add truck
	 * 
	 * @param trucks
	 * @return
	 */
	
	@RequestMapping("/truck/save")
	public String updateTruck(@ModelAttribute Truck truck)
	{
		// Create a new RestTemplate
				RestTemplate restTemplate = new RestTemplate();
				
				// Create request body
				HttpEntity<Truck> request =new HttpEntity<Truck>(truck);
				
				String truckResponse = " ";
				
				if (truck.getTruckId() > 0)
				{
					// This block update an new truck id and
					
					// Send request as PUT
					restTemplate.put(defaultURI, request, Truck.class);
				}
				else
				{
					// This block add a new truck
					
					// send request as POST
					truckResponse = restTemplate.postForObject(
							defaultURI, request, String.class);
				}
				
				System.out.println(truckResponse);
				
				// Redirect request to display a list of truck
				return "redirect:/truck/list";
	}
	
	/**
	 * This method gets an truck
	 * 
	 * @param TruckId
	 * @param model
	 * @return
	 */
	@GetMapping("/truck/{TruckId}")
	public String getTruck (@PathVariable Integer TruckId, Model model) {
		
		String pageTitle = "New Truck";
		Truck truck = new Truck();
		
		// This block get luggage to be updated
		if (TruckId > 0) {

			// Generate new URI and append LuggageId to it
			String uri = defaultURI + "/" + TruckId;
			
			// Get an order type from the web service
			RestTemplate restTemplate = new RestTemplate();
			truck = restTemplate.getForObject(uri, Truck.class);
			
			//Give a new title to the page
			pageTitle = "Edit Truck";
		}
		
		// Attach value to pass to front end
		
		model.addAttribute("trucks", truck);
		model.addAttribute("pageTitle", pageTitle);
		
		return "truckinfo";
			
	}
	
	/**
	 * This method deletes an truck
	 * 
	 * @param TruckId
	 * @return
	 */
	@RequestMapping("/truck/delete/{TruckId}")
	public String deleteTruck(@PathVariable Integer TruckId)
	{
		// Generate new URI, similar to the mapping in LuggageRESTController
		String uri = defaultURI + "/{TruckId}";
		
		// Send a DELETE request and attach the value of LuggageId into URI
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(uri, Map.of("TruckId",(TruckId)));
		
		return "redirect:/truck/list";
	}
	
}
