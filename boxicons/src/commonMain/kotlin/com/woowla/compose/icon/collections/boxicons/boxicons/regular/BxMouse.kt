package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxMouse: ImageVector
    get() {
        if (_bxMouse != null) {
            return _bxMouse!!
        }
        _bxMouse = Builder(name = "BxMouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.975f, 22.0f)
                horizontalLineTo(12.0f)
                curveToRelative(3.859f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -3.841f, -3.127f, -6.974f, -6.981f, -7.0f)
                horizontalLineToRelative(-0.06f)
                curveTo(8.119f, 2.022f, 5.0f, 5.157f, 5.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.86f, 3.129f, 7.0f, 6.975f, 7.0f)
                close()
                moveTo(7.0f, 9.0f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, true, 4.985f, -5.0f)
                curveTo(14.75f, 4.006f, 17.0f, 6.249f, 17.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-0.025f)
                curveTo(9.186f, 20.0f, 7.0f, 17.804f, 7.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bxMouse!!
    }

private var _bxMouse: ImageVector? = null
