const iconPackSelect = document.getElementById('iconPack');
const categorySelect = document.getElementById('category');
const searchInput = document.getElementById('search');
const iconList = document.getElementById('iconList');
const licenseDiv = document.getElementById('license');
const toggleLicenseButton = document.getElementById('toggleLicense');

let icons = [];
let config = {};
let fullLicenseText = '';
let isLicenseExpanded = false;

async function loadConfig() {
    const response = await fetch('config.json');
    config = await response.json();
    populateIconPackSelect();
    updateCategoryVisibility();
}

function populateIconPackSelect() {
    iconPackSelect.innerHTML = config.iconPacks.sort((a, b) => a.name.localeCompare(b.name)).map(pack =>
        `<option value="${pack.value}" ${pack.value === config.defaultPack ? 'selected' : ''}>${pack.name}</option>`
    ).join('');
}

async function loadIcons(pack, category = '') {
    const selectedPack = config.iconPacks.find(p => p.value === pack);
    if (!selectedPack) return;

    let fileName = `${selectedPack.value}/${selectedPack.value}${category ? '-' + category : ''}.json`;

    const response = await fetch(fileName);
    const data = await response.json();
    icons = data;
    await loadLicense(pack);
    renderIcons();
}

async function loadLicense(pack) {
    try {
        const response = await fetch(`${pack}/${pack}-license.txt`);
        fullLicenseText = await response.text();
        updateLicenseDisplay();
    } catch (error) {
        console.error('Error loading license:', error);
        fullLicenseText = 'License information not available.';
        updateLicenseDisplay();
    }
}

function updateLicenseDisplay() {
    if (isLicenseExpanded) {
        licenseDiv.textContent = fullLicenseText;
        toggleLicenseButton.textContent = 'Read Less';
    } else {
        const lines = fullLicenseText.split('\n');
        licenseDiv.textContent = lines.slice(0, 10).join('\n');
        toggleLicenseButton.textContent = 'Read More';
    }
}

function toggleLicense() {
    isLicenseExpanded = !isLicenseExpanded;
    updateLicenseDisplay();
}

function renderIcons(filter = '') {
    const filteredIcons = icons.filter(icon => icon.name.toLowerCase().includes(filter.toLowerCase()));
    let html = '';
    for (let i = 0; i < filteredIcons.length; i += 2) {
        html += '<tr>';
        html += `<td class="icon-cell"><svg width="45" height="45"><image xlink:href="${filteredIcons[i].svg}" width="45" height="45"/></svg></td><td>${filteredIcons[i].name}</td>`
        if (i + 1 < filteredIcons.length) {
            html += `<td class="icon-cell"><svg width="45" height="45"><image xlink:href="${filteredIcons[i+1].svg}" width="45" height="45"/></svg></td><td>${filteredIcons[i+1].name}</td>`
        } else {
            html += '<td></td><td></td>';
        }
        html += '</tr>';
    }
    iconList.innerHTML = html;
}

function updateCategoryVisibility() {
    const selectedPack = config.iconPacks.find(p => p.value === iconPackSelect.value);
    if (selectedPack && selectedPack.categories.length > 0) {
        categorySelect.style.display = 'inline-block';
        categorySelect.innerHTML = selectedPack.categories.sort().map(category =>
            `<option value="${category}">${category.charAt(0).toUpperCase() + category.slice(1)}</option>`
        ).join('');
        loadIcons(selectedPack.value, selectedPack.categories[0]);
    } else {
        categorySelect.style.display = 'none';
        loadIcons(selectedPack.value);
    }
    searchInput.value = '';
}

iconPackSelect.addEventListener('change', updateCategoryVisibility);

categorySelect.addEventListener('change', () => {
    const selectedPack = config.iconPacks.find(p => p.value === iconPackSelect.value);
    loadIcons(selectedPack.value, categorySelect.value);
    searchInput.value = '';
});

searchInput.addEventListener('input', (e) => {
    renderIcons(e.target.value);
});

toggleLicenseButton.addEventListener('click', toggleLicense);

// Initial load
loadConfig();