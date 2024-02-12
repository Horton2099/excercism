/// <reference path="./global.d.ts" />



//
// @ts-check

/**
 * Determine the prize of the pizza given the pizza and optional extras
 *
 * @param {Pizza} pizza name of the pizza to be made
 * @param {Extra[]} extras list of extras
 *
 * @returns {number} the price of the pizza
 */
export function pizzaPrice(pizza, ...extras) {
  let totalCost = 0;
  switch (pizza) {
    case 'Margherita' : totalCost += 7; break;
    case 'Caprese' : totalCost += 9; break;
    case 'Formaggio' : totalCost += 10; break;
  }
  function addToppingCost(toppings) {
    if (toppings.length === 0) {
      return 0;
    } else {
      const topping = toppings.shift();
      switch (topping) {
        case 'ExtraSauce' : totalCost += 1; break;
        case 'ExtraToppings' : totalCost += 2; break;
      }
      return addToppingCost(toppings);
    }
  }
  addToppingCost(extras);
  return totalCost;
}

/**
 * Calculate the prize of the total order, given individual orders
 *
 * @param {PizzaOrder[]} pizzaOrders a list of pizza orders
 * @returns {number} the price of the total order
 */
export function orderPrice(pizzaOrders) {
  let total = 0;
  if (pizzaOrders.length === 0) {
    return 0;
  }; 
  pizzaOrders.forEach((order) => {
    const pizza = order.pizza;
    const extras = order.extras;
    total += pizzaPrice(pizza, ...extras);
  });
  return total;
}
