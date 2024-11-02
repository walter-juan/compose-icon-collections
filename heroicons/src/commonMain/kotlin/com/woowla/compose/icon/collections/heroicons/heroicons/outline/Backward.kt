package com.woowla.compose.icon.collections.heroicons.heroicons.outline

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
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Backward: ImageVector
    get() {
        if (_backward != null) {
            return _backward!!
        }
        _backward = Builder(name = "Backward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 16.812f)
                curveTo(21.0f, 17.675f, 20.067f, 18.217f, 19.317f, 17.788f)
                lineTo(12.209f, 13.727f)
                curveTo(11.454f, 13.295f, 11.454f, 12.205f, 12.209f, 11.773f)
                lineTo(19.317f, 7.712f)
                curveTo(20.067f, 7.283f, 21.0f, 7.825f, 21.0f, 8.689f)
                verticalLineTo(16.812f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.25f, 16.812f)
                curveTo(11.25f, 17.675f, 10.317f, 18.217f, 9.567f, 17.788f)
                lineTo(2.459f, 13.727f)
                curveTo(1.704f, 13.295f, 1.704f, 12.205f, 2.459f, 11.773f)
                lineTo(9.567f, 7.712f)
                curveTo(10.317f, 7.283f, 11.25f, 7.825f, 11.25f, 8.689f)
                lineTo(11.25f, 16.812f)
                close()
            }
        }
        .build()
        return _backward!!
    }

private var _backward: ImageVector? = null
