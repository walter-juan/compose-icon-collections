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

public val Simpleicons.Bytedance: ImageVector
    get() {
        if (_bytedance != null) {
            return _bytedance!!
        }
        _bytedance = Builder(name = "Bytedance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.877f, 1.469f)
                lineTo(24.0f, 2.533f)
                verticalLineToRelative(18.943f)
                lineToRelative(-4.123f, 1.056f)
                lineTo(19.877f, 1.469f)
                close()
                moveTo(6.529f, 10.897f)
                lineToRelative(4.115f, 1.064f)
                verticalLineToRelative(8.979f)
                lineToRelative(-4.115f, 1.064f)
                verticalLineToRelative(-11.107f)
                close()
                moveTo(0.0f, 2.572f)
                lineToRelative(4.115f, 1.064f)
                verticalLineToRelative(16.735f)
                lineTo(0.0f, 21.428f)
                lineTo(0.0f, 2.572f)
                close()
                moveTo(17.455f, 8.193f)
                verticalLineToRelative(11.107f)
                lineToRelative(-4.123f, -1.064f)
                lineTo(13.332f, 9.257f)
                lineToRelative(4.123f, -1.064f)
                close()
            }
        }
        .build()
        return _bytedance!!
    }

private var _bytedance: ImageVector? = null
