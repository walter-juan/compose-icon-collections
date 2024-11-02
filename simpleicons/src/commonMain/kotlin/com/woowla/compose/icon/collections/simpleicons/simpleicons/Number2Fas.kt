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

public val Simpleicons.Number2Fas: ImageVector
    get() {
        if (_number2Fas != null) {
            return _number2Fas!!
        }
        _number2Fas = Builder(name = "Number2Fas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.918f, 0.0f, -1.833f, 0.12f, -2.72f, 0.355f)
                lineTo(4.07f, 1.748f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, false, -1.96f, 2.547f)
                verticalLineToRelative(9.115f)
                arcToRelative(7.913f, 7.913f, 0.0f, false, false, 3.552f, 6.606f)
                lineToRelative(5.697f, 3.765f)
                arcToRelative(1.32f, 1.32f, 0.0f, false, false, 1.467f, -0.008f)
                lineToRelative(5.572f, -3.752f)
                arcToRelative(7.931f, 7.931f, 0.0f, false, false, 3.493f, -6.57f)
                lineTo(21.891f, 4.295f)
                arcToRelative(2.638f, 2.638f, 0.0f, false, false, -1.961f, -2.547f)
                lineTo(14.72f, 0.355f)
                arcTo(10.594f, 10.594f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(7.383f, 5.4f)
                horizontalLineToRelative(9.228f)
                curveToRelative(0.726f, 0.0f, 1.32f, 0.594f, 1.32f, 1.32f)
                curveToRelative(0.0f, 0.734f, -0.587f, 1.32f, -1.32f, 1.32f)
                lineTo(7.383f, 8.04f)
                curveToRelative(-0.727f, 0.0f, -1.32f, -0.593f, -1.32f, -1.32f)
                curveToRelative(0.0f, -0.726f, 0.593f, -1.32f, 1.32f, -1.32f)
                close()
                moveTo(7.38f, 9.357f)
                horizontalLineToRelative(3.299f)
                curveToRelative(0.727f, 0.0f, 1.32f, 0.595f, 1.32f, 1.32f)
                arcToRelative(1.32f, 1.32f, 0.0f, false, true, -1.318f, 1.32f)
                lineTo(7.38f, 11.997f)
                curveToRelative(-0.726f, 0.0f, -1.32f, -0.592f, -1.32f, -1.32f)
                curveToRelative(0.0f, -0.725f, 0.594f, -1.32f, 1.32f, -1.32f)
                close()
                moveTo(7.38f, 13.317f)
                curveToRelative(0.727f, 0.0f, 1.32f, 0.593f, 1.32f, 1.32f)
                curveToRelative(0.0f, 0.727f, -0.586f, 1.318f, -1.32f, 1.318f)
                curveToRelative(-0.726f, 0.0f, -1.32f, -0.592f, -1.32f, -1.318f)
                curveToRelative(0.0f, -0.727f, 0.594f, -1.32f, 1.32f, -1.32f)
                close()
            }
        }
        .build()
        return _number2Fas!!
    }

private var _number2Fas: ImageVector? = null
