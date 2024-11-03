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

public val Twbs.Virus: ImageVector
    get() {
        if (_virus != null) {
            return _virus!!
        }
        _virus = Builder(name = "Virus", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.402f)
                curveToRelative(0.0f, 0.511f, 0.677f, 0.693f, 0.933f, 0.25f)
                lineToRelative(0.7f, -1.214f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.733f, 1.0f)
                lineToRelative(-0.701f, 1.214f)
                curveToRelative(-0.256f, 0.443f, 0.24f, 0.939f, 0.683f, 0.683f)
                lineToRelative(1.214f, -0.701f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.732f)
                lineToRelative(-1.214f, 0.701f)
                curveToRelative(-0.443f, 0.256f, -0.262f, 0.933f, 0.25f, 0.933f)
                horizontalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-1.402f)
                curveToRelative(-0.512f, 0.0f, -0.693f, 0.677f, -0.25f, 0.933f)
                lineToRelative(1.214f, 0.701f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.732f)
                lineToRelative(-1.214f, -0.7f)
                curveToRelative(-0.443f, -0.257f, -0.939f, 0.24f, -0.683f, 0.682f)
                lineToRelative(0.701f, 1.214f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.732f, 1.0f)
                lineToRelative(-0.701f, -1.214f)
                curveToRelative(-0.256f, -0.443f, -0.933f, -0.262f, -0.933f, 0.25f)
                verticalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-1.402f)
                curveToRelative(0.0f, -0.512f, -0.677f, -0.693f, -0.933f, -0.25f)
                lineToRelative(-0.701f, 1.214f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.732f, -1.0f)
                lineToRelative(0.7f, -1.214f)
                curveToRelative(0.257f, -0.443f, -0.24f, -0.939f, -0.682f, -0.683f)
                lineToRelative(-1.214f, 0.701f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.732f)
                lineToRelative(1.214f, -0.701f)
                curveToRelative(0.443f, -0.256f, 0.261f, -0.933f, -0.25f, -0.933f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.402f)
                curveToRelative(0.511f, 0.0f, 0.693f, -0.677f, 0.25f, -0.933f)
                lineToRelative(-1.214f, -0.701f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.732f)
                lineToRelative(1.214f, 0.701f)
                curveToRelative(0.443f, 0.256f, 0.939f, -0.24f, 0.683f, -0.683f)
                lineToRelative(-0.701f, -1.214f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.732f, -1.0f)
                lineToRelative(0.701f, 1.214f)
                curveToRelative(0.256f, 0.443f, 0.933f, 0.261f, 0.933f, -0.25f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                moveToRelative(2.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveTo(6.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                moveToRelative(5.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
            }
        }
        .build()
        return _virus!!
    }

private var _virus: ImageVector? = null
