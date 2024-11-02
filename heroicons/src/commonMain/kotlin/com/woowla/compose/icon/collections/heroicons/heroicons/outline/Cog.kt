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

public val OutlineGroup.Cog: ImageVector
    get() {
        if (_cog != null) {
            return _cog!!
        }
        _cog = Builder(name = "Cog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.501f, 11.999f)
                curveTo(4.501f, 16.141f, 7.859f, 19.499f, 12.001f, 19.499f)
                curveTo(16.143f, 19.499f, 19.501f, 16.141f, 19.501f, 11.999f)
                moveTo(4.501f, 11.999f)
                curveTo(4.501f, 7.857f, 7.859f, 4.499f, 12.001f, 4.499f)
                curveTo(16.143f, 4.499f, 19.501f, 7.857f, 19.501f, 11.999f)
                moveTo(4.501f, 11.999f)
                lineTo(3.001f, 11.999f)
                moveTo(19.501f, 11.999f)
                lineTo(21.001f, 11.999f)
                moveTo(19.501f, 11.999f)
                lineTo(12.001f, 11.999f)
                moveTo(3.543f, 15.077f)
                lineTo(4.953f, 14.564f)
                moveTo(19.048f, 9.434f)
                lineTo(20.458f, 8.921f)
                moveTo(5.106f, 17.785f)
                lineTo(6.255f, 16.821f)
                moveTo(17.746f, 7.179f)
                lineTo(18.895f, 6.215f)
                moveTo(7.501f, 19.794f)
                lineTo(8.251f, 18.495f)
                moveTo(15.751f, 5.505f)
                lineTo(16.501f, 4.206f)
                moveTo(10.438f, 20.863f)
                lineTo(10.698f, 19.386f)
                moveTo(13.303f, 4.614f)
                lineTo(13.564f, 3.137f)
                moveTo(13.564f, 20.863f)
                lineTo(13.303f, 19.386f)
                moveTo(10.698f, 4.614f)
                lineTo(10.438f, 3.137f)
                moveTo(16.501f, 19.794f)
                lineTo(15.751f, 18.495f)
                moveTo(7.501f, 4.206f)
                lineTo(12.001f, 11.999f)
                moveTo(18.895f, 17.784f)
                lineTo(17.746f, 16.82f)
                moveTo(6.255f, 7.178f)
                lineTo(5.106f, 6.214f)
                moveTo(20.458f, 15.078f)
                lineTo(19.049f, 14.565f)
                moveTo(4.953f, 9.434f)
                lineTo(3.544f, 8.921f)
                moveTo(12.001f, 11.999f)
                lineTo(8.251f, 18.494f)
            }
        }
        .build()
        return _cog!!
    }

private var _cog: ImageVector? = null
