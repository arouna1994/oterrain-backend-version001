package com.connecsen.oterrain.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.modelmapper.ModelMapper;

import com.connecsen.oterrain.domaine.Equipe;
import com.connecsen.oterrain.domaine.Fichier;
import com.connecsen.oterrain.domaine.HomeOne;
import com.connecsen.oterrain.domaine.ListeHeureReserver;
import com.connecsen.oterrain.domaine.Match;
import com.connecsen.oterrain.domaine.Multimedia;
import com.connecsen.oterrain.domaine.Propos;
import com.connecsen.oterrain.domaine.Publicite;
import com.connecsen.oterrain.domaine.Role;
import com.connecsen.oterrain.domaine.Service;
import com.connecsen.oterrain.domaine.Terrain;
import com.connecsen.oterrain.domaine.Tournoi;
import com.connecsen.oterrain.domaine.Utilisateur;
import com.connecsen.oterrain.domaine.dto.request.EquipeDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.FichierDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.HomeOneDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.ListeHeureReserverDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.MatchDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.MultimediaDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.ProposDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.PubDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.RoleDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.ServiceDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.TerrainDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.TournoiDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.UserDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.EquipeDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.FichierDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.HomeOneDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.ListeHeureReserverDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.MatchDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.MultimediaDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.ProposDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.PubDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.RoleDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.ServiceDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.TerrainDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.TournoiDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.UserDtoResponse;

import net.bytebuddy.utility.RandomString;

public final class Utility {
	// CONSTANT POUR LA SECURITE
	public static final long EXPIRATION_TIME =5 * 60 * 60 ;
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final String SECRET = "javainuse";
	public static final String NOTREEMAIL = "sanouarouna90@gmail.com";
	
	// LES URLS D'ACCESS
	
	public static final String ADD_CHOOSEPERIODICDAY_TO_TERRAIN = "/chooseperiodicday/add/terrain/{id}";
	public static final String UPDATE_CHOOSEPERIODICDAY = "/chooseperiodicday/update";
	public static final String GET_CHOOSEPERIODICDAY_BY_ID = "/chooseperiodicday/chooseperiodicdays/{id}";
	public static final String DELETE_CHOOSEPERIODICDAY_BY_ID = "/chooseperiodicday/chooseperiodicdays/delete/{id}";
	public static final String GET_ALL_CHOOSEPERIODICDAYS = "/chooseperiodicday/chooseperiodicdays";
	
	
	public static final String ADD_MULTIMEDIA = "/multimedia/add";
	public static final String UPDATE_MULTIMEDIA = "/multimedia/update";
	public static final String GET_MULTIMEDIA_BY_ID = "/multimedia/multimedias/{id}";
	public static final String DELETE_MULTIMEDIA_BY_ID = "/multimedia/multimedias/delete/{id}";
	public static final String GET_ALL_MULTIMEDIAS = "/multimedia/multimedias";
	
	public static final String ADD_RESERVATION = "/reservation/add";
	public static final String UPDATE_RESERVATION = "/reservation/update";
	public static final String GET_RESERVATION_BY_ID = "/reservation/reservations/{id}";
	public static final String DELETE_RESERVATION_BY_ID = "/reservation/reservations/delete/{id}";
	public static final String GET_ALL_RESERVATIONS = "/reservation/reservations";
	
	public static final String ADD_PUB = "/pub/add";
	public static final String UPDATE_PUB = "/pub/update";
	public static final String GET_PUB_BY_ID = "/acceuil/pub/pubs/{id}";
	public static final String DELETE_PUB_BY_ID = "/pub/pubs/delete/{id}";
	public static final String GET_ALL_PUBS = "/acceuil/pub/pubs";
	
	public static final String ADD_FICHIER = "/fichier/add";
	public static final String UPDATE_FICHIER = "/fichier/update";
	public static final String GET_FICHIER_BY_ID = "/acceuil/fichier/fichiers/{id}";
	public static final String DELETE_FICHIER_BY_ID = "/fichier/fichiers/delete/{id}";
	public static final String GET_ALL_FICHIERS = "/acceuil/fichier/fichiers";
	
