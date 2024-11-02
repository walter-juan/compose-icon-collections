package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Ethers: ImageVector
    get() {
        if (_ethers != null) {
            return _ethers!!
        }
        _ethers = Builder(name = "Ethers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.443f)
                curveToRelative(-12.547f, 1.64f, -21.503f, 3.61f, -21.636f, -4.474f)
                curveToRelative(0.0f, 0.0f, 0.274f, -3.133f, 4.116f, -3.33f)
                curveToRelative(0.0f, 0.0f, 0.13f, -2.782f, 3.065f, -3.097f)
                curveToRelative(1.578f, -0.171f, 3.37f, 1.454f, 3.565f, 3.165f)
                curveToRelative(0.0f, 0.0f, 3.883f, -0.719f, 4.051f, 3.067f)
                curveToRelative(0.059f, 1.32f, -0.238f, 3.563f, -3.983f, 3.465f)
                curveToRelative(0.0f, 0.0f, -2.167f, -0.294f, -2.461f, -3.644f)
                curveToRelative(-0.61f, 6.485f, 8.767f, 6.108f, 8.902f, 0.218f)
                curveToRelative(0.06f, -2.547f, -1.572f, -5.167f, -5.246f, -4.676f)
                curveToRelative(-2.014f, -5.066f, -7.375f, -4.775f, -9.37f, -0.076f)
                curveToRelative(-2.854f, 0.0f, -5.035f, 2.196f, -5.003f, 5.064f)
                curveToRelative(0.11f, 9.23f, 12.954f, 6.447f, 24.0f, 4.318f)
                close()
            }
        }
        .build()
        return _ethers!!
    }

private var _ethers: ImageVector? = null
