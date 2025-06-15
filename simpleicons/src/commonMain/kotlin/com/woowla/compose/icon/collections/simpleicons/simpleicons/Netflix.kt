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

public val Simpleicons.Netflix: ImageVector
    get() {
        if (_netflix != null) {
            return _netflix!!
        }
        _netflix = Builder(name = "Netflix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.398f, 0.0f)
                lineToRelative(8.348f, 23.602f)
                curveToRelative(2.346f, 0.059f, 4.856f, 0.398f, 4.856f, 0.398f)
                lineTo(10.113f, 0.0f)
                lineTo(5.398f, 0.0f)
                close()
                moveTo(13.887f, 0.0f)
                verticalLineToRelative(9.172f)
                lineToRelative(4.715f, 13.33f)
                lineTo(18.602f, 0.0f)
                horizontalLineToRelative(-4.715f)
                close()
                moveTo(5.398f, 1.5f)
                lineTo(5.398f, 24.0f)
                curveToRelative(1.873f, -0.225f, 2.81f, -0.312f, 4.715f, -0.398f)
                lineTo(10.113f, 14.83f)
                lineTo(5.398f, 1.5f)
                close()
            }
        }
        .build()
        return _netflix!!
    }

private var _netflix: ImageVector? = null
