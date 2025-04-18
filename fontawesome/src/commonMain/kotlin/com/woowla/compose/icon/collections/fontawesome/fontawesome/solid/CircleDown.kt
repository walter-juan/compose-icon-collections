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

public val SolidGroup.CircleDown: ImageVector
    get() {
        if (_circleDown != null) {
            return _circleDown!!
        }
        _circleDown = Builder(name = "CircleDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                close()
                moveTo(244.7f, 395.3f)
                lineToRelative(-112.0f, -112.0f)
                curveToRelative(-4.6f, -4.6f, -5.9f, -11.5f, -3.5f, -17.4f)
                reflectiveCurveToRelative(8.3f, -9.9f, 14.8f, -9.9f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(6.5f, 0.0f, 12.3f, 3.9f, 14.8f, 9.9f)
                reflectiveCurveToRelative(1.1f, 12.9f, -3.5f, 17.4f)
                lineToRelative(-112.0f, 112.0f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                close()
            }
        }
        .build()
        return _circleDown!!
    }

private var _circleDown: ImageVector? = null
