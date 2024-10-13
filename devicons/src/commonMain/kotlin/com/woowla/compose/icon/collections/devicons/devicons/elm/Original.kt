package com.woowla.compose.icon.collections.devicons.devicons.elm

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
import com.woowla.compose.icon.collections.devicons.devicons.ElmGroup

public val ElmGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFefa500)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 60.74f)
                lineToRelative(25.65f, -25.65f)
                horizontalLineToRelative(-51.3f)
                lineTo(64.0f, 60.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8dd737)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.91f, 4.65f)
                lineToRelative(25.83f, 25.84f)
                horizontalLineToRelative(56.17f)
                lineTo(64.07f, 4.65f)
                horizontalLineTo(7.91f)
                close()
                moveTo(67.26f, 63.99f)
                lineToRelative(28.08f, -28.08f)
                lineToRelative(27.95f, 27.95f)
                lineToRelative(-28.08f, 28.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF60b5cc)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(123.35f, 57.42f)
                verticalLineTo(4.65f)
                horizontalLineTo(70.58f)
                lineToRelative(52.77f, 52.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF34495e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.74f, 64.0f)
                lineTo(4.65f, 7.91f)
                verticalLineTo(120.1f)
                lineTo(60.74f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFefa500)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.47f, 95.21f)
                lineToRelative(24.88f, 24.89f)
                verticalLineTo(70.33f)
                lineTo(98.47f, 95.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF60b5cc)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 67.26f)
                lineTo(7.91f, 123.35f)
                horizontalLineToRelative(112.18f)
                lineTo(64.0f, 67.26f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
