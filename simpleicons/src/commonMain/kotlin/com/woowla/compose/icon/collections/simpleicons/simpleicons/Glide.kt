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

public val Simpleicons.Glide: ImageVector
    get() {
        if (_glide != null) {
            return _glide!!
        }
        _glide = Builder(name = "Glide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8f, 17.52f)
                arcToRelative(6.72f, 6.72f, 0.0f, false, true, 6.72f, -6.72f)
                horizontalLineTo(24.0f)
                lineTo(10.8f, 24.0f)
                close()
                moveTo(0.0f, 13.2f)
                lineTo(13.2f, 0.0f)
                verticalLineToRelative(6.48f)
                arcToRelative(6.72f, 6.72f, 0.0f, false, true, -6.72f, 6.72f)
                close()
            }
        }
        .build()
        return _glide!!
    }

private var _glide: ImageVector? = null
