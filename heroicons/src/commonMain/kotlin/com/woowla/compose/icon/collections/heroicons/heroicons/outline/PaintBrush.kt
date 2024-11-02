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

public val OutlineGroup.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.531f, 16.122f)
                curveTo(9.085f, 15.024f, 8.008f, 14.25f, 6.75f, 14.25f)
                curveTo(5.093f, 14.25f, 3.75f, 15.593f, 3.75f, 17.25f)
                curveTo(3.75f, 18.493f, 2.743f, 19.5f, 1.5f, 19.5f)
                curveTo(1.449f, 19.5f, 1.399f, 19.498f, 1.349f, 19.495f)
                curveTo(2.126f, 20.843f, 3.582f, 21.75f, 5.25f, 21.75f)
                curveTo(7.728f, 21.75f, 9.739f, 19.747f, 9.75f, 17.271f)
                curveTo(9.75f, 17.264f, 9.75f, 17.257f, 9.75f, 17.25f)
                curveTo(9.75f, 16.851f, 9.672f, 16.471f, 9.531f, 16.122f)
                close()
                moveTo(9.531f, 16.122f)
                curveTo(10.725f, 15.715f, 11.861f, 15.17f, 12.917f, 14.503f)
                moveTo(7.875f, 14.477f)
                curveTo(8.282f, 13.28f, 8.828f, 12.141f, 9.497f, 11.083f)
                moveTo(12.917f, 14.503f)
                curveTo(14.798f, 13.314f, 16.426f, 11.736f, 17.681f, 9.854f)
                lineTo(21.557f, 4.04f)
                curveTo(21.683f, 3.851f, 21.75f, 3.629f, 21.75f, 3.401f)
                curveTo(21.75f, 2.765f, 21.235f, 2.25f, 20.599f, 2.25f)
                curveTo(20.371f, 2.25f, 20.149f, 2.317f, 19.96f, 2.443f)
                lineTo(14.146f, 6.319f)
                curveTo(12.264f, 7.574f, 10.686f, 9.202f, 9.497f, 11.083f)
                moveTo(12.917f, 14.503f)
                curveTo(12.24f, 12.983f, 11.017f, 11.76f, 9.497f, 11.083f)
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
