package com.ada.tienda_de_indumentaria.tiendaAdaV1.controller;

import com.ada.tienda_de_indumentaria.tiendaAdaV1.model.*;
import com.ada.tienda_de_indumentaria.tiendaAdaV1.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping (path= "/tienda")
public class MainController {

    // Implement
    @Autowired
    private GarmentRepository garmentRepository;

    @GetMapping(path = "/garment/all")
    public @ResponseBody
    Iterable<Garment> getAllGarment(){
        return  garmentRepository.findAll();
    }

    @GetMapping(path = "/garment/{id_garment}")
    public @ResponseBody
    Optional<Garment> getGarmentById (@PathVariable("id_garment")int id_garment){
    return garmentRepository.findById(id_garment);
    }

    @Autowired
    private StockRepository stockRepository;

    @GetMapping(path = "/stock/all")
    public @ResponseBody
    Iterable<Stock> getAllStock(){
        return  stockRepository.findAll();
    }

    @GetMapping(path = "/stock/{id_stock}")
    public @ResponseBody
    Optional<Stock> getStockById (@PathVariable("id_stock")int id_stock){
        return stockRepository.findById(id_stock);
    }

    @Autowired
    private ResourceRepository resourceRepository;

    @GetMapping(path = "/resource/all")
    public @ResponseBody
    Iterable<Resource> getAllResource(){
        return resourceRepository.findAll();
    }

    @GetMapping(path = "/resource/{id_resource}")
    public @ResponseBody
    Optional<Resource> getResourceById (@PathVariable("id_resource")int id_resource){
        return resourceRepository.findById(id_resource);
    }

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping(path = "/role/all")
    public @ResponseBody
    Iterable<Role> getAllRole(){
        return roleRepository.findAll();
    }

    @GetMapping(path = "/role/{id_role}")
    public @ResponseBody
    Optional<Role> getRoleById (@PathVariable("id_role")int id_role){
        return roleRepository.findById(id_role);
    }

    @GetMapping(path = "/resource/all/role/{roleId} ")
    public @ResponseBody
    Collection<Resource> getAllResourcesByRoleId(@PathVariable("roleId") String roleId){
        return resourceRepository.getResourceByRole(roleId);
    }

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(path = "/person/all")
    public @ResponseBody
    Iterable<Person> getAllPerson(){
        return personRepository.findAll();
    }

    @GetMapping(path = "/person/{id_person}")
    public @ResponseBody
    Optional<Person> getPersonById (@PathVariable("id_person")int id_person){
        return personRepository.findById(id_person);
    }

    @Autowired
    private TurnRepository turnRepository;

    @GetMapping(path = "/turn/all")
    public @ResponseBody
    Iterable<Turn> getAllTurn(){
        return turnRepository.findAll();
    }

    @GetMapping(path = "/turn/{id_turn}")
    public @ResponseBody
    Optional<Turn> getTurnById (@PathVariable("id_turn")int id_turn){
        return turnRepository.findById(id_turn);
    }

    @Autowired
    private Branch_officeRepository branch_officeRepository;

    @GetMapping(path = "/branch_office/all")
    public @ResponseBody
    Iterable<Branch_office> getAllbranch_office(){
        return branch_officeRepository.findAll();
    }

    @GetMapping(path = "/branch_office/{id_branch_office}")
    public @ResponseBody
    Optional<Branch_office> getbranch_officeById (@PathVariable("id_branch_office")int id_branch_office){
        return branch_officeRepository.findById(id_branch_office);
    }

    @Autowired
    private SaleRepository saleRepository;

    @GetMapping(path = "/sale/all")
    public @ResponseBody
    Iterable<Sale> getAllsale(){
        return saleRepository.findAll();
    }

    @GetMapping(path = "/sale/{id_sale}")
    public @ResponseBody
    Optional<Sale> getsaleById (@PathVariable("id_sale")int id_sale){
        return saleRepository.findById(id_sale);
    }

    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping(path = "/ticket/all")
    public @ResponseBody
    Iterable<Ticket> getAllTicket(){
        return ticketRepository.findAll();
    }

    @GetMapping(path = "/ticket/{id_ticket}")
    public @ResponseBody
    Optional<Ticket> getTicketById (@PathVariable("id_ticket")int id_ticket){
        return ticketRepository.findById(id_ticket);
    }

    //============CUSTOM QUERIES

