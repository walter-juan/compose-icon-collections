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

public val MediaGroup.RewindFill: ImageVector
    get() {
        if (_rewindFill != null) {
            return _rewindFill!!
        }
        _rewindFill = Builder(name = "RewindFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.667f)
                lineTo(21.223f, 4.518f)
                curveTo(21.452f, 4.365f, 21.763f, 4.427f, 21.916f, 4.657f)
                curveTo(21.971f, 4.739f, 22.0f, 4.836f, 22.0f, 4.934f)
                verticalLineTo(19.066f)
                curveTo(22.0f, 19.342f, 21.776f, 19.566f, 21.5f, 19.566f)
                curveTo(21.401f, 19.566f, 21.305f, 19.537f, 21.223f, 19.482f)
                lineTo(12.0f, 13.333f)
                verticalLineTo(19.066f)
                curveTo(12.0f, 19.342f, 11.776f, 19.566f, 11.5f, 19.566f)
                curveTo(11.401f, 19.566f, 11.305f, 19.537f, 11.223f, 19.482f)
                lineTo(0.624f, 12.416f)
                curveTo(0.394f, 12.263f, 0.332f, 11.952f, 0.485f, 11.723f)
                curveTo(0.522f, 11.668f, 0.569f, 11.621f, 0.624f, 11.584f)
                lineTo(11.223f, 4.518f)
                curveTo(11.452f, 4.365f, 11.763f, 4.427f, 11.916f, 4.657f)
                curveTo(11.971f, 4.739f, 12.0f, 4.836f, 12.0f, 4.934f)
                verticalLineTo(10.667f)
                close()
            }
        }
        .build()
        return _rewindFill!!
    }

private var _rewindFill: ImageVector? = null
