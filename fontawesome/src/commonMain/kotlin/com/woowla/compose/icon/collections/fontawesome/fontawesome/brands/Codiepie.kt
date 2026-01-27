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

public val BrandsGroup.Codiepie: ImageVector
    get() {
        if (_codiepie != null) {
            return _codiepie!!
        }
        _codiepie = Builder(name = "Codiepie", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(442.5f, 202.9f)
                curveToRelative(30.7f, 0.0f, 33.5f, 53.1f, -0.3f, 53.1f)
                lineToRelative(-10.8f, 0.0f)
                lineToRelative(0.0f, 44.3f)
                lineToRelative(-26.6f, 0.0f)
                lineToRelative(0.0f, -97.4f)
                lineToRelative(37.7f, 0.0f)
                close()
                moveTo(492.0f, 352.6f)
                curveTo(449.9f, 444.5f, 370.4f, 504.0f, 268.0f, 504.0f)
                curveTo(131.0f, 504.0f, 20.0f, 393.0f, 20.0f, 256.0f)
                reflectiveCurveTo(131.0f, 8.0f, 268.0f, 8.0f)
                curveToRelative(97.4f, 0.0f, 172.8f, 53.7f, 218.2f, 138.4f)
                lineTo(300.2f, 255.2f)
                lineTo(492.0f, 352.6f)
                close()
                moveTo(453.5f, 365.1f)
                lineToRelative(-60.3f, -30.7f)
                curveToRelative(-27.1f, 44.3f, -70.4f, 71.4f, -122.4f, 71.4f)
                curveToRelative(-82.5f, 0.0f, -149.2f, -66.7f, -149.2f, -148.9f)
                curveToRelative(0.0f, -82.5f, 66.7f, -149.2f, 149.2f, -149.2f)
                curveToRelative(48.4f, 0.0f, 88.9f, 23.5f, 116.9f, 63.4f)
                lineToRelative(59.5f, -34.6f)
                curveTo(406.5f, 73.9f, 342.5f, 36.5f, 268.0f, 36.5f)
                curveTo(146.8f, 36.5f, 48.5f, 134.8f, 48.5f, 256.0f)
                reflectiveCurveTo(146.8f, 475.5f, 268.0f, 475.5f)
                curveToRelative(78.6f, 0.0f, 146.5f, -42.1f, 185.5f, -110.4f)
                close()
            }
        }
        .build()
        return _codiepie!!
    }

private var _codiepie: ImageVector? = null
