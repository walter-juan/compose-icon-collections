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

public val Simpleicons.Fastapi: ImageVector
    get() {
        if (_fastapi != null) {
            return _fastapi!!
        }
        _fastapi = Builder(name = "Fastapi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.039f)
                curveTo(5.373f, 0.038f, 0.0f, 5.393f, 0.0f, 11.999f)
                curveToRelative(-0.001f, 6.607f, 5.372f, 11.963f, 12.0f, 11.962f)
                curveToRelative(6.628f, 0.0f, 12.001f, -5.356f, 12.0f, -11.962f)
                curveToRelative(-0.0f, -6.606f, -5.373f, -11.96f, -12.0f, -11.96f)
                moveToRelative(-0.829f, 5.415f)
                horizontalLineToRelative(7.55f)
                lineToRelative(-7.581f, 5.328f)
                horizontalLineToRelative(5.183f)
                lineTo(5.279f, 18.544f)
                quadToRelative(2.947f, -6.544f, 5.892f, -13.09f)
            }
        }
        .build()
        return _fastapi!!
    }

private var _fastapi: ImageVector? = null
