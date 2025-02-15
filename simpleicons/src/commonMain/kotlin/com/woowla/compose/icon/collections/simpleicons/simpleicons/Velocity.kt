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

public val Simpleicons.Velocity: ImageVector
    get() {
        if (_velocity != null) {
            return _velocity!!
        }
        _velocity = Builder(name = "Velocity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.623f, 6.719f)
                lineToRelative(-4.752f, 0.959f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.44f, 0.324f)
                lineTo(0.083f, 12.248f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 0.045f, 0.701f)
                lineToRelative(2.986f, 4.076f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, false, 0.657f, 0.256f)
                lineToRelative(4.736f, -0.957f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 0.363f, -0.215f)
                horizontalLineToRelative(11.694f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, false, 0.0f, -1.084f)
                horizontalLineToRelative(-2.95f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, -0.394f, -0.152f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, 0.0f, -0.78f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.394f, -0.152f)
                horizontalLineToRelative(5.875f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, 0.512f, -0.33f)
                verticalLineToRelative(-0.422f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, -0.512f, -0.33f)
                horizontalLineToRelative(-9.79f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, true, -0.544f, -0.543f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.543f, -0.54f)
                horizontalLineToRelative(5.85f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, false, 0.525f, -0.542f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.525f, -0.543f)
                horizontalLineTo(15.68f)
                arcToRelative(0.54f, 0.54f, 0.0f, true, true, 0.0f, -1.082f)
                horizontalLineToRelative(5.86f)
                arcToRelative(0.546f, 0.546f, 0.0f, false, false, 0.524f, -0.543f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.525f, -0.54f)
                horizontalLineTo(9.416f)
                lineTo(8.279f, 6.972f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.656f, -0.254f)
                moveTo(7.576f, 7.77f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, 0.207f, 0.715f)
                lineToRelative(-1.451f, 2.631f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, 0.059f, 0.945f)
                lineTo(8.1f, 14.39f)
                arcToRelative(0.528f, 0.528f, 0.0f, false, true, -0.854f, 0.623f)
                lineToRelative(-1.709f, -2.326f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, -0.88f, -0.344f)
                lineToRelative(-2.897f, 0.586f)
                arcToRelative(0.523f, 0.523f, 0.0f, false, true, -0.621f, -0.412f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, 0.41f, -0.621f)
                lineToRelative(3.14f, -0.635f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.596f, -0.438f)
                lineToRelative(1.576f, -2.845f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, true, 0.715f, -0.206f)
                moveToRelative(13.608f, 2.92f)
                arcToRelative(0.54f, 0.54f, 0.0f, true, false, -0.001f, 1.082f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.0f, -1.082f)
            }
        }
        .build()
        return _velocity!!
    }

private var _velocity: ImageVector? = null