    @GetMapping(path = "/person/like/{id_role}")
    public @ResponseBody
    Iterable<Person> getPersonByRoleLike (@PathVariable("id_role") String id_role){
        return personRepository.getPersonsByRoleLike(id_role);
    }

    @GetMapping(path = "/branch_office/name/like/{name}")
    public @ResponseBody
    Iterable<Branch_office> getBranch_officeByNameLike (@PathVariable("name")String name){
        return branch_officeRepository.getBranch_officeByNameOrAddressLike(name);
    }

    //============CREATE

    @PostMapping(path = "/garment/create", consumes = "application/json", produces = "application/json")
    public Garment  createGarment (@RequestBody Garment  newGarment ) {
        return garmentRepository.save(newGarment);
    }

    @PostMapping(path = "/person/create", consumes = "application/json", produces = "application/json")
    public Person createPerson (@RequestBody Person newPerson) {
        return personRepository.save(newPerson);
    }

    @PostMapping(path = "/resource/create", consumes = "application/json", produces = "application/json")
    public Resource createResource (@RequestBody Resource newResource) {
        return resourceRepository.save(newResource);
    }

    @PostMapping(path = "/role/create", consumes = "application/json", produces = "application/json")
    public Role createRole (@RequestBody Role newRole) {
        return roleRepository.save(newRole);
    }

    @PostMapping(path = "/sale/create", consumes = "application/json", produces = "application/json")
    public Sale createSale (@RequestBody Sale newSale) {
        return saleRepository.save(newSale);
    }

    @PostMapping(path = "/stock/create", consumes = "application/json", produces = "application/json")
    public Stock createStock (@RequestBody Stock newStock) {
        return stockRepository.save(newStock);
    }

    @PostMapping(path = "/ticket/create", consumes = "application/json", produces = "application/json")
    public Ticket createTicket (@RequestBody Ticket newTicket) {
        return ticketRepository.save(newTicket);
    }

    @PostMapping(path = "/turn/create", consumes = "application/json", produces = "application/json")
    public Turn createTurn (@RequestBody Turn newTurn) {
        return turnRepository.save(newTurn);
    }

    //==============UPDATE

    @PutMapping(path = "/branch_office/update")
    public Branch_office updateBranch_office(@RequestBody Branch_office updatedBranch_office){
        return branch_officeRepository.save(updatedBranch_office);
    }

    /*
    @PutMapping(path = "user/{userId}/pilot/updateByRole")
    public ResponseEntity<GeneralResponse> updatePilotByRole(@PathVariable ("userId") String userId, @RequestBody Pilot updatePilot){
        GeneralResponse response = new GeneralResponse();

        try {
            Collection<Role> roles = roleRepository.getRolesByUser(userId);

            for (Role role : roles) {
                if (role.getName().equals("admin") || role.getName().eguals("usuario")) {
                   pilotRepository.save(updatedPilot);
                   response.setCode(200);
                    response.setMessage("El piloto " + updatedPilot.getName() + "Fue actualizado con exito");
                   return ResponseEntity.ok(response);
                }
            }
            response.setCode(401);
            response.setMessage("Acceso denegado");
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            response.setCode(500);
            response.setMessage(e.getlocalizedMessage());
            return ResponseEntity.ok(response);
        }

        return branch_officeRepository.save(updatedBranch_office);
    }
     */

    @PutMapping(path = "/garment/update")
    public Garment updateGarment(@RequestBody Garment updatedGarment){
        return garmentRepository.save(updatedGarment);
    }

    @PutMapping(path = "/person/update")
    public Person updatePerson(@RequestBody Person updatedPerson){
        return personRepository.save(updatedPerson);
    }

    @PutMapping(path = "/resource/update")
    public Resource updateResource(@RequestBody Resource updatedResource){
        return resourceRepository.save(updatedResource);
    }

    @PutMapping(path = "/role/update")
    public Role updateRole(@RequestBody Role updatedRole){
        return roleRepository.save(updatedRole);
    }

    @PutMapping(path = "/sale/update")
    public Sale updateSale(@RequestBody Sale updatedSale){
        return saleRepository.save(updatedSale);
    }

    @PutMapping(path = "/stock/update")
    public Stock updateStock(@RequestBody Stock updatedStock){
        return stockRepository.save(updatedStock);
    }

    @PutMapping(path = "/ticket/update")
    public Ticket updateTicket(@RequestBody Ticket updatedTicket){
        return ticketRepository.save(updatedTicket);
    }

    @PutMapping(path = "/turn/update")
    public Turn updateTurn(@RequestBody Turn updatedTurn){
        return turnRepository.save(updatedTurn);
    }

