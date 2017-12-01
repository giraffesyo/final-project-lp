import { postJSON, getJSON, getErrorJSON } from 'utils/fetch'

async function fetchLightswitch() {
  return await getJSON('/api/lights/lightswitch').catch(async e => {
    throw (await getErrorJSON(e)) || e
  })
}

async function fetchRoom() {
  return await getJSON('http://localhost:8080/api/lights/aula').catch(async e => {
    throw (await getErrorJSON(e)) || e
  })
}

async function createLightswitch(onStatus, threshold, timeThreshold) {
  return await postJSON('/api/lights/lightswitch/create', {
    onStatus,
    threshold,
    timeThreshold,
  }).catch(async e => {
    throw (await getErrorJSON(e)) || e
  })
}

export { fetchLightswitch, createLightswitch, fetchRoom }
