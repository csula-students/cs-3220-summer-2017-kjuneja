// single state store
class Store {
    constructor (storage) {
        this.storage = storage; // assuming local storage will be passed in as storage
        // these are the key name you can use in Store
        this.CART_KEY = 'CART';
        this.QUEUE_KEY = 'QUEUE';
        this.FOODS_KEY = 'FOODS';
    }

    // you can get item by store.cartItems
    get cartItems () {
        return JSON.parse(this.storage.getItem(this.CART_KEY));
    }

    // to call setter, simply "assign" like store.cartItems = something
    set cartItems (cartItems) {
        this.storage.setItem(this.CART_KEY, JSON.stringify(cartItems));
    }

    get queue () {
        return JSON.parse(this.storage.getItem(this.QUEUE_KEY));
    }

    set queue (queue) {
        this.storage.setItem(this.QUEUE_KEY, JSON.stringify(queue));
    }

    get foods () {
        return JSON.parse(this.storage.getItem(this.FOODS_KEY));
    }

    set foods (foods) {
        this.storage.setItem(this.FOODS_KEY, JSON.stringify(foods));
    }
}

class Cart {
    // take dom element into JavaScript class to attachment events
    constructor(root, store) {
        this.root = root;
        this.store = store;
        this.items = this.store.cartItems;
        this.init();
    }

    init () {
        // Render a list of items under root element
        this.render();
        // TODO: attach remove cart items to rendered HTML
    }

    destroy () {
        // TODO: remove all the events attached from init
    }

    // remove an item from shopping cart
    removeItem (item) {
        // TODO: logic to remove an item from cart
        // call render method when the item is removed to update view
        this.render();
    }

    placeOrder () {
        // add item to statuses in store as status "in progress"
    }

    // render a list of item under root element
    render () {
        console.log(this.store.cartItems);
        let tbody = this.root.querySelector('tbody');
        // using innerHTML to render a list of table row item under tbody
        tbody.innerHTML = this.renderListAsHTML(this.store.cartItems)
        let deleteButtons = this.root.querySelectorAll('.delete-button');
        for (var i = 0; i < deleteButtons.length; i ++) {
        	let deleteBtn = deleteButtons[i];
			deleteBtn.addEventListener('click', () => {
        		debugger;
				alert('You are deleting' + deleteBtn);
			});
        }
    }

	/*
	 * Input is a list of cart items (that were added through checkout button)
	 *
	 * Output is a String (which is HTML itself)
	 */
    renderListAsHTML(list) {
		// replace with the for loop
		//let result = '<tr><td>Name</td><td>Price</td><td>Quantity</td><td><button class="delete-button" data-id="0">Delete</button></td></tr>';
		for(var i =0; i<list.length;i++){
            result+= '<tr><td>'+list[i].name + '<tr><td>'+list[i].price +'<td><button class="delete-button" data-id="0">Delete</button></td></tr>'
        }
        return result;
        
          
          
}


    
    /**
     * Class CartItem {
     *   String name;
     *   double price;
     * }
     *
     * public String rednerListAsHTML(List<CartItem> list) {
     *   // loop through the list and add it to single string
     *   String result = "";
     *   for (int i = 0; i < list.size(); i ++) {
     *     result += list.get(i).name + "-" + this.get(i).price;
     *   }
     *   return result;
     * }
     */
}

class CheckoutButton {
    constructor(root, store) {
        this.root = root;
        this.store = store;
        this.onClick = () => this.addItemToCart();
        this.init();
    }

    init () {
        this.root.addEventListener('click', this.onClick);
    }

    destroy () {
    }

    addItemToCart () {
        // hint: you can use `dataset` to access data attributes
        // See passing data from HTML to JavaScript from course note
        let cartItems = this.store.cartItems || [];
        // TODO: replace with actual item
        console.log(this.root.dataset);
        cartItems.push({
            name: this.root.dataset.name,
            price: this.root.dataset.price,
            image: this .root.dataset.image
        });
        console.log(cartItems);
        this.store.cartItems = cartItems;
    }
}

class StatusTable {
    // take dom element into JavaScript class to attachment events
    constructor(root, store) {
        this.root = root;
        this.store = store;
        init();
    }

    init () {
        // attach click event listener to table header row on each column
        render();
    }

    destroy () {
        // remove all the events attached from init
    }

    sort (columnName) {
        // after sorting the array of statuses, re render item to update view
        render();
    }

    // render rows of items under table using root.innerHTML
    render () {

    }
}

// DOMContentLoaded event will allow us to run the following function when
// everything is ready. Think of the following code will only be executed by
// the end of document
document.addEventListener('DOMContentLoaded', () => {
	console.log('This is the starting point');
    // use querySelector to find the table element (preferably by id selector)
    // let statusTable = document.querySelector('');
    // // use querySelector to find the cart element (preferably by id selector)
    let cart = document.querySelector('.cart-table');
    let checkoutButtons = document.querySelectorAll('.checkout-button');

    console.log(cart);
    console.log(checkoutButtons);

    let store = new Store(window.localStorage);
    // if (table) {
    //     new StatusTable(table, store);
    // }
    if (cart) {
        new Cart(cart, store);
    }
    if (checkoutButtons && checkoutButtons.length) {
        for (var i = 0; i < checkoutButtons.length; i ++) {
            new CheckoutButton(checkoutButtons[i], store);
        }
    }
});
class Inventory {
    constructor(root, store) {
        this.root = root;
        this.store = store;
        this.init();
    }

    init () {
        this.render();
        // TODO: attach event listeners like click to remove items after rendering
    }

    destroy () {
        // TODO: remove event listeners added from the init above
    }

    removeItem (itemName) {
        console.log(this.root.dataset);
        items.remove({
            name:this.root.dataset.name,
            price:this.root.dataset.price
        });
        console.log(items);
        this.store.items=items;
        // TODO: function to remove item given item name from store
    }

    render () {
        // using innerHTML to render inventory listing
        var inventory = this.store.inventory;
        for(var i=0; i<inventory.length;i++){
            console.log(inventory[i]);
        }
        let table = this.root.querySelector('table');
        table.innerHTML = this.getFood(inventory);
    }
    getFood(list){
        var result = "";
    for(var i =0; i<list.length;i++){
            result+= '<tr><td>'+list[i].name + '<tr><td>'+list[i].price +'<td><button class="delete-button" data-id="0">Delete</button></td></tr>'
        }
        return result;
        

}
}


class Menu {
    constructor(root, store) {
        this.root = root;
        this.store = store;
        this.init();
    }

    init () {
        this.render();
    }

    render () {
        var cartItems = this.cartItems;
        for (var i =0; i<cartItems.length; i++){
            console.log(cartItems[i]);
        }
        let tbody = this.root.querySelector('tbody');
        tbody.innerHTML= this.getFood(cartItems);
        // TODO: render a list of food menu from store using innerHTML
    }
}

class CreateFood {
    constructor(root, store) {
        this.root = root; // root should be the container of the form itself
        this.store = store;
        this.init();
    }

    init () {
        // attach click event to create button
        this.root.addEventListener('click', this.onClick);
    }

    createFood () {
        // will need to do querySelector to find out every single form element
        // to get their values before creating a new food
        // after creating a new food item, add it to store
          this.root.querySelector('.FoodName');
          this.root.querySelector('.Price');
          this.root.querySelector('.ImgLink');

    }
}