    //==============DELETE

    @DeleteMapping(path = "/branch_office/delete/{id_branch_office}")
    public @ResponseBody
    Iterable<Branch_office> deleteBranch_officeById (@PathVariable("id_branch_office")int id_branch_office) {
        branch_officeRepository.deleteById(id_branch_office);
        return branch_officeRepository.findAll();
    }

    /*
    @DeleteMapping(path = "/person/{id_person}/base/delete/{id_base}")
    public @ResponseBody
    String deleteBranch_officeById (@PathVariable("id_person")int id_person,@PathVariable("id_branch_office")int id_branch_office) {
       Collection<Role> rolesByUser = roleRepository.getRoleByUser(id_user);

       for (Role role _ rolesByUser) {
        if (role.getName().equals("gerente")){
        branch_officeRepository.deleteById(id_branch_office);
        return "El registro fue eliminado, id: " + id_branch_office;
        }
        }
        return "Usuario no autorizado para borrar registros";
    }
    */

    /*
    @DeleteMapping(path = "/person/{id_person}/base/delete/{id_base}")
    public @ResponseBody
    ResponseEntity<GeneralResponse> deleteBranch_officeById (@PathVariable("id_person")int id_person,@PathVariable("id_branch_office")int id_branch_office) {

    GeneralResponse response = new GeneralResponse();

    try {
    Collection<Role> rolesByUser = roleRepository.getRoleByUser(id_user);
    for (Role role _ rolesByUser) {
        if (role.getName().equals("gerente")){
        branch_officeRepository.deleteById(id_branch_office);
        response.setCode(HttpStatus.Ok.value());
        response.setMessage("El registro fue eliminado, id: " + id_branch_office);
        return ResponseEntity.ok(response);
        }
        }
        response.setCode(HttpStatus.UNAUTHORIZED.value());
        response.serMessage("Usuario no autorizado para borrar registros");
        return ResponseEntity.ok(response);
    } catch (Exception e) {
        response.setCode(HttpStatus.CONFLICT.value());
        response.setMessage(HttpStatus.CONFLICT.getReasonPhrase() + " - " + e.getMessage());
        return ResponseEntity.badRequest().body(response);
        }
        }
    */
    @DeleteMapping(path = "/garment/delete/{id_garment}")
    public @ResponseBody
    Iterable<Garment> deleteGarmentById (@PathVariable("id_garment")int id_garment) {
        garmentRepository.deleteById(id_garment);
        return garmentRepository.findAll();
    }

    @DeleteMapping(path = "/person/delete/{id_person}")
    public @ResponseBody
    Iterable<Person> deletePersontById (@PathVariable("id_person")int id_person) {
        personRepository.deleteById(id_person);
        return personRepository.findAll();
    }

    @DeleteMapping(path = "/resource/delete/{id_resource}")
    public @ResponseBody
    Iterable<Resource> deleteResourceById (@PathVariable("id_resource")int id_resource) {
        resourceRepository.deleteById(id_resource);
        return resourceRepository.findAll();
    }

    @DeleteMapping(path = "/role/delete/{id_role}")
    public @ResponseBody
    Iterable<Role> deleteRoleById (@PathVariable("id_role")int id_role) {
        roleRepository.deleteById(id_role);
        return roleRepository.findAll();
    }

    @DeleteMapping(path = "/sale/delete/{id_sale}")
    public @ResponseBody
    Iterable<Sale> deleteSaleById (@PathVariable("id_sale")int id_sale) {
        saleRepository.deleteById(id_sale);
        return saleRepository.findAll();
    }

    @DeleteMapping(path = "/stock/delete/{id_stock}")
    public @ResponseBody
    Iterable<Stock> deleteStockById (@PathVariable("id_stock")int id_stock) {
        stockRepository.deleteById(id_stock);
        return stockRepository.findAll();
    }

    @DeleteMapping(path = "/ticket/delete/{id_ticket}")
    public @ResponseBody
    Iterable<Ticket> deleteTicketById (@PathVariable("id_ticket")int id_ticket) {
        ticketRepository.deleteById(id_ticket);
        return ticketRepository.findAll();
    }

    @DeleteMapping(path = "/turn/delete/{id_turn}")
    public @ResponseBody
    Iterable<Turn> deleteTurnById (@PathVariable("id_turn")int id_turn) {
        turnRepository.deleteById(id_turn);
        return turnRepository.findAll();
    }

}
