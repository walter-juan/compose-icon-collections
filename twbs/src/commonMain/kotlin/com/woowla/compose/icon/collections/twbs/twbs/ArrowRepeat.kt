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

public val Twbs.ArrowRepeat: ImageVector
    get() {
        if (_arrowRepeat != null) {
            return _arrowRepeat!!
        }
        _arrowRepeat = Builder(name = "ArrowRepeat", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.534f, 7.0f)
                horizontalLineToRelative(3.932f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.192f, 0.41f)
                lineToRelative(-1.966f, 2.36f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.384f, 0.0f)
                lineToRelative(-1.966f, -2.36f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.192f, -0.41f)
                moveToRelative(-11.0f, 2.0f)
                horizontalLineToRelative(3.932f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.192f, -0.41f)
                lineTo(2.692f, 6.23f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.384f, 0.0f)
                lineTo(0.342f, 8.59f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 0.534f, 9.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 3.0f)
                curveToRelative(-1.552f, 0.0f, -2.94f, 0.707f, -3.857f, 1.818f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.771f, -0.636f)
                arcTo(6.002f, 6.002f, 0.0f, false, true, 13.917f, 7.0f)
                horizontalLineTo(12.9f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.0f, 3.0f)
                moveTo(3.1f, 9.0f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, false, 8.757f, 2.182f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.771f, 0.636f)
                arcTo(6.002f, 6.002f, 0.0f, false, true, 2.083f, 9.0f)
                close()
            }
        }
        .build()
        return _arrowRepeat!!
    }

private var _arrowRepeat: ImageVector? = null
