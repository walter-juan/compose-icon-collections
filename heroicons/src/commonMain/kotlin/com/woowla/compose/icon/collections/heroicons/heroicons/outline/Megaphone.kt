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

public val OutlineGroup.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.34f, 15.84f)
                curveTo(9.652f, 15.78f, 8.954f, 15.75f, 8.25f, 15.75f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 15.75f, 3.0f, 13.735f, 3.0f, 11.25f)
                curveTo(3.0f, 8.765f, 5.015f, 6.75f, 7.5f, 6.75f)
                horizontalLineTo(8.25f)
                curveTo(8.954f, 6.75f, 9.652f, 6.72f, 10.34f, 6.66f)
                moveTo(10.34f, 15.84f)
                curveTo(10.593f, 16.802f, 10.924f, 17.732f, 11.325f, 18.623f)
                curveTo(11.572f, 19.174f, 11.384f, 19.833f, 10.862f, 20.135f)
                lineTo(10.205f, 20.513f)
                curveTo(9.654f, 20.832f, 8.946f, 20.631f, 8.678f, 20.053f)
                curveTo(8.052f, 18.697f, 7.565f, 17.264f, 7.238f, 15.771f)
                moveTo(10.34f, 15.84f)
                curveTo(9.955f, 14.375f, 9.75f, 12.836f, 9.75f, 11.25f)
                curveTo(9.75f, 9.664f, 9.955f, 8.125f, 10.34f, 6.66f)
                moveTo(10.34f, 15.84f)
                curveTo(13.5f, 16.112f, 16.485f, 16.997f, 19.175f, 18.375f)
                moveTo(10.34f, 6.66f)
                curveTo(13.5f, 6.388f, 16.485f, 5.503f, 19.175f, 4.125f)
                moveTo(19.175f, 4.125f)
                curveTo(19.057f, 3.746f, 18.93f, 3.371f, 18.794f, 3.0f)
                moveTo(19.175f, 4.125f)
                curveTo(19.71f, 5.848f, 20.056f, 7.655f, 20.189f, 9.52f)
                moveTo(19.175f, 18.375f)
                curveTo(19.057f, 18.754f, 18.93f, 19.129f, 18.794f, 19.5f)
                moveTo(19.175f, 18.375f)
                curveTo(19.71f, 16.652f, 20.056f, 14.845f, 20.189f, 12.98f)
                moveTo(20.189f, 9.52f)
                curveTo(20.684f, 9.933f, 21.0f, 10.554f, 21.0f, 11.25f)
                curveTo(21.0f, 11.946f, 20.684f, 12.567f, 20.189f, 12.98f)
                moveTo(20.189f, 9.52f)
                curveTo(20.229f, 10.091f, 20.25f, 10.668f, 20.25f, 11.25f)
                curveTo(20.25f, 11.832f, 20.229f, 12.409f, 20.189f, 12.98f)
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
