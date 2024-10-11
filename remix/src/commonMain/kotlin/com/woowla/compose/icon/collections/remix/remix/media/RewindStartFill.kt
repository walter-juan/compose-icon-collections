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

public val MediaGroup.RewindStartFill: ImageVector
    get() {
        if (_rewindStartFill != null) {
            return _rewindStartFill!!
        }
        _rewindStartFill = Builder(name = "RewindStartFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                curveTo(1.448f, 4.0f, 1.0f, 4.448f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 19.552f, 1.448f, 20.0f, 2.0f, 20.0f)
                curveTo(2.552f, 20.0f, 3.0f, 19.552f, 3.0f, 19.0f)
                verticalLineTo(13.333f)
                lineTo(12.223f, 19.482f)
                curveTo(12.305f, 19.536f, 12.401f, 19.566f, 12.5f, 19.566f)
                curveTo(12.776f, 19.566f, 13.0f, 19.342f, 13.0f, 19.066f)
                verticalLineTo(13.333f)
                lineTo(22.223f, 19.482f)
                curveTo(22.305f, 19.536f, 22.401f, 19.566f, 22.5f, 19.566f)
                curveTo(22.776f, 19.566f, 23.0f, 19.342f, 23.0f, 19.066f)
                verticalLineTo(4.934f)
                curveTo(23.0f, 4.835f, 22.971f, 4.739f, 22.916f, 4.657f)
                curveTo(22.763f, 4.427f, 22.452f, 4.365f, 22.223f, 4.518f)
                lineTo(13.0f, 10.667f)
                verticalLineTo(4.934f)
                curveTo(13.0f, 4.835f, 12.971f, 4.739f, 12.916f, 4.657f)
                curveTo(12.763f, 4.427f, 12.452f, 4.365f, 12.223f, 4.518f)
                lineTo(3.0f, 10.667f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.448f, 2.552f, 4.0f, 2.0f, 4.0f)
                close()
            }
        }
        .build()
        return _rewindStartFill!!
    }

private var _rewindStartFill: ImageVector? = null
