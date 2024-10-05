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

public val OutlineGroup.BrandAmie: ImageVector
    get() {
        if (_brandAmie != null) {
            return _brandAmie!!
        }
        _brandAmie = Builder(name = "BrandAmie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 8.5f)
                curveToRelative(0.0f, 1.33f, 0.472f, 2.55f, 1.257f, 3.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 7.743f, 7.743f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 7.743f, -7.743f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -7.743f, -7.743f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -9.0f, 4.243f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, 0.895f, -1.5f, 2.0f, -1.5f)
                reflectiveCurveToRelative(2.0f, 0.672f, 2.0f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.828f, -0.895f, 1.5f, -2.0f, 1.5f)
                reflectiveCurveToRelative(-2.0f, -0.672f, -2.0f, -1.5f)
                close()
            }
        }
        .build()
        return _brandAmie!!
    }

private var _brandAmie: ImageVector? = null
