package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.BrandBebo: ImageVector
    get() {
        if (_brandBebo != null) {
            return _brandBebo!!
        }
        _brandBebo = Builder(name = "BrandBebo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.838f, -1.159f, -3.002f, -3.005f, -3.372f)
                curveToRelative(-0.746f, -0.15f, -1.37f, -0.745f, -1.37f, -1.506f)
                curveToRelative(0.0f, -1.142f, 0.934f, -2.095f, 2.058f, -1.894f)
                curveToRelative(3.61f, 0.645f, 5.817f, 3.058f, 5.817f, 6.772f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -14.0f, 0.0f)
                verticalLineToRelative(-9.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                verticalLineToRelative(9.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, 3.5f)
            }
        }
        .build()
        return _brandBebo!!
    }

private var _brandBebo: ImageVector? = null
