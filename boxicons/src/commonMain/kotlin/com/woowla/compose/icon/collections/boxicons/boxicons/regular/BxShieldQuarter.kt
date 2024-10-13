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

public val RegularGroup.BxShieldQuarter: ImageVector
    get() {
        if (_bxShieldQuarter != null) {
            return _bxShieldQuarter!!
        }
        _bxShieldQuarter = Builder(name = "BxShieldQuarter", defaultWidth = 24.0.dp, defaultHeight =
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
                verticalLineTo(12.0f)
                horizontalLineTo(5.51f)
                arcToRelative(15.473f, 15.473f, 0.0f, false, true, -0.544f, -4.365f)
                lineTo(12.0f, 4.118f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(6.46f)
                curveToRelative(-0.759f, 2.74f, -2.498f, 5.979f, -6.46f, 7.897f)
                close()
            }
        }
        .build()
        return _bxShieldQuarter!!
    }

private var _bxShieldQuarter: ImageVector? = null
