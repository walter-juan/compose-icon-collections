package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.ArrowReturnRight: ImageVector
    get() {
        if (_arrowReturnRight != null) {
            return _arrowReturnRight!!
        }
        _arrowReturnRight = Builder(name = "ArrowReturnRight", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 1.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 1.0f, 2.0f)
                verticalLineToRelative(4.8f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(9.793f)
                lineToRelative(-3.347f, 3.346f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.708f)
                lineToRelative(4.2f, -4.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.708f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, 0.708f)
                lineTo(13.293f, 8.3f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 6.8f)
                verticalLineTo(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
            }
        }
        .build()
        return _arrowReturnRight!!
    }

private var _arrowReturnRight: ImageVector? = null
