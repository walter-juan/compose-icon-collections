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

public val RegularGroup.BxHomeSmile: ImageVector
    get() {
        if (_bxHomeSmile != null) {
            return _bxHomeSmile!!
        }
        _bxHomeSmile = Builder(name = "BxHomeSmile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -1.707f)
                lineToRelative(-9.0f, -9.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-9.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 13.0f)
                close()
                moveTo(12.0f, 4.414f)
                lineTo(18.0f, 10.414f)
                lineTo(18.0f, 15.0f)
                lineToRelative(0.001f, 5.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-9.586f)
                lineToRelative(6.0f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveToRelative(3.703f, 0.0f, 4.901f, -3.539f, 4.95f, -3.689f)
                lineToRelative(-1.9f, -0.621f)
                curveToRelative(-0.008f, 0.023f, -0.781f, 2.31f, -3.05f, 2.31f)
                curveToRelative(-2.238f, 0.0f, -3.02f, -2.221f, -3.051f, -2.316f)
                lineToRelative(-1.899f, 0.627f)
                curveTo(7.099f, 14.461f, 8.297f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _bxHomeSmile!!
    }

private var _bxHomeSmile: ImageVector? = null
