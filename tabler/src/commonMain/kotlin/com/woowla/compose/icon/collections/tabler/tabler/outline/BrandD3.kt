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

public val OutlineGroup.BrandD3: ImageVector
    get() {
        if (_brandD3 != null) {
            return _brandD3!!
        }
        _brandD3 = Builder(name = "BrandD3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                horizontalLineToRelative(1.8f)
                curveToRelative(3.976f, 0.0f, 7.2f, 3.582f, 7.2f, 8.0f)
                reflectiveCurveToRelative(-3.224f, 8.0f, -7.2f, 8.0f)
                horizontalLineToRelative(-1.8f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                horizontalLineToRelative(5.472f)
                curveToRelative(1.948f, 0.0f, 3.528f, 1.79f, 3.528f, 4.0f)
                reflectiveCurveToRelative(-1.58f, 4.0f, -3.528f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.472f, 12.0f)
                horizontalLineToRelative(-2.472f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.472f, 12.0f)
                horizontalLineToRelative(-2.352f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.472f, 12.0f)
                curveToRelative(1.948f, 0.0f, 3.528f, 1.79f, 3.528f, 4.0f)
                reflectiveCurveToRelative(-1.58f, 4.0f, -3.528f, 4.0f)
                horizontalLineToRelative(-5.472f)
            }
        }
        .build()
        return _brandD3!!
    }

private var _brandD3: ImageVector? = null
