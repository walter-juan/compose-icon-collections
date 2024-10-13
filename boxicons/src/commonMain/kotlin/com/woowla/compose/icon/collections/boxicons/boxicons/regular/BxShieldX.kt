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

public val RegularGroup.BxShieldX: ImageVector
    get() {
        if (_bxShieldX != null) {
            return _bxShieldX!!
        }
        _bxShieldX = Builder(name = "BxShieldX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.48f, 6.105f)
                lineToRelative(-8.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.895f, 0.0f)
                lineToRelative(-8.0f, 4.0f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -0.547f, 0.795f)
                curveToRelative(-0.011f, 0.107f, -0.961f, 10.767f, 8.589f, 15.014f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, 0.812f, 0.0f)
                curveToRelative(9.55f, -4.247f, 8.6f, -14.906f, 8.589f, -15.014f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -0.548f, -0.795f)
                close()
                moveTo(12.033f, 19.897f)
                curveTo(5.265f, 16.625f, 4.944f, 9.642f, 4.999f, 7.635f)
                lineToRelative(7.034f, -3.517f)
                lineToRelative(7.029f, 3.515f)
                curveToRelative(0.038f, 1.989f, -0.328f, 9.018f, -7.029f, 12.264f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.293f, 8.293f)
                lineTo(12.0f, 10.586f)
                lineTo(9.707f, 8.293f)
                lineTo(8.293f, 9.707f)
                lineTo(10.586f, 12.0f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(12.0f, 13.414f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.414f, 12.0f)
                lineToRelative(2.293f, -2.293f)
                close()
            }
        }
        .build()
        return _bxShieldX!!
    }

private var _bxShieldX: ImageVector? = null
