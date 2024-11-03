package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val Twbs.ArrowCounterclockwise: ImageVector
    get() {
        if (_arrowCounterclockwise != null) {
            return _arrowCounterclockwise!!
        }
        _arrowCounterclockwise = Builder(name = "ArrowCounterclockwise", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -4.546f, 2.914f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.908f, -0.417f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 8.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.466f)
                verticalLineTo(0.534f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.41f, -0.192f)
                lineTo(5.23f, 2.308f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, 0.384f)
                lineToRelative(2.36f, 1.966f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 8.0f, 4.466f)
            }
        }
        .build()
        return _arrowCounterclockwise!!
    }

private var _arrowCounterclockwise: ImageVector? = null
