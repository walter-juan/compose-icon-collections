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

public val RegularGroup.BxHeadphone: ImageVector
    get() {
        if (_bxHeadphone != null) {
            return _bxHeadphone!!
        }
        _bxHeadphone = Builder(name = "BxHeadphone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                verticalLineToRelative(-1.707f)
                curveToRelative(0.0f, -4.442f, -3.479f, -8.161f, -7.755f, -8.29f)
                curveToRelative(-2.204f, -0.051f, -4.251f, 0.736f, -5.816f, 2.256f)
                arcTo(7.933f, 7.933f, 0.0f, false, false, 4.0f, 10.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.0f)
                arcToRelative(5.95f, 5.95f, 0.0f, false, true, 1.821f, -4.306f)
                arcToRelative(5.977f, 5.977f, 0.0f, false, true, 4.363f, -1.691f)
                curveTo(15.392f, 4.099f, 18.0f, 6.921f, 18.0f, 10.293f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                lineTo(7.0f, 20.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bxHeadphone!!
    }

private var _bxHeadphone: ImageVector? = null
