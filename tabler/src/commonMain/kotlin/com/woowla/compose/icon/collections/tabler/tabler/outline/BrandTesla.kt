package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.BrandTesla: ImageVector
    get() {
        if (_brandTesla != null) {
            return _brandTesla!!
        }
        _brandTesla = Builder(name = "BrandTesla", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                lineToRelative(3.0f, -11.0f)
                curveToRelative(2.359f, 0.0f, 3.0f, 0.0f, 3.0f, 1.0f)
                curveToRelative(0.0f, 0.0f, 1.18f, -1.745f, 2.0f, -3.0f)
                curveToRelative(-3.077f, -1.464f, -6.0f, -1.0f, -6.0f, -1.0f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-2.0f, -2.0f)
                reflectiveCurveToRelative(-2.923f, -0.464f, -6.0f, 1.0f)
                curveToRelative(0.82f, 1.255f, 2.0f, 3.0f, 2.0f, 3.0f)
                curveToRelative(0.0f, -1.0f, 0.744f, -1.0f, 3.0f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                curveToRelative(-5.114f, -2.0f, -10.886f, -2.0f, -16.0f, 0.0f)
            }
        }
        .build()
        return _brandTesla!!
    }

private var _brandTesla: ImageVector? = null
