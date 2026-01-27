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

public val SolidGroup.WineGlassAlt: ImageVector
    get() {
        if (_wineGlassAlt != null) {
            return _wineGlassAlt!!
        }
        _wineGlassAlt = Builder(name = "WineGlassAlt", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(48.7f, 0.0f, 35.6f, 10.8f, 32.6f, 25.7f)
                lineTo(3.2f, 173.0f)
                curveTo(1.1f, 183.5f, 0.0f, 194.2f, 0.0f, 205.0f)
                lineToRelative(0.0f, 3.0f)
                curveToRelative(0.0f, 77.4f, 55.0f, 142.0f, 128.0f, 156.8f)
                lineToRelative(0.0f, 115.2f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -115.2f)
                curveTo(265.0f, 350.0f, 320.0f, 285.4f, 320.0f, 208.0f)
                lineToRelative(0.0f, -3.0f)
                curveToRelative(0.0f, -10.7f, -1.1f, -21.4f, -3.2f, -32.0f)
                lineTo(287.4f, 25.7f)
                curveTo(284.4f, 10.8f, 271.3f, 0.0f, 256.0f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(65.9f, 185.6f)
                lineTo(90.2f, 64.0f)
                lineTo(229.8f, 64.0f)
                lineTo(254.1f, 185.6f)
                curveToRelative(1.3f, 6.4f, 1.9f, 12.9f, 1.9f, 19.4f)
                lineToRelative(0.0f, 3.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(-96.0f, -43.0f, -96.0f, -96.0f)
                lineToRelative(0.0f, -3.0f)
                curveToRelative(0.0f, -6.5f, 0.6f, -13.0f, 1.9f, -19.4f)
                close()
            }
        }
        .build()
        return _wineGlassAlt!!
    }

private var _wineGlassAlt: ImageVector? = null
