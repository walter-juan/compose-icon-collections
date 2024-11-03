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

public val Twbs.Clouds: ImageVector
    get() {
        if (_clouds != null) {
            return _clouds!!
        }
        _clouds = Builder(name = "Clouds", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -1.456f, 2.272f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.65f, -0.824f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.789f, -2.896f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.627f, -0.421f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -5.22f, -1.625f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, -1.276f, 0.088f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, true, 7.392f, 0.91f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.0f, 7.5f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.473f, 4.0f)
                horizontalLineToRelative(0.027f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                horizontalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.247f, -5.99f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 7.0f, 5.0f)
                moveToRelative(3.5f, 4.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -6.89f, -0.873f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.51f, 0.375f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 3.0f, 13.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.376f, -2.953f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.624f, -0.492f)
                close()
            }
        }
        .build()
        return _clouds!!
    }

private var _clouds: ImageVector? = null
