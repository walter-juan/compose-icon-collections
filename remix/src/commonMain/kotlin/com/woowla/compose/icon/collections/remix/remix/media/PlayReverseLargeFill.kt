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

public val MediaGroup.PlayReverseLargeFill: ImageVector
    get() {
        if (_playReverseLargeFill != null) {
            return _playReverseLargeFill!!
        }
        _playReverseLargeFill = Builder(name = "PlayReverseLargeFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.196f)
                verticalLineTo(3.804f)
                curveTo(18.0f, 3.019f, 17.136f, 2.54f, 16.47f, 2.956f)
                lineTo(3.357f, 11.152f)
                curveTo(2.73f, 11.544f, 2.73f, 12.456f, 3.357f, 12.848f)
                lineTo(16.47f, 21.044f)
                curveTo(17.136f, 21.46f, 18.0f, 20.981f, 18.0f, 20.196f)
                close()
            }
        }
        .build()
        return _playReverseLargeFill!!
    }

private var _playReverseLargeFill: ImageVector? = null
