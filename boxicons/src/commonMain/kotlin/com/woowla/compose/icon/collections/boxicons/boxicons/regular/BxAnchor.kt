package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxAnchor: ImageVector
    get() {
        if (_bxAnchor != null) {
            return _bxAnchor!!
        }
        _bxAnchor = Builder(name = "BxAnchor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 15.0f)
                lineToRelative(-3.0f, -4.0f)
                lineToRelative(-3.0f, 4.0f)
                horizontalLineToRelative(1.906f)
                curveToRelative(-0.436f, 2.469f, -2.438f, 4.471f, -4.906f, 4.906f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.336f)
                curveToRelative(1.543f, -0.459f, 2.714f, -1.923f, 2.714f, -3.621f)
                curveTo(15.714f, 3.666f, 14.048f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(8.286f, 3.666f, 8.286f, 5.715f)
                curveToRelative(0.0f, 1.698f, 1.171f, 3.162f, 2.714f, 3.621f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.906f)
                curveTo(8.531f, 19.471f, 6.529f, 17.469f, 6.094f, 15.0f)
                horizontalLineTo(8.0f)
                lineToRelative(-3.0f, -4.0f)
                lineToRelative(-3.0f, 4.0f)
                horizontalLineToRelative(2.073f)
                curveToRelative(0.511f, 3.885f, 3.929f, 7.0f, 7.927f, 7.0f)
                reflectiveCurveToRelative(7.416f, -3.115f, 7.927f, -7.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(10.286f, 5.715f)
                curveTo(10.286f, 4.77f, 11.055f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(1.714f, 0.77f, 1.714f, 1.715f)
                curveToRelative(0.0f, 0.951f, -0.801f, 1.785f, -1.714f, 1.785f)
                reflectiveCurveToRelative(-1.714f, -0.834f, -1.714f, -1.785f)
                close()
            }
        }
        .build()
        return _bxAnchor!!
    }

private var _bxAnchor: ImageVector? = null
