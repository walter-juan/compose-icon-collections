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

public val MediaGroup.PlayReverseLargeLine: ImageVector
    get() {
        if (_playReverseLargeLine != null) {
            return _playReverseLargeLine!!
        }
        _playReverseLargeLine = Builder(name = "PlayReverseLargeLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 18.392f)
                verticalLineTo(5.608f)
                lineTo(5.774f, 12.0f)
                lineTo(16.0f, 18.392f)
                close()
                moveTo(18.0f, 3.804f)
                verticalLineTo(20.196f)
                curveTo(18.0f, 20.981f, 17.136f, 21.46f, 16.47f, 21.044f)
                lineTo(3.357f, 12.848f)
                curveTo(2.73f, 12.456f, 2.73f, 11.544f, 3.357f, 11.152f)
                lineTo(16.47f, 2.956f)
                curveTo(17.136f, 2.54f, 18.0f, 3.019f, 18.0f, 3.804f)
                close()
            }
        }
        .build()
        return _playReverseLargeLine!!
    }

private var _playReverseLargeLine: ImageVector? = null
