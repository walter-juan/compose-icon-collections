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

public val Twbs.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                moveToRelative(2.0f, -3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveToRelative(4.0f, 8.0f)
                curveToRelative(0.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(3.0f)
                reflectiveCurveToRelative(-1.0f, 0.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, -4.0f, 6.0f, -4.0f)
                reflectiveCurveToRelative(6.0f, 3.0f, 6.0f, 4.0f)
                moveToRelative(-1.0f, -0.004f)
                curveToRelative(-0.001f, -0.246f, -0.154f, -0.986f, -0.832f, -1.664f)
                curveTo(11.516f, 10.68f, 10.289f, 10.0f, 8.0f, 10.0f)
                reflectiveCurveToRelative(-3.516f, 0.68f, -4.168f, 1.332f)
                curveToRelative(-0.678f, 0.678f, -0.83f, 1.418f, -0.832f, 1.664f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
