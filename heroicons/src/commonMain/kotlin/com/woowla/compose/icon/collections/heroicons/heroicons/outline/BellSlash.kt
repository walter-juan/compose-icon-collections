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

public val OutlineGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.143f, 17.082f)
                curveTo(10.08f, 17.193f, 11.033f, 17.25f, 12.0f, 17.25f)
                curveTo(12.331f, 17.25f, 12.66f, 17.243f, 12.987f, 17.23f)
                moveTo(9.143f, 17.082f)
                curveTo(7.248f, 16.857f, 5.421f, 16.412f, 3.688f, 15.772f)
                curveTo(5.025f, 14.288f, 5.875f, 12.357f, 5.987f, 10.23f)
                moveTo(9.143f, 17.082f)
                curveTo(9.05f, 17.371f, 9.0f, 17.68f, 9.0f, 18.0f)
                curveTo(9.0f, 19.657f, 10.343f, 21.0f, 12.0f, 21.0f)
                curveTo(13.286f, 21.0f, 14.384f, 20.19f, 14.81f, 19.053f)
                moveTo(16.775f, 16.775f)
                lineTo(21.0f, 21.0f)
                moveTo(16.775f, 16.775f)
                curveTo(17.989f, 16.53f, 19.171f, 16.193f, 20.311f, 15.772f)
                curveTo(18.874f, 14.177f, 18.0f, 12.066f, 18.0f, 9.75f)
                verticalLineTo(9.049f)
                lineTo(18.0f, 9.0f)
                curveTo(18.0f, 5.686f, 15.314f, 3.0f, 12.0f, 3.0f)
                curveTo(9.567f, 3.0f, 7.472f, 4.448f, 6.53f, 6.53f)
                moveTo(16.775f, 16.775f)
                lineTo(6.53f, 6.53f)
                moveTo(3.0f, 3.0f)
                lineTo(6.53f, 6.53f)
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
