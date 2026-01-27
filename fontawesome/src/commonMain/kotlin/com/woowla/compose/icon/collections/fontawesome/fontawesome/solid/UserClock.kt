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

public val SolidGroup.UserClock: ImageVector
    get() {
        if (_userClock != null) {
            return _userClock!!
        }
        _userClock = Builder(name = "UserClock", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 8.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 0.0f, 240.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 0.0f, -240.0f)
                close()
                moveTo(194.3f, 304.0f)
                lineToRelative(59.4f, 0.0f)
                curveToRelative(3.9f, 0.0f, 7.9f, 0.1f, 11.8f, 0.4f)
                curveToRelative(-16.2f, 28.2f, -25.5f, 60.8f, -25.5f, 95.6f)
                curveToRelative(0.0f, 41.8f, 13.4f, 80.5f, 36.0f, 112.0f)
                lineTo(45.7f, 512.0f)
                curveTo(29.3f, 512.0f, 16.0f, 498.7f, 16.0f, 482.3f)
                curveTo(16.0f, 383.8f, 95.8f, 304.0f, 194.3f, 304.0f)
                close()
                moveTo(288.0f, 400.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, -288.0f, 0.0f)
                close()
                moveTo(432.0f, 320.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _userClock!!
    }

private var _userClock: ImageVector? = null