	public static final String ADD_SERVICE = "/service/add";
	public static final String UPDATE_SERVICE = "/service/update";
	public static final String GET_SERVICE_BY_ID = "/acceuil/service/services/{id}";
	public static final String DELETE_SERVICE_BY_ID = "/service/services/delete/{id}";
	public static final String GET_ALL_SERVICES = "/acceuil/service/services";
	
	public static final String ADD_PROPOS = "/propos/add";
	public static final String UPDATE_PROPOS = "/propos/update";
	public static final String GET_PROPOS_BY_ID = "/acceuil/propos/propos/{id}";
	public static final String DELETE_PROPOS_BY_ID = "/propos/propos/delete/{id}";
	public static final String GET_ALL_PROPOS = "/acceuil/propos/propos";
	
	public static final String ADD_HOMEONE = "/homeone/add";
	public static final String UPDATE_HOMEONE = "/homeone/update";
	public static final String GET_HOMEONE_BY_ID = "/acceuil/homeone/homeones/{id}";
	public static final String DELETE_HOMEONE_BY_ID = "/homeone/homeones/delete/{id}";
	public static final String GET_ALL_HOMEONES = "/acceuil/homeone/homeones";
	
	public static final String ADD_EQUIPE_TO_TOURNOI = "/tournoi/add/equipe/{id}";
	public static final String ADD_MATCH_TO_TOURNOI = "/tournoi/add/match/{id}";
	public static final String ADD_TOURNOI = "/tournoi/add";
	public static final String UPDATE_TOURNOI = "/tournoi/update";
	public static final String GET_TOURNOI_BY_ID = "/tournoi/tournois/{id}";
	public static final String GET_TOURNOI_BY_TYPETOURNOI = "/tournoi/tournois/typeTournoi/{typeTournoi}";
	public static final String DELETE_TOURNOI_BY_ID = "/tournoi/tournois/delete/{id}";
	public static final String GET_ALL_TOURNOIS = "/tournoi/tournois";
	public static final String GET_ALL_MATCH_DEJA_JOUER_TOURNOIS_BY_ID = "/tournoi/tournois/matchjouer/{id}";
	public static final String GET_ALL_TOURNOIS_DAY = "/tournoi/tournois/days";
	
	public static final String ADD_MATCH = "/match/add";
	public static final String UPDATE_MATCH = "/match/update";
	public static final String GET_MATCH_BY_ID = "/match/matchs/{id}";
	public static final String DELETE_MATCH_BY_ID = "/match/matchs/delete/{id}";
	public static final String GET_ALL_MATCHS = "/match/matchs";
	public static final String GET_ALL_MATCH_JOUER_OR_NO = "/match/matchs/jouer/{option}";

	
	public static final String ADD_EQUIPE = "/equipe/add";
	public static final String UPDATE_EQUIPE = "/equipe/update";
	public static final String GET_EQUIPE_BY_ID = "/equipe/equipes/{id}";
	public static final String DELETE_EQUIPE_BY_ID = "/equipe/equipes/delete/{id}";
	public static final String GET_ALL_EQUIPES = "/equipe/equipes";
	
	public static final String ADD_TERRAIN = "/terrain/add/{id}";
	public static final String ADD_RESERVATION_TO_TERRAIN = "/terrain/add/reservation/{id}";
	public static final String UPDATE_TERRAIN = "/terrain/update";
	public static final String GET_TERRAIN_BY_ID = "/terrain/terrains/{id}";
	public static final String DELETE_TERRAIN_BY_ID = "/terrain/terrains/delete/{id}";
	public static final String GET_ALL_TERRAINS = "/terrain/terrains";
	public static final String GET_ALL_RESERVATIONS_BY_ID_TERRAIN = "/terrain/reservations";
	
