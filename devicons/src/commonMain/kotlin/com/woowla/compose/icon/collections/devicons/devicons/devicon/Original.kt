package com.woowla.compose.icon.collections.devicons.devicons.devicon

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
import com.woowla.compose.icon.collections.devicons.devicons.DeviconGroup

public val DeviconGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF558d6c)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.92f, 8.0f)
                lineToRelative(10.17f, 87.05f)
                lineTo(64.0f, 119.95f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5aa579)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 8.0f)
                verticalLineToRelative(111.95f)
                lineToRelative(0.05f, 0.05f)
                lineToRelative(48.93f, -24.91f)
                lineTo(123.08f, 8.0f)
                horizontalLineTo(64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF60be86)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.84f, 22.11f)
                lineToRelative(6.49f, 65.18f)
                lineTo(64.0f, 105.97f)
                verticalLineTo(22.11f)
                horizontalLineTo(18.84f)
                close()
            }
            path(fill = SolidColor(Color(0xFF65d693)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 22.11f)
                verticalLineToRelative(83.86f)
                lineToRelative(0.05f, 0.05f)
                lineToRelative(38.69f, -18.76f)
                lineToRelative(6.42f, -65.15f)
                horizontalLineTo(64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5aa579)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.72f, 54.9f)
                lineTo(73.14f, 39.42f)
                lineToRelative(-1.83f, -0.9f)
                lineToRelative(-1.12f, 2.28f)
                lineTo(64.0f, 53.41f)
                verticalLineTo(68.3f)
                lineToRelative(9.15f, -18.08f)
                lineToRelative(21.5f, 9.57f)
                lineToRelative(-23.09f, 10.37f)
                lineToRelative(-0.87f, 0.47f)
                verticalLineToRelative(10.88f)
                lineTo(73.0f, 80.38f)
                lineToRelative(32.78f, -15.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.92f, -2.0f)
                verticalLineToRelative(-5.78f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.98f, -2.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF558d6c)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 69.39f)
                lineToRelative(-21.79f, -9.6f)
                lineToRelative(23.3f, -10.37f)
                lineToRelative(1.76f, -0.7f)
                verticalLineTo(37.76f)
                lineToRelative(-3.4f, 1.44f)
                lineToRelative(-33.93f, 15.69f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, -1.28f, 2.0f)
                verticalLineToRelative(5.77f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, false, 1.24f, 2.0f)
                lineToRelative(33.44f, 15.52f)
                lineToRelative(2.0f, 0.9f)
                lineToRelative(1.21f, -2.26f)
                lineTo(64.0f, 68.3f)
                verticalLineTo(53.41f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
