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

public val RegularGroup.BxStreetView: ImageVector
    get() {
        if (_bxStreetView != null) {
            return _bxStreetView!!
        }
        _bxStreetView = Builder(name = "BxStreetView", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.446f, 11.386f)
                lineToRelative(-0.893f, 1.789f)
                curveTo(19.108f, 13.95f, 20.0f, 14.98f, 20.0f, 16.0f)
                curveToRelative(0.0f, 1.892f, -3.285f, 4.0f, -8.0f, 4.0f)
                reflectiveCurveToRelative(-8.0f, -2.108f, -8.0f, -4.0f)
                curveToRelative(0.0f, -1.02f, 0.892f, -2.05f, 2.446f, -2.825f)
                lineToRelative(-0.893f, -1.789f)
                curveTo(3.295f, 12.512f, 2.0f, 14.193f, 2.0f, 16.0f)
                curveToRelative(0.0f, 3.364f, 4.393f, 6.0f, 10.0f, 6.0f)
                reflectiveCurveToRelative(10.0f, -2.636f, 10.0f, -6.0f)
                curveToRelative(0.0f, -1.807f, -1.295f, -3.488f, -3.554f, -4.614f)
                close()
            }
        }
        .build()
        return _bxStreetView!!
    }

private var _bxStreetView: ImageVector? = null
