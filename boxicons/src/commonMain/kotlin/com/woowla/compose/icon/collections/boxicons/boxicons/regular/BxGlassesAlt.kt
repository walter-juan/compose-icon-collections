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

public val RegularGroup.BxGlassesAlt: ImageVector
    get() {
        if (_bxGlassesAlt != null) {
            return _bxGlassesAlt!!
        }
        _bxGlassesAlt = Builder(name = "BxGlassesAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.948f, 11.684f)
                lineToRelative(-2.0f, -6.0f)
                arcTo(0.997f, 0.997f, 0.0f, false, false, 19.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.279f)
                lineToRelative(1.334f, 4.0f)
                lineTo(15.0f, 11.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(4.387f, 11.0f)
                lineToRelative(1.334f, -4.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.948f, 0.684f)
                lineToRelative(-2.0f, 6.0f)
                lineToRelative(0.012f, 0.004f)
                arcTo(0.928f, 0.928f, 0.0f, false, false, 2.0f, 12.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.964f, 0.964f, 0.0f, false, false, -0.063f, -0.313f)
                lineToRelative(0.011f, -0.003f)
                close()
                moveTo(9.0f, 16.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 17.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(20.0f, 16.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bxGlassesAlt!!
    }

private var _bxGlassesAlt: ImageVector? = null
