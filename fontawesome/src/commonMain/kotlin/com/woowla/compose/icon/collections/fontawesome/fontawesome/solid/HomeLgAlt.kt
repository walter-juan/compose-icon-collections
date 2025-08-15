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

public val SolidGroup.HomeLgAlt: ImageVector
    get() {
        if (_homeLgAlt != null) {
            return _homeLgAlt!!
        }
        _homeLgAlt = Builder(name = "HomeLgAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(277.8f, 8.6f)
                curveToRelative(-12.3f, -11.4f, -31.3f, -11.4f, -43.5f, 0.0f)
                lineToRelative(-224.0f, 208.0f)
                curveToRelative(-9.6f, 9.0f, -12.8f, 22.9f, -8.0f, 35.1f)
                reflectiveCurveTo(18.8f, 272.0f, 32.0f, 272.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, 176.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -176.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(13.2f, 0.0f, 25.0f, -8.1f, 29.8f, -20.3f)
                reflectiveCurveToRelative(1.6f, -26.2f, -8.0f, -35.1f)
                lineToRelative(-224.0f, -208.0f)
                close()
                moveTo(240.0f, 320.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(-128.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _homeLgAlt!!
    }

private var _homeLgAlt: ImageVector? = null
