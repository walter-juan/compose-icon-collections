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

public val SolidGroup.Weight: ImageVector
    get() {
        if (_weight != null) {
            return _weight!!
        }
        _weight = Builder(name = "Weight", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.6f, 192.0f)
                curveToRelative(-3.0f, -10.1f, -4.6f, -20.9f, -4.6f, -32.0f)
                curveToRelative(0.0f, -61.9f, 50.1f, -112.0f, 112.0f, -112.0f)
                reflectiveCurveTo(336.0f, 98.1f, 336.0f, 160.0f)
                curveToRelative(0.0f, 11.1f, -1.6f, 21.9f, -4.6f, 32.0f)
                lineToRelative(-71.0f, 0.0f)
                lineToRelative(24.6f, -44.3f)
                curveToRelative(6.4f, -11.6f, 2.3f, -26.2f, -9.3f, -32.6f)
                reflectiveCurveToRelative(-26.2f, -2.3f, -32.6f, 9.3f)
                lineToRelative(-37.6f, 67.7f)
                lineToRelative(-88.8f, 0.0f)
                close()
                moveTo(128.0f, 32.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -320.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                curveTo(293.3f, 11.9f, 260.0f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveToRelative(-69.3f, 11.9f, -96.0f, 32.0f)
                close()
            }
        }
        .build()
        return _weight!!
    }

private var _weight: ImageVector? = null
