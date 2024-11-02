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

public val OutlineGroup.HandThumbUp: ImageVector
    get() {
        if (_handThumbUp != null) {
            return _handThumbUp!!
        }
        _handThumbUp = Builder(name = "HandThumbUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.633f, 10.25f)
                curveTo(7.439f, 10.25f, 8.166f, 9.804f, 8.664f, 9.17f)
                curveTo(9.437f, 8.184f, 10.412f, 7.363f, 11.526f, 6.77f)
                curveTo(12.248f, 6.386f, 12.874f, 5.814f, 13.178f, 5.055f)
                curveTo(13.391f, 4.523f, 13.5f, 3.956f, 13.5f, 3.383f)
                verticalLineTo(2.75f)
                curveTo(13.5f, 2.336f, 13.836f, 2.0f, 14.25f, 2.0f)
                curveTo(15.493f, 2.0f, 16.5f, 3.007f, 16.5f, 4.25f)
                curveTo(16.5f, 5.402f, 16.24f, 6.493f, 15.777f, 7.468f)
                curveTo(15.511f, 8.026f, 15.884f, 8.75f, 16.502f, 8.75f)
                moveTo(16.502f, 8.75f)
                horizontalLineTo(19.628f)
                curveTo(20.654f, 8.75f, 21.573f, 9.444f, 21.682f, 10.465f)
                curveTo(21.727f, 10.887f, 21.75f, 11.316f, 21.75f, 11.75f)
                curveTo(21.75f, 14.598f, 20.758f, 17.214f, 19.101f, 19.271f)
                curveTo(18.713f, 19.753f, 18.114f, 20.0f, 17.496f, 20.0f)
                horizontalLineTo(13.48f)
                curveTo(12.997f, 20.0f, 12.516f, 19.922f, 12.057f, 19.769f)
                lineTo(8.943f, 18.731f)
                curveTo(8.484f, 18.578f, 8.003f, 18.5f, 7.52f, 18.5f)
                horizontalLineTo(5.904f)
                moveTo(16.502f, 8.75f)
                horizontalLineTo(14.25f)
                moveTo(5.904f, 18.5f)
                curveTo(5.987f, 18.705f, 6.077f, 18.905f, 6.174f, 19.102f)
                curveTo(6.371f, 19.502f, 6.096f, 20.0f, 5.651f, 20.0f)
                horizontalLineTo(4.743f)
                curveTo(3.854f, 20.0f, 3.03f, 19.482f, 2.771f, 18.632f)
                curveTo(2.432f, 17.523f, 2.25f, 16.345f, 2.25f, 15.125f)
                curveTo(2.25f, 13.573f, 2.545f, 12.089f, 3.081f, 10.727f)
                curveTo(3.387f, 9.953f, 4.167f, 9.5f, 4.999f, 9.5f)
                horizontalLineTo(6.052f)
                curveTo(6.524f, 9.5f, 6.797f, 10.056f, 6.552f, 10.459f)
                curveTo(5.726f, 11.82f, 5.25f, 13.417f, 5.25f, 15.125f)
                curveTo(5.25f, 16.319f, 5.482f, 17.458f, 5.904f, 18.5f)
                close()
            }
        }
        .build()
        return _handThumbUp!!
    }

private var _handThumbUp: ImageVector? = null
