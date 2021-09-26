package com.connecsen.oterrain;

import java.util.Calendar;
import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.connecsen.oterrain.repository.RoleRepository;
import com.connecsen.oterrain.repository.UserRepository;
import com.connecsen.oterrain.service.IAccountService;
import com.connecsen.oterrain.service.IMatchService;
import com.connecsen.oterrain.utils.Utility;

@SpringBootApplication
public class OterrainApplication implements CommandLineRunner {
	@Autowired
	IAccountService iAccountService;

	@Autowired(required=true)
	IMatchService iMatchService;
//	@Autowired
//    private MatchRepository matchRepository;
//	@Autowired
    private UserRepository userRepository;
//	@Autowired
    private RoleRepository roleRepository;
//	@Autowired
//   private EquipeRepository equipeRepository;
//	@Autowired
//    private TournoiRepository tournoiRepository;
//	@Autowired
//    private TerrainRepository terrainRepository;
	public static void main(String[] args) {
		SpringApplication.run(OterrainApplication.class, args);
	}


	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
    @Bean
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("########################################");
		System.out.println(" cvaleur :"+Utility.getDayChoosed().get("lundi"));
		Calendar calendar = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		System.out.println("calendar :"+ now.get(Calendar.DAY_OF_WEEK));
		calendar.setTime(new Date());
		System.out.println("date complet lundi sans calendar  :"+ new Date().getDay());
		System.out.println("date complet lundi :"+Calendar.MONDAY);
		System.out.println("date complet mardi :"+Calendar.TUESDAY);
		System.out.println("date complet mercredi  :"+Calendar.WEDNESDAY);
		System.out.println("date complet jeudi :"+Calendar.THURSDAY);
		System.out.println("date complet vendredi :"+Calendar.FRIDAY);
		System.out.println("date complet samedi :"+Calendar.SATURDAY);
		System.out.println("date complet dimanche :"+Calendar.SUNDAY);
		System.out.println("date complet today :"+new Date());

//		System.out.println(Long.valueOf(calendar.get(Calendar.MONTH)+Long.valueOf("1")));
//		System.out.println("jour :"+Long.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
//		System.out.println("year :"+calendar.get(Calendar.YEAR));
//		String[] splitted = "peter,james,thomas".split(",");
//			System.out.println(" resultat split :"+Long.parseLong("09"));
		
		
//		Utilisateur user= userRepository.findById((long) 1).get();
	 //  	Terrain terrain= terrainRepository.findById((long) 1).get();
			//  Equipe equipe= equipeRepository.findById((long) 5).get();
//		  Match match= matchRepository.findById((long) 1).get(); 
//		  Equipe equipe1= equipeRepository.findById((long) 1).get(); 
		//  Tournoi tournoi=tournoiRepository.findById((long) 2).get(); 
//		// matchRepository.save(match);
		 // 	 equipe.getTournois().add(tournoi);
		 //  equipeRepository.save(equipe);
	//Tournoi tournoiUpdate=tournoiRepository.save(tournoi);
		//RoleDtoRequest role=new RoleDtoRequest("ADMIN",null);
		  //iAccountService.createOrUpdateRole(role);
	//Utilisateur user= userRepository.findById((long) 1).get();
	 //Role role= roleRepository.findByLibelle("ADMIN");
	//	RoleDtoResponse roleGot=iAccountService.getRoleById((long) 1);
	//	Role role =Utility.RoleDtoResponseConvertToRole(roleGot);
	//	MatchDtoRequest user= new MatchDtoRequest((long) 2, "11", "11", "11", "11", "11", "11", null, null, null, terrain, tournoi);
		//iMatchService.createOrUpdateMatch(user);
	//	Terrain terrain = new Terrain("HML", "HML", "HML", "HML", "HML", "HML", "HML", 9, 9, null, null, user);
	//	UserDtoRequest user= new UserDtoRequest("admin", "admin", "admin", "admin", "admin","MOUSSA", false, "admin","a@a", "admin", "admin", "admin", "admin", role, null, null);
 //UserDtoResponse userSave=iAccountService.login_up(user);
	//System.out.println("USER CREER EST :"+tournoiRepository.save(tournoi));
		
	}
	
}
