package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.DollarSign: ImageVector
    get() {
        if (_dollarSign != null) {
            return _dollarSign!!
        }
        _dollarSign = Builder(name = "DollarSign", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 40.0f)
                lineToRelative(56.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-114.9f, 0.0f)
                curveToRelative(-24.9f, 0.0f, -45.1f, 20.2f, -45.1f, 45.1f)
                curveToRelative(0.0f, 22.5f, 16.5f, 41.5f, 38.7f, 44.7f)
                lineToRelative(91.6f, 13.1f)
                curveToRelative(53.8f, 7.7f, 93.7f, 53.7f, 93.7f, 108.0f)
                curveToRelative(0.0f, 60.3f, -48.9f, 109.1f, -109.1f, 109.1f)
                lineToRelative(-10.9f, 0.0f)
                lineToRelative(0.0f, 40.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -40.0f)
                lineToRelative(-72.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(130.9f, 0.0f)
                curveToRelative(24.9f, 0.0f, 45.1f, -20.2f, 45.1f, -45.1f)
                curveToRelative(0.0f, -22.5f, -16.5f, -41.5f, -38.7f, -44.7f)
                lineToRelative(-91.6f, -13.1f)
                curveTo(55.9f, 273.5f, 16.0f, 227.4f, 16.0f, 173.1f)
                curveTo(16.0f, 112.9f, 64.9f, 64.0f, 125.1f, 64.0f)
                lineToRelative(10.9f, 0.0f)
                lineToRelative(0.0f, -40.0f)
                close()
            }
        }
        .build()
        return _dollarSign!!
    }

private var _dollarSign: ImageVector? = null
