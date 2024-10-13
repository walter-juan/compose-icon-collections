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

public val RegularGroup.BxShapeSquare: ImageVector
    get() {
        if (_bxShapeSquare != null) {
            return _bxShapeSquare!!
        }
        _bxShapeSquare = Builder(name = "BxShapeSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, -2.815f, 2.0f)
                horizontalLineToRelative(-6.37f)
                arcTo(2.993f, 2.993f, 0.0f, false, false, 6.0f, 3.0f)
                curveTo(4.346f, 3.0f, 3.0f, 4.346f, 3.0f, 6.0f)
                curveToRelative(0.0f, 1.302f, 0.839f, 2.401f, 2.0f, 2.815f)
                verticalLineToRelative(6.369f)
                arcTo(2.997f, 2.997f, 0.0f, false, false, 3.0f, 18.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, 2.815f, -2.0f)
                horizontalLineToRelative(6.369f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, false, 2.815f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                arcToRelative(2.997f, 2.997f, 0.0f, false, false, -2.0f, -2.816f)
                lineTo(18.999f, 8.816f)
                arcTo(2.996f, 2.996f, 0.0f, false, false, 21.0f, 6.0f)
                close()
                moveTo(18.0f, 5.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, true, true, -1.0f, 1.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(15.185f, 17.0f)
                horizontalLineToRelative(-6.37f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 7.0f, 15.184f)
                lineTo(7.0f, 8.816f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 8.815f, 7.0f)
                horizontalLineToRelative(6.369f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 17.0f, 8.815f)
                verticalLineToRelative(6.369f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 15.185f, 17.0f)
                close()
                moveTo(6.0f, 5.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, true, true, -1.0f, 1.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(6.0f, 19.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, true, 0.0f, -2.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(18.0f, 19.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, true, 0.0f, -2.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxShapeSquare!!
    }

private var _bxShapeSquare: ImageVector? = null
