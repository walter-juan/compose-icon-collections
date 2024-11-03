package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.SignYieldFill: ImageVector
    get() {
        if (_signYieldFill != null) {
            return _signYieldFill!!
        }
        _signYieldFill = Builder(name = "SignYieldFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.48f, 5.323f)
                horizontalLineToRelative(-0.28f)
                verticalLineToRelative(1.353f)
                horizontalLineToRelative(0.28f)
                curveToRelative(0.372f, 0.0f, 0.54f, -0.222f, 0.54f, -0.674f)
                curveToRelative(0.0f, -0.45f, -0.169f, -0.68f, -0.54f, -0.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.022f, 14.434f)
                arcToRelative(1.131f, 1.131f, 0.0f, false, false, 1.96f, 0.0f)
                lineToRelative(6.857f, -11.667f)
                curveToRelative(0.457f, -0.778f, -0.092f, -1.767f, -0.98f, -1.767f)
                lineTo(1.144f, 1.0f)
                curveToRelative(-0.889f, 0.0f, -1.437f, 0.99f, -0.98f, 1.767f)
                close()
                moveTo(5.506f, 6.232f)
                lineTo(5.506f, 7.0f)
                lineTo(5.11f, 7.0f)
                verticalLineToRelative(-0.76f)
                lineTo(4.44f, 5.0f)
                horizontalLineToRelative(0.44f)
                lineToRelative(0.424f, 0.849f)
                horizontalLineToRelative(0.016f)
                lineTo(5.748f, 5.0f)
                horizontalLineToRelative(0.428f)
                close()
                moveTo(6.628f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.396f)
                lineTo(6.232f, 5.0f)
                close()
                moveTo(7.312f, 6.676f)
                horizontalLineToRelative(0.895f)
                lineTo(8.207f, 7.0f)
                lineTo(6.919f, 7.0f)
                lineTo(6.919f, 5.0f)
                horizontalLineToRelative(1.288f)
                verticalLineToRelative(0.324f)
                horizontalLineToRelative(-0.895f)
                verticalLineToRelative(0.513f)
                horizontalLineToRelative(0.842f)
                verticalLineToRelative(0.303f)
                horizontalLineToRelative(-0.842f)
                close()
                moveTo(8.833f, 6.663f)
                horizontalLineToRelative(0.848f)
                lineTo(9.681f, 7.0f)
                lineTo(8.437f, 7.0f)
                lineTo(8.437f, 5.0f)
                horizontalLineToRelative(0.396f)
                close()
                moveTo(9.803f, 7.0f)
                lineTo(9.803f, 5.0f)
                horizontalLineToRelative(0.73f)
                curveToRelative(0.608f, 0.0f, 0.895f, 0.364f, 0.895f, 0.995f)
                curveToRelative(0.0f, 0.636f, -0.291f, 1.005f, -0.895f, 1.005f)
                close()
            }
        }
        .build()
        return _signYieldFill!!
    }

private var _signYieldFill: ImageVector? = null
