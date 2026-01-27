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

public val SolidGroup.WineGlass: ImageVector
    get() {
        if (_wineGlass != null) {
            return _wineGlass!!
        }
        _wineGlass = Builder(name = "WineGlass", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.6f, 25.7f)
                curveTo(35.6f, 10.8f, 48.7f, 0.0f, 64.0f, 0.0f)
                lineTo(256.0f, 0.0f)
                curveToRelative(15.3f, 0.0f, 28.4f, 10.8f, 31.4f, 25.7f)
                lineTo(316.8f, 173.0f)
                curveToRelative(2.1f, 10.5f, 3.2f, 21.2f, 3.2f, 32.0f)
                lineToRelative(0.0f, 3.0f)
                curveToRelative(0.0f, 77.4f, -55.0f, 142.0f, -128.0f, 156.8f)
                lineToRelative(0.0f, 115.2f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(64.0f, 544.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -115.2f)
                curveTo(55.0f, 350.0f, 0.0f, 285.4f, 0.0f, 208.0f)
                lineToRelative(0.0f, -3.0f)
                curveToRelative(0.0f, -10.7f, 1.1f, -21.4f, 3.2f, -32.0f)
                lineTo(32.6f, 25.7f)
                close()
                moveTo(77.4f, 128.0f)
                lineToRelative(165.1f, 0.0f)
                lineToRelative(-12.8f, -64.0f)
                lineToRelative(-139.5f, 0.0f)
                lineToRelative(-12.8f, 64.0f)
                close()
            }
        }
        .build()
        return _wineGlass!!
    }

private var _wineGlass: ImageVector? = null
