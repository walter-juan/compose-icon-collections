package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.YoutubeFill: ImageVector
    get() {
        if (_youtubeFill != null) {
            return _youtubeFill!!
        }
        _youtubeFill = Builder(name = "YoutubeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.244f, 4.0f)
                curveTo(12.778f, 4.003f, 14.114f, 4.016f, 15.534f, 4.073f)
                lineTo(16.038f, 4.095f)
                curveTo(17.467f, 4.162f, 18.895f, 4.278f, 19.604f, 4.476f)
                curveTo(20.549f, 4.741f, 21.291f, 5.516f, 21.542f, 6.497f)
                curveTo(21.942f, 8.056f, 21.992f, 11.099f, 21.998f, 11.836f)
                lineTo(21.999f, 11.988f)
                lineTo(21.999f, 11.999f)
                curveTo(21.999f, 11.999f, 21.999f, 12.003f, 21.999f, 12.01f)
                lineTo(21.998f, 12.163f)
                curveTo(21.992f, 12.899f, 21.942f, 15.942f, 21.542f, 17.501f)
                curveTo(21.288f, 18.486f, 20.545f, 19.261f, 19.604f, 19.523f)
                curveTo(18.895f, 19.72f, 17.467f, 19.836f, 16.038f, 19.904f)
                lineTo(15.534f, 19.926f)
                curveTo(14.114f, 19.982f, 12.778f, 19.995f, 12.244f, 19.998f)
                lineTo(12.009f, 19.999f)
                lineTo(11.999f, 19.999f)
                curveTo(11.999f, 19.999f, 11.996f, 19.999f, 11.989f, 19.999f)
                lineTo(11.755f, 19.998f)
                curveTo(10.624f, 19.992f, 5.898f, 19.941f, 4.395f, 19.523f)
                curveTo(3.45f, 19.257f, 2.707f, 18.483f, 2.456f, 17.501f)
                curveTo(2.056f, 15.942f, 2.006f, 12.899f, 2.0f, 12.163f)
                verticalLineTo(11.836f)
                curveTo(2.006f, 11.099f, 2.056f, 8.056f, 2.456f, 6.497f)
                curveTo(2.71f, 5.512f, 3.453f, 4.737f, 4.395f, 4.476f)
                curveTo(5.898f, 4.057f, 10.624f, 4.006f, 11.755f, 4.0f)
                horizontalLineTo(12.244f)
                close()
                moveTo(9.999f, 8.499f)
                verticalLineTo(15.499f)
                lineTo(15.999f, 11.999f)
                lineTo(9.999f, 8.499f)
                close()
            }
        }
        .build()
        return _youtubeFill!!
    }

private var _youtubeFill: ImageVector? = null
