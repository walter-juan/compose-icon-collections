package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.LandscapeAiLine: ImageVector
    get() {
        if (_landscapeAiLine != null) {
            return _landscapeAiLine!!
        }
        _landscapeAiLine = Builder(name = "LandscapeAiLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.213f, 8.628f)
                lineTo(5.967f, 9.194f)
                curveTo(5.786f, 9.608f, 5.214f, 9.608f, 5.033f, 9.194f)
                lineTo(4.787f, 8.628f)
                curveTo(4.347f, 7.619f, 3.555f, 6.816f, 2.568f, 6.377f)
                lineTo(1.808f, 6.039f)
                curveTo(1.397f, 5.857f, 1.397f, 5.259f, 1.808f, 5.076f)
                lineTo(2.525f, 4.757f)
                curveTo(3.538f, 4.307f, 4.344f, 3.474f, 4.776f, 2.431f)
                lineTo(5.029f, 1.82f)
                curveTo(5.206f, 1.393f, 5.794f, 1.393f, 5.971f, 1.82f)
                lineTo(6.224f, 2.431f)
                curveTo(6.656f, 3.474f, 7.462f, 4.307f, 8.475f, 4.757f)
                lineTo(9.192f, 5.076f)
                curveTo(9.603f, 5.259f, 9.603f, 5.857f, 9.192f, 6.039f)
                lineTo(8.432f, 6.377f)
                curveTo(7.445f, 6.816f, 6.653f, 7.619f, 6.213f, 8.628f)
                close()
                moveTo(15.0f, 6.0f)
                lineTo(11.27f, 12.216f)
                lineTo(9.0f, 8.0f)
                lineTo(2.0f, 21.0f)
                horizontalLineTo(23.0f)
                lineTo(15.0f, 6.0f)
                close()
                moveTo(14.987f, 19.0f)
                lineTo(12.39f, 14.238f)
                lineTo(14.898f, 10.058f)
                lineTo(19.667f, 19.0f)
                horizontalLineTo(14.987f)
                close()
                moveTo(12.652f, 19.0f)
                horizontalLineTo(5.348f)
                lineTo(9.0f, 12.219f)
                lineTo(12.652f, 19.0f)
                close()
            }
        }
        .build()
        return _landscapeAiLine!!
    }

private var _landscapeAiLine: ImageVector? = null
