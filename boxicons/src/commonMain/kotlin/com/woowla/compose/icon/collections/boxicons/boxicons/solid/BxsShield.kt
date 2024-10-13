package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsShield: ImageVector
    get() {
        if (_bxsShield != null) {
            return _bxsShield!!
        }
        _bxsShield = Builder(name = "BxsShield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.496f, 6.106f)
                lineToRelative(-7.973f, -4.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.895f, -0.002f)
                lineToRelative(-8.027f, 4.0f)
                curveToRelative(-0.297f, 0.15f, -0.502f, 0.437f, -0.544f, 0.767f)
                curveToRelative(-0.013f, 0.097f, -1.145f, 9.741f, 8.541f, 15.008f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, 0.969f, -0.009f)
                curveToRelative(9.307f, -5.259f, 8.514f, -14.573f, 8.476f, -14.967f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.547f, -0.797f)
                close()
            }
        }
        .build()
        return _bxsShield!!
    }

private var _bxsShield: ImageVector? = null
