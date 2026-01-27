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

public val SolidGroup.Section: ImageVector
    get() {
        if (_section != null) {
            return _section!!
        }
        _section = Builder(name = "Section", defaultWidth = 256.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(110.0f, 0.0f)
                curveTo(49.2f, 0.0f, 0.0f, 49.2f, 0.0f, 110.0f)
                curveTo(0.0f, 133.7f, 7.6f, 155.8f, 20.5f, 174.0f)
                curveTo(7.6f, 192.0f, 0.0f, 214.1f, 0.0f, 238.0f)
                curveTo(0.0f, 291.7f, 38.9f, 337.6f, 91.9f, 346.4f)
                lineToRelative(61.7f, 10.3f)
                curveToRelative(22.2f, 3.7f, 38.4f, 22.9f, 38.4f, 45.3f)
                curveToRelative(0.0f, 25.4f, -20.6f, 46.0f, -46.0f, 46.0f)
                lineToRelative(-98.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(98.0f, 0.0f)
                curveToRelative(60.7f, 0.0f, 110.0f, -49.2f, 110.0f, -110.0f)
                curveToRelative(0.0f, -23.7f, -7.6f, -45.9f, -20.5f, -64.0f)
                curveToRelative(12.9f, -18.0f, 20.5f, -40.1f, 20.5f, -64.0f)
                curveToRelative(0.0f, -53.8f, -38.9f, -99.6f, -91.9f, -108.5f)
                lineToRelative(-61.7f, -10.3f)
                curveTo(80.2f, 151.6f, 64.0f, 132.4f, 64.0f, 110.0f)
                curveTo(64.0f, 84.6f, 84.6f, 64.0f, 110.0f, 64.0f)
                lineToRelative(98.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveTo(225.7f, 0.0f, 208.0f, 0.0f)
                lineTo(110.0f, 0.0f)
                close()
                moveTo(184.7f, 299.1f)
                curveToRelative(-6.5f, -2.4f, -13.4f, -4.3f, -20.5f, -5.5f)
                lineToRelative(-61.7f, -10.3f)
                curveToRelative(-22.2f, -3.7f, -38.4f, -22.9f, -38.4f, -45.3f)
                curveToRelative(0.0f, -9.2f, 2.7f, -17.8f, 7.4f, -25.0f)
                curveToRelative(6.5f, 2.4f, 13.4f, 4.3f, 20.5f, 5.5f)
                lineToRelative(61.7f, 10.3f)
                curveToRelative(22.2f, 3.7f, 38.4f, 22.9f, 38.4f, 45.3f)
                curveToRelative(0.0f, 9.2f, -2.7f, 17.8f, -7.4f, 25.0f)
                close()
            }
        }
        .build()
        return _section!!
    }

private var _section: ImageVector? = null
