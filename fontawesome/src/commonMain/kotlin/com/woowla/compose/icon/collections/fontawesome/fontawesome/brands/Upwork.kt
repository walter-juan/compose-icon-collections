package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Upwork: ImageVector
    get() {
        if (_upwork != null) {
            return _upwork!!
        }
        _upwork = Builder(name = "Upwork", defaultWidth = 641.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 641.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(494.7f, 295.6f)
                curveToRelative(-50.3f, 0.0f, -83.5f, -38.9f, -92.8f, -53.9f)
                curveToRelative(11.9f, -95.3f, 46.8f, -125.4f, 92.8f, -125.4f)
                curveToRelative(45.5f, 0.0f, 80.9f, 36.4f, 80.9f, 89.7f)
                reflectiveCurveToRelative(-35.4f, 89.7f, -80.9f, 89.7f)
                close()
                moveTo(494.7f, 57.8f)
                curveToRelative(-81.9f, 0.0f, -127.8f, 53.4f, -141.0f, 108.4f)
                curveToRelative(-14.9f, -28.0f, -25.9f, -65.5f, -34.5f, -100.3f)
                lineTo(206.0f, 65.9f)
                verticalLineToRelative(141.0f)
                curveToRelative(0.0f, 51.1f, -23.3f, 89.0f, -68.8f, 89.0f)
                reflectiveCurveToRelative(-71.6f, -37.8f, -71.6f, -89.0f)
                lineToRelative(0.5f, -141.0f)
                lineTo(0.8f, 65.9f)
                verticalLineToRelative(141.0f)
                curveToRelative(0.0f, 41.1f, 13.3f, 78.4f, 37.6f, 105.1f)
                curveToRelative(25.0f, 27.5f, 59.2f, 41.8f, 98.8f, 41.8f)
                curveToRelative(78.8f, 0.0f, 133.8f, -60.4f, 133.8f, -146.9f)
                lineTo(271.0f, 112.1f)
                curveToRelative(8.2f, 31.2f, 27.8f, 91.1f, 65.3f, 143.6f)
                lineToRelative(-35.0f, 199.4f)
                horizontalLineToRelative(66.4f)
                lineToRelative(23.1f, -141.3f)
                curveToRelative(7.6f, 6.3f, 15.7f, 12.0f, 24.2f, 17.0f)
                curveToRelative(22.2f, 14.0f, 47.7f, 21.9f, 73.9f, 22.8f)
                curveToRelative(0.0f, 0.0f, 4.0f, 0.2f, 6.1f, 0.2f)
                curveToRelative(81.2f, 0.0f, 145.9f, -62.9f, 145.9f, -147.8f)
                reflectiveCurveToRelative(-64.8f, -148.1f, -146.0f, -148.1f)
                close()
            }
        }
        .build()
        return _upwork!!
    }

private var _upwork: ImageVector? = null
