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

public val MediaGroup.MemoriesLine: ImageVector
    get() {
        if (_memoriesLine != null) {
            return _memoriesLine!!
        }
        _memoriesLine = Builder(name = "MemoriesLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(8.729f, 2.0f, 5.824f, 3.571f, 4.0f, 5.999f)
                lineTo(4.0f, 3.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.5f)
                lineTo(5.385f, 7.5f)
                curveTo(6.824f, 5.387f, 9.25f, 4.0f, 12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                curveTo(7.582f, 20.0f, 4.0f, 16.418f, 4.0f, 12.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                close()
                moveTo(10.777f, 8.518f)
                lineTo(15.376f, 11.584f)
                curveTo(15.673f, 11.782f, 15.673f, 12.218f, 15.376f, 12.416f)
                lineTo(10.777f, 15.482f)
                curveTo(10.445f, 15.703f, 10.0f, 15.465f, 10.0f, 15.066f)
                verticalLineTo(8.934f)
                curveTo(10.0f, 8.535f, 10.445f, 8.297f, 10.777f, 8.518f)
                close()
            }
        }
        .build()
        return _memoriesLine!!
    }

private var _memoriesLine: ImageVector? = null
