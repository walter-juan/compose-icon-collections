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

public val Simpleicons.Sunrise: ImageVector
    get() {
        if (_sunrise != null) {
            return _sunrise!!
        }
        _sunrise = Builder(name = "Sunrise", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 11.999f)
                arcTo(12.011f, 12.011f, 0.0f, false, false, 12.001f, 0.0f)
                moveToRelative(0.0f, 2.464f)
                arcToRelative(9.53f, 9.53f, 0.0f, false, true, 9.513f, 8.889f)
                arcToRelative(9.53f, 9.53f, 0.0f, false, true, -0.862f, 4.649f)
                horizontalLineTo(3.349f)
                arcToRelative(9.53f, 9.53f, 0.0f, false, true, 0.616f, -9.14f)
                arcToRelative(9.53f, 9.53f, 0.0f, false, true, 8.036f, -4.398f)
            }
        }
        .build()
        return _sunrise!!
    }

private var _sunrise: ImageVector? = null
