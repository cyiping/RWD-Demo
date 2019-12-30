package bulletin.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import bulletin.Placard;
import bulletin.data.PlacardDao;

@Controller
@RequestMapping("/placards")
public class PlacardController {

	public static final int DEFAULT_MAX_ID = 99999;

	private PlacardDao placardDao;

	@Autowired
	public PlacardController(PlacardDao placardDao) {
		this.placardDao = placardDao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Placard> placards(@RequestParam(value = "max", defaultValue = "99999") int max) {
		return placardDao.findPlacards(max);
	}

	@RequestMapping(value = "/{placardId}", method = RequestMethod.GET)
	public String placard(@PathVariable("placardId") int placardId, Model model) {
		model.addAttribute(placardDao.findBy(placardId));
		return "placard";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String savePlacard(PlacardForm form, Model model) throws Exception {
		placardDao.save(new Placard(null, form.getMessage(), new Date()));
		return "redirect:/placards";
	}

}
