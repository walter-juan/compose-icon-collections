package com.woowla.compose.icon.collections.devicons.devicons.css3

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
import com.woowla.compose.icon.collections.devicons.devicons.Css3Group

public val Css3Group.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1572B6)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.81f, 114.12f)
                lineTo(8.76f, 1.35f)
                horizontalLineToRelative(110.48f)
                lineToRelative(-10.06f, 112.75f)
                lineToRelative(-45.24f, 12.54f)
                lineToRelative(-45.12f, -12.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF33A9DC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 117.06f)
                lineToRelative(36.56f, -10.14f)
                lineToRelative(8.6f, -96.35f)
                horizontalLineToRelative(-45.16f)
                verticalLineToRelative(106.49f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 51.43f)
                horizontalLineToRelative(18.3f)
                lineToRelative(1.26f, -14.16f)
                horizontalLineTo(64.0f)
                verticalLineTo(23.43f)
                horizontalLineToRelative(34.68f)
                lineToRelative(-0.33f, 3.71f)
                lineToRelative(-3.4f, 38.11f)
                horizontalLineToRelative(-30.95f)
                verticalLineTo(51.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEBEBEB)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.08f, 87.35f)
                lineToRelative(-0.06f, 0.02f)
                lineToRelative(-15.4f, -4.16f)
                lineToRelative(-0.99f, -11.03f)
                horizontalLineTo(33.75f)
                lineToRelative(1.94f, 21.72f)
                lineToRelative(28.33f, 7.86f)
                lineToRelative(0.06f, -0.02f)
                verticalLineToRelative(-14.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(81.13f, 64.68f)
                lineToRelative(-1.67f, 18.52f)
                lineToRelative(-15.43f, 4.16f)
                verticalLineToRelative(14.39f)
                lineToRelative(28.35f, -7.86f)
                lineToRelative(0.21f, -2.34f)
                lineToRelative(2.41f, -26.88f)
                horizontalLineTo(81.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEBEBEB)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.05f, 23.43f)
                verticalLineToRelative(13.83f)
                lineTo(30.64f, 37.27f)
                lineToRelative(-0.28f, -3.11f)
                lineToRelative(-0.63f, -7.01f)
                lineToRelative(-0.33f, -3.71f)
                horizontalLineToRelative(34.65f)
                close()
                moveTo(64.0f, 51.43f)
                verticalLineToRelative(13.83f)
                lineTo(48.79f, 65.26f)
                lineToRelative(-0.28f, -3.11f)
                lineToRelative(-0.63f, -7.01f)
                lineToRelative(-0.33f, -3.71f)
                horizontalLineToRelative(16.45f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
