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

public val OutlineGroup.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineTo(20.25f)
                moveTo(12.0f, 20.25f)
                curveTo(10.528f, 20.25f, 9.118f, 20.515f, 7.815f, 21.0f)
                moveTo(12.0f, 20.25f)
                curveTo(13.472f, 20.25f, 14.882f, 20.515f, 16.185f, 21.0f)
                moveTo(18.75f, 4.971f)
                curveTo(16.545f, 4.661f, 14.291f, 4.5f, 12.0f, 4.5f)
                curveTo(9.709f, 4.5f, 7.455f, 4.661f, 5.25f, 4.971f)
                moveTo(18.75f, 4.971f)
                curveTo(19.76f, 5.113f, 20.761f, 5.287f, 21.75f, 5.491f)
                moveTo(18.75f, 4.971f)
                lineTo(21.37f, 15.696f)
                curveTo(21.492f, 16.195f, 21.264f, 16.724f, 20.781f, 16.897f)
                curveTo(20.147f, 17.126f, 19.463f, 17.25f, 18.75f, 17.25f)
                curveTo(18.037f, 17.25f, 17.353f, 17.126f, 16.719f, 16.897f)
                curveTo(16.236f, 16.724f, 16.008f, 16.195f, 16.13f, 15.696f)
                lineTo(18.75f, 4.971f)
                close()
                moveTo(2.25f, 5.491f)
                curveTo(3.239f, 5.287f, 4.24f, 5.113f, 5.25f, 4.971f)
                moveTo(5.25f, 4.971f)
                lineTo(7.87f, 15.696f)
                curveTo(7.992f, 16.195f, 7.764f, 16.724f, 7.281f, 16.897f)
                curveTo(6.647f, 17.126f, 5.963f, 17.25f, 5.25f, 17.25f)
                curveTo(4.537f, 17.25f, 3.853f, 17.126f, 3.219f, 16.897f)
                curveTo(2.736f, 16.724f, 2.508f, 16.195f, 2.63f, 15.696f)
                lineTo(5.25f, 4.971f)
                close()
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
