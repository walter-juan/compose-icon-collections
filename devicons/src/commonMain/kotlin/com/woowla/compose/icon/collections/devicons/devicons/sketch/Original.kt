package com.woowla.compose.icon.collections.devicons.devicons.sketch

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
import com.woowla.compose.icon.collections.devicons.devicons.SketchGroup

public val SketchGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFfdb300)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.93f, 10.33f)
                lineTo(64.0f, 6.55f)
                lineToRelative(36.07f, 3.79f)
                lineTo(128.0f, 47.52f)
                lineToRelative(-64.0f, 73.94f)
                lineTo(0.0f, 47.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFFea6c00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.92f, 47.52f)
                lineTo(64.0f, 121.45f)
                lineTo(0.0f, 47.52f)
                close()
                moveTo(102.07f, 47.52f)
                lineTo(64.0f, 121.45f)
                lineToRelative(64.0f, -73.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfdad00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.92f, 47.52f)
                horizontalLineToRelative(76.15f)
                lineTo(64.0f, 121.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfdd231)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(64.0f, 6.55f)
                lineToRelative(-36.07f, 3.79f)
                lineToRelative(-2.01f, 37.18f)
                close()
                moveTo(64.0f, 6.55f)
                lineTo(100.07f, 10.33f)
                lineTo(102.07f, 47.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfdad00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(128.0f, 47.52f)
                lineToRelative(-27.93f, -37.18f)
                lineToRelative(2.01f, 37.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfeeeb7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(64.0f, 6.55f)
                lineToRelative(-38.08f, 40.97f)
                horizontalLineToRelative(76.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfdad00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 47.52f)
                lineToRelative(27.93f, -37.18f)
                lineToRelative(-2.01f, 37.18f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
