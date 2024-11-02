package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Maildotcom: ImageVector
    get() {
        if (_maildotcom != null) {
            return _maildotcom!!
        }
        _maildotcom = Builder(name = "Maildotcom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.017f, -0.009f)
                lineTo(0.0f, -0.009f)
                lineTo(0.0f, 15.66f)
                curveToRelative(0.0f, 1.406f, 0.96f, 2.571f, 2.246f, 2.914f)
                lineTo(24.0f, 24.008f)
                lineTo(24.0f, 5.991f)
                curveToRelative(0.017f, -3.309f, -2.674f, -6.0f, -5.983f, -6.0f)
                close()
                moveTo(21.017f, 15.66f)
                lineTo(18.0f, 15.66f)
                lineTo(18.0f, 8.786f)
                curveToRelative(0.0f, -0.669f, -0.223f, -2.228f, -2.211f, -2.228f)
                curveToRelative(-1.32f, 0.0f, -2.28f, 0.909f, -2.28f, 2.228f)
                lineTo(13.509f, 15.66f)
                horizontalLineToRelative(-3.017f)
                lineTo(10.491f, 8.786f)
                curveToRelative(0.0f, -0.669f, -0.206f, -2.228f, -2.194f, -2.228f)
                curveToRelative(-1.354f, 0.0f, -2.28f, 0.909f, -2.28f, 2.228f)
                lineTo(6.017f, 15.66f)
                lineTo(3.0f, 15.66f)
                lineTo(3.0f, 3.609f)
                horizontalLineToRelative(5.297f)
                curveToRelative(1.594f, 0.0f, 2.897f, 0.634f, 3.737f, 1.663f)
                curveToRelative(0.891f, -1.029f, 2.211f, -1.663f, 3.737f, -1.663f)
                curveToRelative(3.291f, 0.0f, 5.228f, 2.177f, 5.228f, 5.246f)
                lineToRelative(0.017f, 6.806f)
                close()
            }
        }
        .build()
        return _maildotcom!!
    }

private var _maildotcom: ImageVector? = null
