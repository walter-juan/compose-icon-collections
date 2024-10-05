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

public val OutlineGroup.BrandSnapseed: ImageVector
    get() {
        if (_brandSnapseed != null) {
            return _brandSnapseed!!
        }
        _brandSnapseed = Builder(name = "BrandSnapseed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.152f, 3.115f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, -0.609f, 0.0f)
                curveToRelative(-2.943f, 2.58f, -4.529f, 5.441f, -4.543f, 8.378f)
                curveToRelative(0.0f, 2.928f, 1.586f, 5.803f, 4.543f, 8.392f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, 0.61f, 0.0f)
                curveToRelative(2.957f, -2.589f, 4.547f, -5.464f, 4.547f, -8.392f)
                curveToRelative(0.0f, -2.928f, -1.6f, -5.799f, -4.548f, -8.378f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 20.0f)
                lineToRelative(12.09f, -0.011f)
                curveToRelative(0.503f, 0.0f, 0.91f, -0.434f, 0.91f, -0.969f)
                verticalLineToRelative(-6.063f)
                curveToRelative(0.0f, -0.535f, -0.407f, -0.968f, -0.91f, -0.968f)
                horizontalLineToRelative(-7.382f)
            }
        }
        .build()
        return _brandSnapseed!!
    }

private var _brandSnapseed: ImageVector? = null