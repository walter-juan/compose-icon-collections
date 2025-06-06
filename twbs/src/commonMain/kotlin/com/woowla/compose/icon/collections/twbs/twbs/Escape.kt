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

public val Twbs.Escape: ImageVector
    get() {
        if (_escape != null) {
            return _escape!!
        }
        _escape = Builder(name = "Escape", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.538f, 1.02f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.076f, 0.998f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.445f, 6.444f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.997f, 0.076f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 8.538f, 1.02f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.096f, 7.828f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, -0.707f)
                lineTo(2.707f, 2.025f)
                horizontalLineToRelative(2.768f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineTo(2.732f)
                close()
            }
        }
        .build()
        return _escape!!
    }

private var _escape: ImageVector? = null