	public static final String ADD_USER = "/user/add";
	public static final String ADD_RESERVATION_TO_USER = "/user/add/reservation/{id}";
	public static final String ADD_RESERVATION_TO_USER_AND_TERRAIN = "/user/add/reservation/user/{idUser}/terrain/{idTerrain}";
	public static final String UPDATE_USER = "/user/update";
	public static final String GET_USER_BY_ID = "/user/users/{id}";
	public static final String DELETE_USER_BY_ID = "/user/users/delete/{id}";
	public static final String GET_ALL_USERS = "/user/users";
	
	public static final String ADD_ROLE = "/user/role/add";
	public static final String UPDATE_ROLE = "/user/role/update";
	public static final String GET_ROLE_BY_ID = "/user/role/roles/{id}";
	public static final String DELETE_ROLE_BY_ID = "/user/role/roles/delete/{id}";
	public static final String GET_ALL_ROLES = "/user/role/roles";
	
	public static final String DO_CONTACTED = "/acceuil/user/contacter";
	public static final String DO_REGISTER = "/user/register";
	public static final String DO_LOGIN = "/user/login";
	public static final String DO_FORGOT_PASSWORD = "/user/forgot";
	public static final String DO_UPDATE_PASSWORD = "/user/updatePassword";
	//GENERATE CALENDAR
	public static int getMonthNumber(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH)+1;
	}
	//GENERATE CALENDAR
	public static Map<String,Integer> getDayChoosed() {
		 Map<String,Integer> map=new HashMap<String,Integer>(); 
		    map.put("lundi",1);  
		    map.put("mardi",2);  
		    map.put("mercredi",3);  
		    map.put("jeudi",4);;
		    map.put("vendredi",5);  
		    map.put("samedi",6);  
		    map.put("dimanche",7);;
		return map;
	}
	//CHECK OBJET IS NULL
	public static boolean checkNull(Object obj) {
		return (obj !=null)? true : false;
	}
	//DATE OF TODAY
	public static String getToday() {
		Date yourDate = new Date();

		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
		String date = DATE_FORMAT.format(yourDate);
		return date;
	}
	//GENERATEUR DE TOKEN POUR RECUPERER LE MOT DE PASSE
	public static String getTokenResetPassword() {
		return RandomString.make(30);
	}
	//LES MAPPERS DTO A DAO PUB
	public static  PubDtoResponse pubConvertToPubDtoResponse( Publicite  pub) {
		ModelMapper modelMapper = new ModelMapper(); 
		PubDtoResponse pubDtoResponse = new  PubDtoResponse() ;
	    return (pub != null)? modelMapper.map(pub,PubDtoResponse.class) : pubDtoResponse;
	}
	public static   Publicite  pubDtoResponseConvertToPub( Publicite pubDtoResponse) {
		ModelMapper modelMapper = new ModelMapper(); 
		Publicite pub = modelMapper.map(pubDtoResponse,Publicite.class);
	    return pub;
	}
	public static  Publicite  pubDtoRequestConvertToPub(PubDtoRequest pubDtoRequest)  {
		ModelMapper modelMapper = new ModelMapper();
		Publicite pub = modelMapper.map(pubDtoRequest,  Publicite.class);
	    return pub;
	}
	
			//LES MAPPERS DTO A DAO MULTIMEDIA
			public static  MultimediaDtoResponse multimediaConvertToMultimediaDtoResponse( Multimedia  multimedia) {
				ModelMapper modelMapper = new ModelMapper(); 
				MultimediaDtoResponse multimediaDtoResponse = new  MultimediaDtoResponse() ;
			    return (multimedia != null)? modelMapper.map(multimedia,MultimediaDtoResponse.class) : multimediaDtoResponse;
			}
			public static   Multimedia  multimediaDtoResponseConvertToMultimedia( Multimedia multimediaDtoResponse) {
				ModelMapper modelMapper = new ModelMapper(); 
				Multimedia multimedia = modelMapper.map(multimediaDtoResponse,Multimedia.class);
			    return multimedia;
			}
			public static  Multimedia  multimediaDtoRequestConvertToMultimedia(MultimediaDtoRequest multimediaDtoRequest)  {
				ModelMapper modelMapper = new ModelMapper();
				Multimedia multimedia = modelMapper.map(multimediaDtoRequest,  Multimedia.class);
			    return multimedia;
			}
	
	
		//LES MAPPERS DTO A DAO  ListeHeureReserver
				public static  ListeHeureReserverDtoResponse listeHeureReserverConvertToListeHeureReserverDtoResponse(  ListeHeureReserver  listeHeureReserver) {
					ModelMapper modelMapper = new ModelMapper(); 
					 ListeHeureReserverDtoResponse listeHeureReserverDtoResponse = new  ListeHeureReserverDtoResponse() ;
				    return (listeHeureReserver != null)? modelMapper.map(listeHeureReserver, ListeHeureReserverDtoResponse.class) : listeHeureReserverDtoResponse;
				}
				public static    ListeHeureReserver  listeHeureReserverDtoResponseConvertToListeHeureReserver(  ListeHeureReserver listeHeureReserverDtoResponse) {
					ModelMapper modelMapper = new ModelMapper(); 
					 ListeHeureReserver listeHeureReserver = modelMapper.map(listeHeureReserverDtoResponse, ListeHeureReserver.class);
				    return listeHeureReserver;
				}
				public static   ListeHeureReserver  listeHeureReserverDtoRequestConvertToListeHeureReserver( ListeHeureReserverDtoRequest listeHeureReserverDtoRequest)  {
					ModelMapper modelMapper = new ModelMapper();
					 ListeHeureReserver listeHeureReserver = modelMapper.map(listeHeureReserverDtoRequest, ListeHeureReserver.class);
				    return listeHeureReserver;
				}

	
	//LES MAPPERS DTO A DAO HOMEONE
	public static  HomeOneDtoResponse homeOneConvertToHomeOneDtoResponse( HomeOne  homeOne) {
		ModelMapper modelMapper = new ModelMapper(); 
		HomeOneDtoResponse homeOneDtoResponse = new  HomeOneDtoResponse() ;
	    return (homeOne != null)? modelMapper.map(homeOne,HomeOneDtoResponse.class) : homeOneDtoResponse;
	}
	public static   HomeOne  homeOneDtoResponseConvertToHomeOne( HomeOneDtoResponse homeOneDtoResponse) {
		ModelMapper modelMapper = new ModelMapper(); 
		HomeOne homeOne = modelMapper.map(homeOneDtoResponse,HomeOne.class);
	    return homeOne;
	}
	public static  HomeOne  homeOneDtoRequestConvertToHomeOne(HomeOneDtoRequest homeOneDtoRequest)  {
		ModelMapper modelMapper = new ModelMapper();
		HomeOne homeOne = modelMapper.map(homeOneDtoRequest,  HomeOne.class);
	    return homeOne;
	}

	//LES MAPPERS DTO A DAO PROPOS
	public static  ProposDtoResponse proposConvertToProposDtoResponse( Propos  propos) {
		ModelMapper modelMapper = new ModelMapper(); 
		ProposDtoResponse proposDtoResponse = new  ProposDtoResponse() ;
	    return (propos != null)? modelMapper.map(propos,ProposDtoResponse.class) : proposDtoResponse;
	}
	public static   Propos  proposDtoResponseConvertToPropos( ProposDtoResponse proposDtoResponse) {
		ModelMapper modelMapper = new ModelMapper(); 
		Propos propos = modelMapper.map(proposDtoResponse,Propos.class);
	    return propos;
	}
	public static  Propos  proposDtoRequestConvertToPropos(ProposDtoRequest proposDtoRequest)  {
		ModelMapper modelMapper = new ModelMapper();
		Propos propos = modelMapper.map(proposDtoRequest,  Propos.class);
	    return propos;
	}
	
	//LES MAPPERS DTO A DAO SERVICE
		public static  ServiceDtoResponse serviceConvertToServiceDtoResponse( Service  service) {
			ModelMapper modelMapper = new ModelMapper(); 
			ServiceDtoResponse serviceDtoResponse = new  ServiceDtoResponse() ;
		    return (service != null)? modelMapper.map(service,ServiceDtoResponse.class) : serviceDtoResponse;
		}
		public static   Service serviceDtoResponseConvertToService( ServiceDtoResponse serviceDtoResponse) {
			ModelMapper modelMapper = new ModelMapper(); 
			Service service = modelMapper.map(serviceDtoResponse,Service.class);
		    return service;
		}
		public static  Service  serviceDtoRequestConvertToService(ServiceDtoRequest serviceDtoRequest)  {
			ModelMapper modelMapper = new ModelMapper();
			Service service = modelMapper.map(serviceDtoRequest,Service.class);
		    return service;
		}
		
		//LES MAPPERS DTO A DAO FICHIER
				public static  FichierDtoResponse fichierConvertToFichierDtoResponse( Fichier  fichier) {
					ModelMapper modelMapper = new ModelMapper(); 
					FichierDtoResponse fichierDtoResponse = new  FichierDtoResponse() ;
				    return (fichier != null)? modelMapper.map(fichier,FichierDtoResponse.class) : fichierDtoResponse;
				}
				public static   Fichier fichierDtoResponseConvertToFichier( FichierDtoResponse fichierDtoResponse) {
					ModelMapper modelMapper = new ModelMapper(); 
					Fichier fichier = modelMapper.map(fichierDtoResponse,Fichier.class);
				    return fichier;
				}
				public static  Fichier  fichierDtoRequestConvertToFichier(FichierDtoRequest fichierDtoRequest)  {
					ModelMapper modelMapper = new ModelMapper();
					Fichier fichier = modelMapper.map(fichierDtoRequest,Fichier.class);
				    return fichier;
				}
		
	//LES MAPPERS DTO A DAO MATCH
			public static  MatchDtoResponse matchConvertToMatchDtoResponse( Match  match) {
				ModelMapper modelMapper = new ModelMapper(); 
				 MatchDtoResponse matchDtoResponse = new  MatchDtoResponse() ;
			    return (match != null)? modelMapper.map(match,MatchDtoResponse.class) : matchDtoResponse;
			}
			public static   Match  MatchDtoResponseConvertToMatch( MatchDtoResponse matchDtoResponse) {
				ModelMapper modelMapper = new ModelMapper(); 
				 Match match = modelMapper.map(matchDtoResponse,Match.class);
			    return match;
			}
			public static  Match  MatchDtoRequestConvertToMatch(MatchDtoRequest matchDtoRequest)  {
				ModelMapper modelMapper = new ModelMapper();
				 Match match = modelMapper.map(matchDtoRequest,  Match.class);
			    return match;
			}
	
	
	//LES MAPPERS DTO A DAO ROLE
		public static  RoleDtoResponse roleConvertToRoleDtoResponse(Role role) {
			ModelMapper modelMapper = new ModelMapper(); 
			RoleDtoResponse roleDtoResponse = new RoleDtoResponse() ;
		    return (role != null)? modelMapper.map(role, RoleDtoResponse.class) : roleDtoResponse;
		}
		public static  Role RoleDtoResponseConvertToRole(RoleDtoResponse roleDtoResponse) {
			ModelMapper modelMapper = new ModelMapper(); 
			Role role = modelMapper.map(roleDtoResponse, Role.class);
		    return role;
		}
		public static Role RoleDtoRequestConvertToRole(RoleDtoRequest roleDtoRequest)  {
			ModelMapper modelMapper = new ModelMapper();
			Role role = modelMapper.map(roleDtoRequest, Role.class);
		    return role;
		}


	//LES MAPPERS DTO A DAO USER
	public static  UserDtoResponse utilisateurConvertToUserDtoResponse(Utilisateur utilisateur) {
		ModelMapper modelMapper = new ModelMapper(); 
		UserDtoResponse userDtoResponse = new UserDtoResponse() ;
	    return (utilisateur != null)? modelMapper.map(utilisateur, UserDtoResponse.class) : userDtoResponse;
	}
	public static  Utilisateur userDtoResponseConvertToUtilisateur(UserDtoResponse userDtoResponse) {
		ModelMapper modelMapper = new ModelMapper(); 
		Utilisateur utilisateur = modelMapper.map(userDtoResponse, Utilisateur.class);
	    return utilisateur;
	}
	public static Utilisateur userDtoRequestConvertToUtilisateur(UserDtoRequest userDtoRequest)  {
		ModelMapper modelMapper = new ModelMapper();
		Utilisateur utilisateur = modelMapper.map(userDtoRequest, Utilisateur.class);
	    return utilisateur;
	}
	
	//LES MAPPERS DTO A DAO TERRAIN
		public static  TerrainDtoResponse terrainConvertToTerrainDtoResponse(Terrain terrainDtoRequest) {
			ModelMapper modelMapper = new ModelMapper(); 
			TerrainDtoResponse terrainDtoResponse = new TerrainDtoResponse() ;
		    return (terrainDtoRequest != null)? modelMapper.map(terrainDtoRequest, TerrainDtoResponse.class) : terrainDtoResponse;
		}
		public static  Terrain terrainDtoResponseConvertToTerrain(TerrainDtoResponse terrainDtoResponse) {
			ModelMapper modelMapper = new ModelMapper(); 
			Terrain terrain = modelMapper.map(terrainDtoResponse, Terrain.class);
		    return terrain;
		}
		public static Terrain terrainDtoRequestConvertToTerrain(TerrainDtoRequest terrainDtoRequest)  {
			ModelMapper modelMapper = new ModelMapper();
			Terrain terrain = modelMapper.map(terrainDtoRequest, Terrain.class);
		    return terrain;
		}
		
		//LES MAPPERS DTO A DAO TOURNOI
				public static  TournoiDtoResponse tournoiConvertToTournoiDtoResponse(Tournoi tournoiDtoRequest) {
					
					ModelMapper modelMapper = new ModelMapper(); 
					TournoiDtoResponse tournoiDtoResponse = new TournoiDtoResponse() ;
				    return (tournoiDtoRequest != null)? modelMapper.map(tournoiDtoRequest, TournoiDtoResponse.class) : tournoiDtoResponse;
				}
				public static  Tournoi tournoiDtoResponseConvertToTournoi(TournoiDtoResponse tournoiDtoResponse) {
					ModelMapper modelMapper = new ModelMapper(); 
					Tournoi tournoi = modelMapper.map(tournoiDtoResponse, Tournoi.class);
				    return tournoi;
				}
				public static Tournoi tournoiDtoRequestConvertToTournoi(TournoiDtoRequest tournoiDtoRequest)  {
					ModelMapper modelMapper = new ModelMapper();
					Tournoi terrain = modelMapper.map(tournoiDtoRequest, Tournoi.class);
				    return terrain;
				}
				//LES MAPPERS DTO A DAO EQUIPE
				public static  EquipeDtoResponse equipeConvertToEquipeDtoResponse(Equipe equipeDtoRequest) {
					ModelMapper modelMapper = new ModelMapper(); 
					EquipeDtoResponse tournoiDtoResponse = new EquipeDtoResponse() ;
				    return (equipeDtoRequest != null)? modelMapper.map(equipeDtoRequest, EquipeDtoResponse.class) : tournoiDtoResponse;
				}
				public static  Equipe equipeDtoResponseConvertToEquipe(EquipeDtoResponse equipeDtoResponse) {
					ModelMapper modelMapper = new ModelMapper(); 
					Equipe equipe = modelMapper.map(equipeDtoResponse, Equipe.class);
				    return equipe;
				}
				public static Equipe equipeDtoRequestConvertToEquipe(EquipeDtoRequest equipeDtoRequest)  {
					ModelMapper modelMapper = new ModelMapper();
					Equipe equipe = modelMapper.map(equipeDtoRequest, Equipe.class);
				    return equipe;
				}

}
