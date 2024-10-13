package com.woowla.compose.icon.collections.devicons.devicons.html5

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
import com.woowla.compose.icon.collections.devicons.devicons.Html5Group

public val Html5Group.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFE44D26)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.04f, 113.88f)
                lineTo(9.03f, 1.66f)
                horizontalLineToRelative(109.94f)
                lineToRelative(-10.02f, 112.2f)
                lineToRelative(-45.02f, 12.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF16529)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 116.8f)
                lineToRelative(36.38f, -10.09f)
                lineToRelative(8.56f, -95.88f)
                horizontalLineTo(64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEBEBEB)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 52.46f)
                lineTo(45.79f, 52.46f)
                lineTo(44.53f, 38.36f)
                lineTo(64.0f, 38.36f)
                lineTo(64.0f, 24.6f)
                lineTo(29.49f, 24.6f)
                lineToRelative(0.33f, 3.69f)
                lineToRelative(3.38f, 37.93f)
                lineTo(64.0f, 66.22f)
                close()
                moveTo(64.0f, 88.2f)
                lineToRelative(-0.06f, 0.02f)
                lineToRelative(-15.33f, -4.14f)
                lineToRelative(-0.98f, -10.98f)
                lineTo(33.82f, 73.1f)
                lineToRelative(1.93f, 21.61f)
                lineToRelative(28.19f, 7.83f)
                lineToRelative(0.06f, -0.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.95f, 52.46f)
                verticalLineToRelative(13.76f)
                horizontalLineToRelative(16.95f)
                lineToRelative(-1.6f, 17.85f)
                lineToRelative(-15.35f, 4.14f)
                verticalLineToRelative(14.32f)
                lineToRelative(28.22f, -7.82f)
                lineToRelative(0.21f, -2.33f)
                lineToRelative(3.23f, -36.23f)
                lineToRelative(0.34f, -3.7f)
                horizontalLineToRelative(-3.71f)
                close()
                moveTo(63.95f, 24.6f)
                verticalLineToRelative(13.76f)
                horizontalLineToRelative(33.24f)
                lineToRelative(0.28f, -3.09f)
                lineToRelative(0.63f, -6.98f)
                lineToRelative(0.33f, -3.69f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
