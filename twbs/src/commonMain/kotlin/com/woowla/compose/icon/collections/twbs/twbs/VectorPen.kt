package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val Twbs.VectorPen: ImageVector
    get() {
        if (_vectorPen != null) {
            return _vectorPen!!
        }
        _vectorPen = Builder(name = "VectorPen", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.646f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineToRelative(-1.902f, 1.902f)
                lineToRelative(-0.829f, 3.313f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.024f, 1.073f)
                lineTo(1.254f, 14.746f)
                lineTo(4.358f, 4.4f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.43f, 3.377f)
                lineToRelative(3.313f, -0.828f)
                close()
                moveTo(8.846f, 3.554f)
                lineTo(5.673f, 4.347f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.358f, 0.342f)
                lineToRelative(-2.57f, 8.565f)
                lineToRelative(8.567f, -2.57f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.34f, -0.357f)
                lineToRelative(0.794f, -3.174f)
                lineToRelative(-3.6f, -3.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.832f, 13.228f)
                lineTo(8.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, -1.0f)
                lineToRelative(-4.228f, 5.168f)
                lineToRelative(-0.026f, 0.086f)
                close()
            }
        }
        .build()
        return _vectorPen!!
    }

private var _vectorPen: ImageVector? = null
