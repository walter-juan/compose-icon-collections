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

public val MediaGroup.SpeakerFill: ImageVector
    get() {
        if (_speakerFill != null) {
            return _speakerFill!!
        }
        _speakerFill = Builder(name = "SpeakerFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.448f, 3.448f, 2.0f, 4.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(14.761f, 20.0f, 17.0f, 17.761f, 17.0f, 15.0f)
                curveTo(17.0f, 12.239f, 14.761f, 10.0f, 12.0f, 10.0f)
                curveTo(9.239f, 10.0f, 7.0f, 12.239f, 7.0f, 15.0f)
                curveTo(7.0f, 17.761f, 9.239f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(12.828f, 8.0f, 13.5f, 7.328f, 13.5f, 6.5f)
                curveTo(13.5f, 5.672f, 12.828f, 5.0f, 12.0f, 5.0f)
                curveTo(11.172f, 5.0f, 10.5f, 5.672f, 10.5f, 6.5f)
                curveTo(10.5f, 7.328f, 11.172f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(10.343f, 18.0f, 9.0f, 16.657f, 9.0f, 15.0f)
                curveTo(9.0f, 13.343f, 10.343f, 12.0f, 12.0f, 12.0f)
                curveTo(13.657f, 12.0f, 15.0f, 13.343f, 15.0f, 15.0f)
                curveTo(15.0f, 16.657f, 13.657f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _speakerFill!!
    }

private var _speakerFill: ImageVector? = null
