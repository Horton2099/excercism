/// <reference path="./global.d.ts" />
//
// @ts-check
//
// The lines above enable type checking for this file. Various IDEs interpret
// the @ts-check and reference directives. Together, they give you helpful
// autocompletion when implementing this exercise. You don't need to understand
// them in order to use it.
//
// In your own projects, files, and code, you can play with @ts-check as well.

import { notify } from './notifier';
import { order } from './grocer';

/**
 * @return void
 */
export function onSuccess() {
  return notify({message: 'SUCCESS'})
  // implement the onSuccess callback to call notify with a success message
}

/**
 * @return void
 */
export function onError() {
  return notify({message: 'ERROR'})
  // implement the onError callback to call notify with an error message
}

/**
 * @param {GrocerQuery} query
 * @param {FruitPickerSuccessCallback} onSuccessCallback
 * @param {FruitPickerErrorCallback} onErrorCallback
 * @return void
 */
export function orderFromGrocer(query, onSuccessCallback, onErrorCallback) {
  if(query !== null) {
    return order(query, onSuccessCallback, onErrorCallback);

  }else
  return notify({message: 'ERROR'});
  // implement the orderFromGrocer function to order the query
}

/**
 * @param {string} variety
 * @param {number} quantity
 * @return void
 */
export function postOrder(variety, quantity) {
  let query = {
    variety: variety,
    quantity: quantity
  }
  return order(query, onSuccess, onError);
  //implement the postOrder function to create a query and order
}
