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

public val RegularGroup.BxCheckShield: ImageVector
    get() {
        if (_bxCheckShield != null) {
            return _bxCheckShield!!
        }
        _bxCheckShield = Builder(name = "BxCheckShield", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.995f, 6.9f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.548f, -0.795f)
                lineToRelative(-8.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.895f, 0.0f)
                lineToRelative(-8.0f, 4.0f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -0.547f, 0.795f)
                curveToRelative(-0.011f, 0.107f, -0.961f, 10.767f, 8.589f, 15.014f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 0.812f, 0.0f)
                curveToRelative(9.55f, -4.247f, 8.6f, -14.906f, 8.589f, -15.014f)
                close()
                moveTo(12.0f, 19.897f)
                curveTo(5.231f, 16.625f, 4.911f, 9.642f, 4.966f, 7.635f)
                lineTo(12.0f, 4.118f)
                lineToRelative(7.029f, 3.515f)
                curveToRelative(0.037f, 1.989f, -0.328f, 9.018f, -7.029f, 12.264f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 12.586f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(11.0f, 15.414f)
                lineToRelative(5.707f, -5.707f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _bxCheckShield!!
    }

private var _bxCheckShield: ImageVector? = null
