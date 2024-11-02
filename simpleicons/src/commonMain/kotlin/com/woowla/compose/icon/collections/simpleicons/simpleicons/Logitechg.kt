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

public val Simpleicons.Logitechg: ImageVector
    get() {
        if (_logitechg != null) {
            return _logitechg!!
        }
        _logitechg = Builder(name = "Logitechg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.566f, 0.0f)
                curveTo(10.91f, 0.0f, 9.352f, 0.314f, 7.889f, 0.941f)
                curveToRelative(-1.479f, 0.627f, -2.766f, 1.483f, -3.859f, 2.568f)
                curveToRelative(-1.094f, 1.085f, -1.955f, 2.359f, -2.582f, 3.822f)
                curveToRelative(-0.643f, 1.447f, -0.957f, 3.0f, -0.941f, 4.656f)
                curveToRelative(0.0f, 1.656f, 0.314f, 3.216f, 0.941f, 4.68f)
                curveToRelative(0.854f, 1.97f, 2.676f, 4.771f, 6.441f, 6.367f)
                curveTo(9.352f, 23.678f, 10.91f, 24.0f, 12.566f, 24.0f)
                verticalLineToRelative(-4.992f)
                curveToRelative(-0.981f, 0.0f, -1.898f, -0.185f, -2.75f, -0.555f)
                curveToRelative(-1.685f, -0.731f, -2.99f, -2.017f, -3.738f, -3.74f)
                curveToRelative(-0.747f, -1.721f, -0.736f, -3.755f, 0.0f, -5.451f)
                curveToRelative(0.737f, -1.698f, 2.032f, -2.998f, 3.738f, -3.738f)
                curveToRelative(0.852f, -0.37f, 1.769f, -0.555f, 2.75f, -0.555f)
                close()
                moveTo(12.736f, 9.842f)
                verticalLineToRelative(4.943f)
                horizontalLineToRelative(5.812f)
                verticalLineToRelative(5.814f)
                horizontalLineToRelative(4.945f)
                lineTo(23.494f, 9.842f)
                close()
            }
        }
        .build()
        return _logitechg!!
    }

private var _logitechg: ImageVector? = null
