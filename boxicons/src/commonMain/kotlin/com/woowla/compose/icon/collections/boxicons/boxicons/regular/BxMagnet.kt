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

public val RegularGroup.BxMagnet: ImageVector
    get() {
        if (_bxMagnet != null) {
            return _bxMagnet!!
        }
        _bxMagnet = Builder(name = "BxMagnet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(10.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 4.963f, 4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(16.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(16.0f, 5.0f)
                close()
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 8.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 3.859f, -3.141f, 7.0f, -7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _bxMagnet!!
    }

private var _bxMagnet: ImageVector? = null
