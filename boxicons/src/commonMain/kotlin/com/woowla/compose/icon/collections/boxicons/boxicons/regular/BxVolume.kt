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

public val RegularGroup.BxVolume: ImageVector
    get() {
        if (_bxVolume != null) {
            return _bxVolume!!
        }
        _bxVolume = Builder(name = "BxVolume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 17.0f)
                horizontalLineToRelative(2.697f)
                lineToRelative(5.748f, 3.832f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, 1.027f, 0.05f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 20.0f)
                lineTo(14.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.554f, -0.832f)
                lineTo(6.697f, 7.0f)
                lineTo(4.0f, 7.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(4.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.033f, 0.0f, 0.061f, -0.016f, 0.093f, -0.019f)
                arcToRelative(1.027f, 1.027f, 0.0f, false, false, 0.379f, -0.116f)
                curveToRelative(0.026f, -0.014f, 0.057f, -0.017f, 0.082f, -0.033f)
                lineTo(12.0f, 5.868f)
                verticalLineToRelative(12.264f)
                lineToRelative(-4.445f, -2.964f)
                curveToRelative(-0.025f, -0.018f, -0.056f, -0.02f, -0.082f, -0.033f)
                arcToRelative(0.977f, 0.977f, 0.0f, false, false, -0.382f, -0.116f)
                curveTo(7.059f, 15.016f, 7.032f, 15.0f, 7.0f, 15.0f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bxVolume!!
    }

private var _bxVolume: ImageVector? = null
