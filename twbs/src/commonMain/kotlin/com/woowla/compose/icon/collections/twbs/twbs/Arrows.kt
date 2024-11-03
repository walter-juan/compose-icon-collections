package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Arrows: ImageVector
    get() {
        if (_arrows != null) {
            return _arrows!!
        }
        _arrows = Builder(name = "Arrows", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.146f, 8.354f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.708f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, 0.708f)
                lineTo(2.707f, 7.5f)
                horizontalLineToRelative(10.586f)
                lineToRelative(-1.147f, -1.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, -0.708f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.708f)
                lineTo(13.293f, 8.5f)
                horizontalLineTo(2.707f)
                lineToRelative(1.147f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                close()
            }
        }
        .build()
        return _arrows!!
    }

private var _arrows: ImageVector? = null
