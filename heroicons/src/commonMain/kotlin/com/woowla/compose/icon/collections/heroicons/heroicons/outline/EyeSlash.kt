package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.98f, 8.223f)
                curveTo(3.057f, 9.314f, 2.352f, 10.596f, 1.934f, 12.002f)
                curveTo(3.226f, 16.338f, 7.243f, 19.5f, 11.999f, 19.5f)
                curveTo(12.992f, 19.5f, 13.952f, 19.362f, 14.862f, 19.105f)
                moveTo(6.228f, 6.228f)
                curveTo(7.884f, 5.136f, 9.868f, 4.5f, 12.0f, 4.5f)
                curveTo(16.756f, 4.5f, 20.773f, 7.662f, 22.065f, 11.998f)
                curveTo(21.353f, 14.392f, 19.811f, 16.428f, 17.772f, 17.772f)
                moveTo(6.228f, 6.228f)
                lineTo(3.0f, 3.0f)
                moveTo(6.228f, 6.228f)
                lineTo(9.879f, 9.879f)
                moveTo(17.772f, 17.772f)
                lineTo(21.0f, 21.0f)
                moveTo(17.772f, 17.772f)
                lineTo(14.121f, 14.121f)
                moveTo(14.121f, 14.121f)
                curveTo(14.664f, 13.578f, 15.0f, 12.828f, 15.0f, 12.0f)
                curveTo(15.0f, 10.343f, 13.657f, 9.0f, 12.0f, 9.0f)
                curveTo(11.172f, 9.0f, 10.422f, 9.336f, 9.879f, 9.879f)
                moveTo(14.121f, 14.121f)
                lineTo(9.879f, 9.879f)
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
