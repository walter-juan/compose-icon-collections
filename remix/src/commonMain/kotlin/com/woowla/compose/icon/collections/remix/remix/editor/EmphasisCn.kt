package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.EmphasisCn: ImageVector
    get() {
        if (_emphasisCn != null) {
            return _emphasisCn!!
        }
        _emphasisCn = Builder(name = "EmphasisCn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(12.828f, 19.0f, 13.5f, 19.672f, 13.5f, 20.5f)
                curveTo(13.5f, 21.328f, 12.828f, 22.0f, 12.0f, 22.0f)
                curveTo(11.172f, 22.0f, 10.5f, 21.328f, 10.5f, 20.5f)
                curveTo(10.5f, 19.672f, 11.172f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(6.5f, 19.0f)
                curveTo(7.328f, 19.0f, 8.0f, 19.672f, 8.0f, 20.5f)
                curveTo(8.0f, 21.328f, 7.328f, 22.0f, 6.5f, 22.0f)
                curveTo(5.672f, 22.0f, 5.0f, 21.328f, 5.0f, 20.5f)
                curveTo(5.0f, 19.672f, 5.672f, 19.0f, 6.5f, 19.0f)
                close()
                moveTo(17.5f, 19.0f)
                curveTo(18.328f, 19.0f, 19.0f, 19.672f, 19.0f, 20.5f)
                curveTo(19.0f, 21.328f, 18.328f, 22.0f, 17.5f, 22.0f)
                curveTo(16.672f, 22.0f, 16.0f, 21.328f, 16.0f, 20.5f)
                curveTo(16.0f, 19.672f, 16.672f, 19.0f, 17.5f, 19.0f)
                close()
                moveTo(13.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                lineTo(17.032f, 6.001f)
                curveTo(16.242f, 8.367f, 14.998f, 10.507f, 13.411f, 12.302f)
                curveTo(14.954f, 13.674f, 16.762f, 14.72f, 18.738f, 15.344f)
                lineTo(18.202f, 17.274f)
                curveTo(15.892f, 16.556f, 13.787f, 15.333f, 12.0f, 13.726f)
                curveTo(10.214f, 15.332f, 8.109f, 16.555f, 5.799f, 17.273f)
                lineTo(5.263f, 15.344f)
                curveTo(7.239f, 14.72f, 9.045f, 13.674f, 10.59f, 12.302f)
                curveTo(9.463f, 11.028f, 8.509f, 9.581f, 7.768f, 8.001f)
                lineTo(10.007f, 8.001f)
                curveTo(10.571f, 9.04f, 11.24f, 10.004f, 12.0f, 10.877f)
                curveTo(13.228f, 9.465f, 14.22f, 7.816f, 14.91f, 6.001f)
                lineTo(5.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _emphasisCn!!
    }

private var _emphasisCn: ImageVector? = null
