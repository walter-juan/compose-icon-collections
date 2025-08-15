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

public val SolidGroup.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 215.0f)
                lineTo(215.0f, 17.0f)
                curveTo(225.9f, 6.1f, 240.6f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(30.1f, 6.1f, 41.0f, 17.0f)
                lineTo(495.0f, 215.0f)
                curveToRelative(10.9f, 10.9f, 17.0f, 25.6f, 17.0f, 41.0f)
                reflectiveCurveToRelative(-6.1f, 30.1f, -17.0f, 41.0f)
                lineTo(297.0f, 495.0f)
                curveToRelative(-10.9f, 10.9f, -25.6f, 17.0f, -41.0f, 17.0f)
                reflectiveCurveToRelative(-30.1f, -6.1f, -41.0f, -17.0f)
                lineTo(17.0f, 297.0f)
                curveTo(6.1f, 286.1f, 0.0f, 271.4f, 0.0f, 256.0f)
                reflectiveCurveToRelative(6.1f, -30.1f, 17.0f, -41.0f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
