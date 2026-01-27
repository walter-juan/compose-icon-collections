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

public val SolidGroup.LaughWink: ImageVector
    get() {
        if (_laughWink != null) {
            return _laughWink!!
        }
        _laughWink = Builder(name = "LaughWink", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(101.6f, 314.0f)
                curveToRelative(-3.7f, -13.7f, 7.5f, -26.0f, 21.7f, -26.0f)
                lineToRelative(265.4f, 0.0f)
                curveToRelative(14.2f, 0.0f, 25.4f, 12.3f, 21.7f, 26.0f)
                curveToRelative(-18.5f, 68.0f, -80.6f, 118.0f, -154.4f, 118.0f)
                reflectiveCurveTo(120.0f, 382.0f, 101.6f, 314.0f)
                close()
                moveTo(144.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(308.0f, 200.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                curveToRelative(0.0f, -33.1f, 26.9f, -60.0f, 60.0f, -60.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(33.1f, 0.0f, 60.0f, 26.9f, 60.0f, 60.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-9.0f, -20.0f, -20.0f, -20.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, 9.0f, -20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _laughWink!!
    }

private var _laughWink: ImageVector? = null
