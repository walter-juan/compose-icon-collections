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

public val Twbs.ArrowRightShort: ImageVector
    get() {
        if (_arrowRightShort != null) {
            return _arrowRightShort!!
        }
        _arrowRightShort = Builder(name = "ArrowRightShort", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5.793f)
                lineTo(8.146f, 5.354f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, -0.708f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.708f)
                lineTo(10.293f, 8.5f)
                horizontalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 8.0f)
            }
        }
        .build()
        return _arrowRightShort!!
    }

private var _arrowRightShort: ImageVector? = null
