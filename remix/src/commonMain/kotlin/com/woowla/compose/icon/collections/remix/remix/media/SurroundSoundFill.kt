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

public val MediaGroup.SurroundSoundFill: ImageVector
    get() {
        if (_surroundSoundFill != null) {
            return _surroundSoundFill!!
        }
        _surroundSoundFill = Builder(name = "SurroundSoundFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(7.05f, 7.121f)
                curveTo(5.784f, 8.388f, 5.0f, 10.138f, 5.0f, 12.071f)
                curveTo(5.0f, 14.004f, 5.784f, 15.754f, 7.05f, 17.021f)
                lineTo(8.464f, 15.607f)
                curveTo(7.56f, 14.702f, 7.0f, 13.452f, 7.0f, 12.071f)
                curveTo(7.0f, 10.69f, 7.56f, 9.44f, 8.464f, 8.536f)
                lineTo(7.05f, 7.121f)
                close()
                moveTo(16.95f, 7.121f)
                lineTo(15.535f, 8.536f)
                curveTo(16.44f, 9.44f, 17.0f, 10.69f, 17.0f, 12.071f)
                curveTo(17.0f, 13.452f, 16.44f, 14.702f, 15.535f, 15.607f)
                lineTo(16.95f, 17.021f)
                curveTo(18.216f, 15.754f, 19.0f, 14.004f, 19.0f, 12.071f)
                curveTo(19.0f, 10.138f, 18.216f, 8.388f, 16.95f, 7.121f)
                close()
                moveTo(12.0f, 15.071f)
                curveTo(13.657f, 15.071f, 15.0f, 13.728f, 15.0f, 12.071f)
                curveTo(15.0f, 10.414f, 13.657f, 9.071f, 12.0f, 9.071f)
                curveTo(10.343f, 9.071f, 9.0f, 10.414f, 9.0f, 12.071f)
                curveTo(9.0f, 13.728f, 10.343f, 15.071f, 12.0f, 15.071f)
                close()
                moveTo(12.0f, 13.071f)
                curveTo(11.448f, 13.071f, 11.0f, 12.623f, 11.0f, 12.071f)
                curveTo(11.0f, 11.519f, 11.448f, 11.071f, 12.0f, 11.071f)
                curveTo(12.552f, 11.071f, 13.0f, 11.519f, 13.0f, 12.071f)
                curveTo(13.0f, 12.623f, 12.552f, 13.071f, 12.0f, 13.071f)
                close()
            }
        }
        .build()
        return _surroundSoundFill!!
    }

private var _surroundSoundFill: ImageVector? = null
