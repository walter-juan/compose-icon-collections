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

public val MediaGroup.SpeakerLine: ImageVector
    get() {
        if (_speakerLine != null) {
            return _speakerLine!!
        }
        _speakerLine = Builder(name = "SpeakerLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                close()
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
                moveTo(12.0f, 17.0f)
                curveTo(13.381f, 17.0f, 14.5f, 15.881f, 14.5f, 14.5f)
                curveTo(14.5f, 13.119f, 13.381f, 12.0f, 12.0f, 12.0f)
                curveTo(10.619f, 12.0f, 9.5f, 13.119f, 9.5f, 14.5f)
                curveTo(9.5f, 15.881f, 10.619f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveTo(9.515f, 19.0f, 7.5f, 16.985f, 7.5f, 14.5f)
                curveTo(7.5f, 12.015f, 9.515f, 10.0f, 12.0f, 10.0f)
                curveTo(14.485f, 10.0f, 16.5f, 12.015f, 16.5f, 14.5f)
                curveTo(16.5f, 16.985f, 14.485f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(12.0f, 8.5f)
                curveTo(11.172f, 8.5f, 10.5f, 7.828f, 10.5f, 7.0f)
                curveTo(10.5f, 6.172f, 11.172f, 5.5f, 12.0f, 5.5f)
                curveTo(12.828f, 5.5f, 13.5f, 6.172f, 13.5f, 7.0f)
                curveTo(13.5f, 7.828f, 12.828f, 8.5f, 12.0f, 8.5f)
                close()
            }
        }
        .build()
        return _speakerLine!!
    }

private var _speakerLine: ImageVector? = null
