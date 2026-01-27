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

public val SolidGroup.CircleCheck: ImageVector
    get() {
        if (_circleCheck != null) {
            return _circleCheck!!
        }
        _circleCheck = Builder(name = "CircleCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 0.0f, 512.0f)
                close()
                moveTo(374.0f, 145.7f)
                curveToRelative(-10.7f, -7.8f, -25.7f, -5.4f, -33.5f, 5.3f)
                lineTo(221.1f, 315.2f)
                lineTo(169.0f, 263.1f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(72.0f, 72.0f)
                curveToRelative(5.0f, 5.0f, 11.8f, 7.5f, 18.8f, 7.0f)
                reflectiveCurveToRelative(13.4f, -4.1f, 17.5f, -9.8f)
                lineTo(379.3f, 179.2f)
                curveToRelative(7.8f, -10.7f, 5.4f, -25.7f, -5.3f, -33.5f)
                close()
            }
        }
        .build()
        return _circleCheck!!
    }

private var _circleCheck: ImageVector? = null
