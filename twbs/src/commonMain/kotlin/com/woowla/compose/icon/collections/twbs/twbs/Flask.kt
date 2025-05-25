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

public val Twbs.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(5.36f)
                lineTo(0.503f, 13.717f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.783f, 16.0f)
                horizontalLineToRelative(12.434f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.28f, -2.282f)
                lineTo(11.0f, 6.359f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(10.0f, 2.0f)
                horizontalLineTo(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.22f)
                lineToRelative(0.61f, 1.0f)
                horizontalLineTo(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.442f)
                lineToRelative(0.611f, 1.0f)
                horizontalLineTo(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.664f)
                lineToRelative(0.611f, 1.0f)
                horizontalLineTo(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.886f)
                lineToRelative(0.758f, 1.24f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.427f, 0.76f)
                horizontalLineTo(1.783f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.427f, -0.76f)
                lineToRelative(4.57f, -7.48f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 6.0f, 6.5f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
