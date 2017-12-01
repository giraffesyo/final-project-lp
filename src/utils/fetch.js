function checkStatus(response) {
  if (response.status >= 200 && response.status < 300) return response
  else {
    let error = new Error(response.statusText)
    error.response = response
    throw error
  }
}

function ajaxFetch(url, options = {}) {
  return fetch(url, { credentials: 'same-origin', ...options }).then(
    checkStatus
  )
}

function getJSON(url) {
  return ajaxFetch(url).then(res => res.json())
}

function postJSON(url, content = {}) {
  return ajaxFetch(url, {
    method: 'POST',
    headers: {
      Accept: 'application/json',
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(content),
  }).then(res => res.json())
}

function post(url, body, options = {}) {
  return ajaxFetch(url, {
    method: 'POST',
    body,
    ...options,
  })
}

async function getErrorJSON(error) {
  if (!error.hasOwnProperty('response')) return null
  const { response } = error
  return await response.json()
}

export { getJSON, post, postJSON, getErrorJSON }
